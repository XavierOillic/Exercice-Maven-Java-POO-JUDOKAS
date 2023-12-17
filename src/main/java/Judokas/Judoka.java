package Judokas;

import java.util.Random;

import impl.Energie;
import impl.Fatigue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Getter
@Setter

public abstract class Judoka {
	
	Random random = new Random();
	int rdm = random.nextInt(0, 20);
	
	private String firstName;
	//private int weight;
	
	private int ippon = rdm; // ========>  10 au random VICTOIRE
	private int waza_ari = rdm; // ======> 14 au random VICTOIRE 
	private int kinza = rdm; // ========>  5 au random, pas encore de VICTOIRE
	
	private int failedAttack = rdm; //===> 0 au random ECHEC CRITIQUE
	
	private int gooddefend = rdm; // ========= > 20 for a good defense
	private int goodAttack = rdm; // ======> 19 for a good Attack
	
	private int shido = rdm; // ==========> 3 au random : Simule 3 shidos PERDUS !
	
	private boolean defeat;
	private boolean victory;

	Fatigue fatigue = new Fatigue(5);
	Energie energie = new Energie(100);
	
	public void tryToWin () {
		if (goodAttack == 17 && goodAttack == 18) {
			this.waza_ari += 7;
			if (ippon == 10 || waza_ari == 14) {
				this.victory = true;
			}
			if (ippon == 0 || waza_ari == 0 && kinza == 5) {
				this.victory = true;
			}
		}
		
	}
	
	public void tryDefend () {
		if (gooddefend == 19 && gooddefend == 20) {
			if (failedAttack == 0) {
				if (ippon == 0 || waza_ari == 0 && kinza == 0) {
					this.victory = false;
				}
			}
		}	
		
	}

	public void Loose (boolean defeat, int shido) {
		for (int i = 0; i <= 3; i++) {
			this.shido += 1;
				if (shido == 3) {
					this.defeat = true;
				}
		}
		
	}
	
	
	public void breatheDifficult (int energie, int fatigue) {
		energie -= fatigue;
			if (energie <= 20) {
				this.ippon = 10;
			}
			this.defeat = true;
	}
	
	public void recover (int energie, int fatigue) {
		fatigue += energie;
			if (energie > 50) {
				this.defeat = false;
			}
	}
	
	
}

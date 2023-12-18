package Judokas;

import java.util.Random;

import impl.Energie;
import impl.Fatigue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public abstract class Judoka {
	
	Random random = new Random();
	
	private String firstName;
	private int ranking = random.nextInt(1, 10); // En fonction de son ranking le judoka gagnera.
	
	//private int weight;
	
	// ========>>>>> 0 : ECHEC CRITIQUE POUR TOUS !
	
	private int ippon = random.nextInt(0, 20); // >  10 au random VICTOIRE
	private int waza_ari = random.nextInt(0, 20); // > 14 au random VICTOIRE 
	private int kinza = random.nextInt(0, 20); // >  5 au random, pas encore de VICTOIRE
	
	private int defend = random.nextInt(0, 20); // > 16, 18, 20 for a good defense // 0 ECHEC CRITIQUE
	private int attack = random.nextInt(0, 20); // > 15, 17, 19 for a good Attack // 0 ECHEC CRITIQUE
	
	private int shido = random.nextInt(0, 20); // > 1 au random : Simule 3 shidos PERDUS !
	
	private boolean defeat;
	private boolean victory;
	
	Fatigue fatigue = new Fatigue(5);
	Energie energie = new Energie(100);
	
	
	public void tryToWin () {
		if (attack == 17 && attack == 19) {
			this.waza_ari += 7;
			
			if (ippon == 10 || waza_ari == 14) {
				
				if (ippon == 0 || waza_ari == 0 && kinza == 5) {
					
					if (ranking <= 3) {
						this.victory = true;
					}
				}
			}	
		}	
	}
	
	public void tryDefend () {
		if (defend == 18 && defend == 20) {
			
			if (attack == 0) {
					
					if (ranking >= 4) {
						this.victory = false;
					}
				}
			}
		}	


	public void penalise () {
		for (int i = 0; i <= 3; i++) {
			this.shido += 1;
				if (shido == 3) {
					this.defeat = true;
				}
		}	
	}
	
	
	
	public void breatheDifficult (int energie, int fatigue) {
		energie -= fatigue;
			if (energie <= 10) {
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

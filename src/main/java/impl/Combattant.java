package impl;

import Judokas.Judoka;
import Judokas.Tori;
import Judokas.Uke;

public class Combattant extends Judoka implements Tori, Uke {

	Combattant() {
		super();
		// TODO Auto-generated constructor stub
	}


//////////////////////////////// UKE ICI
	@Override
	public void moveToDefend(Judoka uke) {
		uke.tryDefend();
		
	}

	@Override
	public void dodge(Judoka tori) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void counter(Judoka tori) {
		// TODO Auto-generated method stub
		
	}

	
	//////////////////////////////// TORI CI DESSOUS

	@Override
	public void attack(Judoka tori, Judoka uke) {
		tori.tryToWin();
		
	}

	@Override
	public void moveToAttack(Judoka tori, Judoka uke) {
		tori.tryToWin();
		
	}


	@Override
	public void breathToRecover(int energie, int fatigue, Judoka judoka) {
	
		
	}



	@Override
	public void breathDifficult(int energie, int fatigue, Judoka judoka) {
		// TODO Auto-generated method stub
		
	}}

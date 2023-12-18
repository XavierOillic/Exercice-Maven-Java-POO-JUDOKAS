package impl;

import Judokas.Judoka;
import Judokas.Tori;
import Judokas.Uke;

public class Combattant extends Judoka implements Tori, Uke {

	Combattant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveToDefend(Judoka uke) {
		uke.tryDefend();
		
	}

	@Override
	public void dodge(Judoka uke, Judoka tori) {
		uke.tryDefend();
		tori.getAttack();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void counterThenAttack(Judoka uke, Judoka tori) {
		// TODO Auto-generated method stub	
		uke.tryDefend();
		tori.getAttack();
	}

	@Override
	public void attack(Judoka tori, Judoka uke) {
		tori.tryToWin();
		
	}

	@Override
	public void breathToRecover(int energie, int fatigue, Judoka judoka) {
	
		
	}



	@Override
	public void breathDifficult(int energie, int fatigue, Judoka judoka) {
		// TODO Auto-generated method stub
		
	}}

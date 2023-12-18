package Judokas;

public interface Tori {
		void attack(Judoka tori, Judoka uke);
		
		void breathToRecover (int energie, int fatigue, Judoka judoka);
		
		void breathDifficult(int energie, int fatigue, Judoka judoka);
}

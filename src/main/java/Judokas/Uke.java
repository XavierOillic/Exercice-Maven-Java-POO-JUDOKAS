package Judokas;

public interface Uke {
	
		void moveToDefend(Judoka uke);
		
		void dodge (Judoka uke, Judoka tori);
		
		void counterThenAttack(Judoka uke, Judoka tori);
		
}

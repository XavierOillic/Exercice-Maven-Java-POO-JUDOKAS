package Judokas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Personne {
	
	private String firstName;
	private String name;
	
	private int weight;
	
	Personne (String firstName, String name, int weight) {
			this.firstName = firstName;
			this.name = name;
			this.weight = weight;
	}

}

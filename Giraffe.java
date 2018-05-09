package chapter1;

public class Giraffe extends Animal {
	
	// Giraffe's constructor
	public Giraffe() {
		this.setName("Giraffe");
	}
	
	@Override 
	public String getWeight() {
		return "2 tons";
	}
}

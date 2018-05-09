package chapter1;

public class Elephant extends Animal{
	
	/* Elephant's constructor */
	public Elephant() {
		this.setName("Elephant");
	}
	
	@Override 
	public String getWeight() {
		return "3 tons";
	}
}

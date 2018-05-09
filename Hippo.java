package chapter1;

public class Hippo extends Animal{
	
	// Hippo's constructor
	public Hippo() {
		this.setName("Hippo");
	}
	
	@Override 
	public String getWeight() {
		return "1 ton";
	}
}

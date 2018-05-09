package chapter1;
import java.util.ArrayList;

public class Zoo {
	public static void main(String[] args) {
		
		/* An ArrayList is a Java collection, which is a
		 * container for objects.  */
		ArrayList<Animal> animals = new ArrayList<>();
		
		// populate the animals ArrayList
		animals.add(new Hippo());
		animals.add(new Giraffe());
		animals.add(new Elephant());
		
		/* iterate through the animals ArrayList, and 
		   display to the console. */
		for (Animal animal : animals) {
			System.out.println(animal.getName()+", Weight: "+animal.getWeight());
		}
	}
}

/** 
 * This is the Animal SuperClass.
 * @author Terry Dixon
 * @version 1.0
 * 
 * */

package chapter1;

public class Animal {
	private String name;

	/** 
	 * This method returns the animal's name.
	 * @return String name
	 * */
	public String getName() {
		return name;
	}
	/** 
	 * This method sets the animal's name. 
	 * @param String name
	 * */
	public void setName(String name) {
		this.name = name;
	}
	// This method will need to be overriden by 
	// implementing SubClasses
	public String getWeight() {
		return null;
	} 
}

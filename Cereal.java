/*
 * Function: displays the message for each cereal
 * Function: creates name and price variables 
 * Return: displays all messages
 */
public abstract class Cereal {
	protected String name;
	protected double price;
	/*
	 * Function: displays the prepare message
	 */
	public void prepare() {
		System.out.println("Preparing the " + name); 
	}
	/*
	 * Function: displays the boxCereal message 
	 */
	public void boxCereal() {
		System.out.println("Putting fun pictures of "
				+ name +"on a box, Pouring the " + 
				name + "into the box ");
	}
	/*
	 * Function: displays the priceCereal message
	 */
	public void priceCereal() {
		System.out.println("Putting price tags of $" + 
	       price + " on the " + name + "box");
	}
}

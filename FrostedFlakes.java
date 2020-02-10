/*
 * Function: displays the message for preparing Frosted flakes
 * Function: displays the price of the Frosted Flakes
 */
public class FrostedFlakes extends Cereal {
	public FrostedFlakes() {
		name = "Frosted Flakes ";
		price = 2.99;
	}
	/*
	 * Function: displays the messages for the prepare method
	 */
	public void prepare() {
		super.prepare();
		System.out.println(" - Gather the grain");
		System.out.println(" - Shape into flakes");
		System.out.println(" - Sprinkle with frosting");
	}
}

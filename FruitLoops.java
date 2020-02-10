/*
 * Function: displays the prepare message for FruitLoops
 * Function: gives the price and name of fruit loops
 */
public class FruitLoops extends Cereal {
	public FruitLoops() {
		name = "Fruit loops ";
		price = 1.89 ;
	}
	/*
	 * Function: displays the prepare message for Fruit loops
	 */
	public void prepare() {
		super.prepare();
		System.out.println(" - Gather the grains");
		System.out.println(" - Shape into circles");
		System.out.println(" - Randomly color circles");
		System.out.println(" - Let circles dry");
	}
}

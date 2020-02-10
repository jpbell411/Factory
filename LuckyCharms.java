/*
 * Function: displays the prepare message for Lucky charms
 * Function: get the name and price of Lucky Charms
 */
public class LuckyCharms extends Cereal {
	public LuckyCharms() {
		name = "Lucky Charms ";
		price = 1.55;
	}
 /*
  * Function: displays the prepare message for Lucky Charms
  */
	public void prepare() {
		super.prepare();
		System.out.println("-Gathering the grains");
		System.out.println("-Shape into circles");
		System.out.println("- Create marshmellow shapes");
		System.out.println(" - Mix circles and marshmellows");
	}
}
/*
 * Jason Bell
 * CSCE247
 */
public class GroceryStore {
/*
 * Function: checks what cereal its asking for a displays that message
 * Returns: return the cereal chosen to display
 */
	public Cereal createCereal(String type) {
		Cereal cereal = null;
		
		if(type.equals("frosted flakes")){
			cereal = new FrostedFlakes();
		} 
		else if(type.equals("lucky charms")) {
			cereal = new LuckyCharms();
		}
		else {
			cereal = new FruitLoops();
		}
		return cereal;
	}
   /*
    * Function: calls the methods in the correct order
    * Return: cereals to display the message of the certain cereal
    */
	public Cereal orderCereal(String type) {
		Cereal cereal = createCereal(type);
		cereal.prepare();
		cereal.boxCereal();
		cereal.priceCereal();
		return cereal;
	}
}
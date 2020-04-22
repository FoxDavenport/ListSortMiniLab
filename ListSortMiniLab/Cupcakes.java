 

public class Cupcakes extends Generics {
	public static final String type = "Cupcakes";
	public enum KeyType {combo, flavor, frosting, sprinkles};
	public static KeyType key = KeyType.combo;
	private String frosting;
	private int sprinkles;
	private String flavor;
	
	Cupcakes(String frosting, int sprinkles, String flavor)
	{
		this.setType(type);
		this.frosting = frosting;
		this.sprinkles = sprinkles;
		this.flavor = flavor;
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() {		
		String output="";
		switch(key) {
		case flavor:
			output += this.flavor;
			break;
		case frosting:
			output += this.frosting;
			break;
		case sprinkles:
			output += this.sprinkles;
			break;
		case combo:
		default:
			output = type + ": " + this.flavor + ", " + this.frosting + ", " + this.sprinkles;
		}
		return output;
	}
	
	public static Generics[] cupCakeData() {
		Generics[] cc = { 
				new Cupcakes("Red", 4, "Red Velvet"),
			    new Cupcakes("Orange", 5, "Orange"),
			    new Cupcakes("Yellow", 6, "Lemon"),
			    new Cupcakes("Green", 7, "Apple"),
			    new Cupcakes("Blue", 8, "Blueberry"),
			    new Cupcakes("Purple", 9, "Blackberry"),
			    new Cupcakes("Pink", 10, "Strawberry"),
			    new Cupcakes("Tan", 11, "Vanilla"),
			    new Cupcakes("Brown", 12, "Chocolate"),
		};
		return cc;
	}
	
	public static void main(String[] args)
	{
		Generics[] cc = cupCakeData();
		for(int i = 0; i < cc.length; i++)
			System.out.println(cc[i]);
	}
	
}

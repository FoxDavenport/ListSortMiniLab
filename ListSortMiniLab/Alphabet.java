 
public class Alphabet extends Generics {
	public static final String type = "Alphabet";
	private static final int size = 26;
	public enum KeyType {combo, letter};
	public static KeyType key = KeyType.combo;
	private char letter;
	
	/*
	 * single letter object
	 */
	public Alphabet(char l)
	{
		this.setType(type);
		this.letter = l;
	}	
	
	/* 
	 * toString provides output based off of key setting
	 */
	@Override
	public String toString()
	{
		
		String output="";
		switch(key) {
		case letter:
			output += this.letter;
			break;
		case combo:
		default:
			output += type + ": " + this.letter;
		}
		return output;
	}
	
	/*
	 * upper case alphabet array
	 */
	public static Generics[] alphabetData() 
	{	
		Generics[] alphabet = new Alphabet[Alphabet.size];
		for (int i = 0; i < Alphabet.size; i++)
		{
			alphabet[i] = new Alphabet( (char)('A' + i) );
		} 	
		return alphabet;
	}
	
	/* 
	 * main to test Animal class
	 */
	public static void main(String[] args)
	{
		Generics[] ad = alphabetData();
		for(Generics a : ad)
			ConsoleMethods.print("" + a);
	}
	
}
		
	
	
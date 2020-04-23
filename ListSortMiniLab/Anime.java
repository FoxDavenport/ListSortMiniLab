public class Anime extends Generics
{
	/*
	 * fields 
	 */
	public static final String type = "Anime";
	public enum KeyType {combo, name, rating, genre};
	public static KeyType key = KeyType.combo;
	private String name; 
	private double rating; 
	private String genre;
	
	/* 
	 * anime constructor
	 */
	Anime(String name, double rating, String genre)
	{
		this.setType(type);
		this.name = name; 
		this.rating = rating; 
		this.genre = genre; 
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString() 
	{
		String output="";
		switch(key) 
		{
			case name:
				output += this.name;
				break;
			case rating:
				output += "000" + this.rating;
				output = output.substring(output.length()-3);
				break;
			case genre:
				output += this.genre;
				break;
			case combo:
			default:
				output += type + ": " + this.name  + ", " + this.genre + ", " + this.rating; 
		}
		return output;
	}
	
	/* 
	 * Initialize anime data
	 */
	public static Generics[] AnimeData()
	{
		Generics[] an = 
		{ 
			new Anime("Tokyo Ghoul", 7.9, "Dark Fantasy"),
		    new Anime("Made in Abyss", 8.8, "Adventure"),
		    new Anime("Sword Art Online", 7.6, "Adventure"),
		    new Anime("Haikyuu", 8.7, "Sport"),
		    new Anime("Jojo's Bizzare Adventure", 8.4, "Fantasy"),
		    new Anime("Cory in the House", 10.0, "Sci-Fi"), 
		};
		return an;
	}
	
	/* 
	 * main method to test the anime class
	 */
	public static void main(String[] args)
	{
		Generics[] an = AnimeData();
		for(int i = 0; i < an.length; i++)
			System.out.println(an[i]);
	}

}
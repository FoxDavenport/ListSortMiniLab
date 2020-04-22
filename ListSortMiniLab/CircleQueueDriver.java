 
/**
 * Circle Queue Driver takes a list of Objects and puts them into a Queue
 * @author     John Mortensen
 *
 */
public class CircleQueueDriver {
	
	private CircleQueue cqueue;	// circle queue object
	private int count; // number of objects in circle queue

	/* 
	 * Circle queue constructor
	 */
	public CircleQueueDriver()
	{
		count = 0;		
		cqueue = new CircleQueue();
	}

	/*
	 * Add any array of objects to the queue
	 */
	public void addCQueue(Object[] objects)
	{
		ConsoleMethods.println("Add " + objects.length);
		for (Object o : objects)
		{
			cqueue.add(o);
			ConsoleMethods.println("Add: " + cqueue.getObject() + " " + cqueue);
			this.count++;
		}
		ConsoleMethods.println();			
	}
	
	/* 
	 * Show key objects/properties of circle queue
	 */
	public void showCQueue()
	{
		ConsoleMethods.println("Size: " + count);
		ConsoleMethods.println("First Element: " + cqueue.getFirstObject());
		ConsoleMethods.println("Last Element: " + cqueue.getLastObject());
		ConsoleMethods.println("Full cqueue: " + cqueue);
		ConsoleMethods.println();
	}
	
	/* 
	 * Delete/Clear all object in circle queue
	 */
	public void deleteCQueue()
	{
		int length = this.count;
		ConsoleMethods.println("Delete " + length);
		
		for (int i = 0; i<length; i++)
		{
			ConsoleMethods.println("Delete: " + cqueue.delete() + " " + cqueue);
			this.count--;
		}
	}
	
	
	/* 
	 * Illustrate different Objects that can be placed on same Queue
	 */
	public static void main(String[] args)
	
	{			
		//queue
		CircleQueueDriver trial = new CircleQueueDriver();
		
		//add different types of objects to the same opaque queue
		trial.addCQueue(Animal.animalData());
		trial.addCQueue(Cupcakes.cupCakeData());
		trial.addCQueue(Alphabet.alphabetData());		
		//display queue objects in queue order
		trial.showCQueue();
		
		//sort queue objects by specific element within the object and display in sort order
		Animal.key = Animal.KeyType.name;
		Cupcakes.key = Cupcakes.KeyType.flavor;
		Alphabet.key = Alphabet.KeyType.letter;
		trial.cqueue.insertionSort();
		trial.showCQueue();
		
		//display queue objects
		Animal.key = Animal.KeyType.combo;
		Cupcakes.key = Cupcakes.KeyType.combo;
		Alphabet.key = Alphabet.KeyType.combo;
		trial.showCQueue();
		
		//delete queue objects
		trial.deleteCQueue();
	}
	
}

import java.util.*;

public class CircleQueueAL 
{
	private int head;//head variable
	private int tail;//tail variable
	private int i;//index variable
	private static ArrayList<Object> list = new ArrayList<Object>();//arraylist to be worked with
	
	public CircleQueueAL()
	{
		head = 0;
		tail = 0;
		i = -1; //if the index variable was set to 0 it would mean that something already exists
	}
	
	//repeating through each sequence will be easier when using setNext and setPrevious
	public void setIndex(int i) 
	{
		this.i = i;
	}
	
	public Object getFirstObject()
	{
		i = head;
		
		if(list.size() != 0)//makes sure there's something available
			return list.get(i);//returns first object if something is available
		else
			return null;//returns null if nothing exists
	}
	
	public Object getLastObject()
	{
		i = tail;
		
		if(list.size() != 0)//makes sure there's something available
			return list.get(i);//returns last object if something is available
		else
			return null;//returns null if nothing exists
	}
	
	public Object getObject(int i)
	{
		if(list.size() != 0)//makes sure there's something available
		{
			if(i == list.size() + 1 || i < 0)//makes sure that the index doesn't overaccess or underaccess the list
				return null;//returns null if it overaccesses or underaccesses
			else
				return list.get(i);//returns the object if it's fine
		}
		else
			return null;//returns null if nothing exists
	}
	  
	  
	public Object setNext()
	{
		i++;
		
		if (i == list.size() || i < 0)//makes sure nothing is wrong with where the index is
		{
			i = head;//index is set to head
			return this.getObject(i);//returns the returns the value of head if there was something wrong with the index
		}
		else
			return this.getObject(i);//returns the returns the value of i if everything works out
	}
	
	public Object setPrevious()
	{
		i--;
		
		if (i == list.size() || i < 0)//makes sure nothing is wrong with where the index is
		{
			i = tail;//index is set to head
			return this.getObject(i);//returns the returns the value of rear if there was something wrong with the index value
		}
		else
			return this.getObject(i);//returns the returns the value of the index if everything works out
	}
	  
	public void add(Object opaqueObject)
	{
		list.add(opaqueObject);//adds the new object at the end of the list
		tail++;
	}
	  
	public Object delete()
	{
		Object hold = null;
		
        if (head == -1)//don't do anything if there's nothing in the list
            System.out.println("The list is empty"); 
            
        if (head == tail)//If theres only one element 
        { 
        	hold = list.get(0);
        	list.remove(0);//remove the first index
            head = -1; //setting head and tail to -1 means that there is nothing more in the list
            tail = -1; 
        } 
        else
        {
        	hold = list.get(head);
        	list.remove(head);
        	tail = tail - 1; 
        }
        
        return hold;
	}
	
	public String toString()
	{
		String queue = "[";

	    i = head;//start from the head of the list
	    
	    while (i != list.size())//keep going until you reach the end of the queue
	    {
	    	queue += "(" + list.get(i) + ")";//add to the string
	    	i++;
	    	
	    	if (i != list.size())//if theres more to add, put a comma
	    		queue += ", ";
	    }										
	    queue += "]";
	    return queue;
	}
	
}

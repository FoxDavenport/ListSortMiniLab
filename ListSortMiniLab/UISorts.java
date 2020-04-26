//import Sorts.ListType;

/**
 * Write a description of class isort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UISorts extends UI
{
	private static final long serialVersionUID = 1L;

    public static int[] BubbleSort(int[] original) 
    { 
        
        // iterate list, one less than length
        for (int i = 0; i < original.length - 1; i++) 
        {
            
            // bubble sort key logic
            for (int k = 1; k < original.length - i; k++) 
            {
                
                // analytics
                //this.bcompares++; // compare counter
                
                // bubble sort swap logic
                if (original[k-1] > original[k]) 
                {
                    int swap = original[k];
                    original[k] = original[k-1];
                    original[k-1] = swap;
               
                    // analytics
                    //this.bswaps++; // swap counter
                }
            
            }
            
        }
        return original;
    }

    
    public static int[] InsertionSort(int[] original) 
    {

        // iterate list, one less than length
        for (int i = 0; i < original.length - 1; i++) 
        {
            // insertion sort key logic
            int k = i + 1;
            int swap = original[k];            
            while( k > 0 && swap < original[k-1]) 
            {
            	original[k] = original[k-1];
                k--;
                
                // analytics
                //this.icompares++; // compare counter
                //this.iswaps++; // shift counter
            }
            original[k] = swap;
            
            //this.iswaps++;  // increment swap counter
            
        }
        
        return original;
    }

    public static int[] SelectionSort(int[] original) 
    {
        // iterate list, one less than length
        for (int i = 0; i < original.length - 1; i++) 
        {
            
            //this.scompares++;
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < original.length; j++) 
            {
                if (original[j] < original[min_idx]) 
                    min_idx = j; 
            }
                    
                           
  
            // Swap the found minimum element with the first element
            //this.sswaps++;
            int temp = original[min_idx]; 
            original[min_idx] = original[i]; 
            original[i] = temp; 
        }
        return original;
    }
}

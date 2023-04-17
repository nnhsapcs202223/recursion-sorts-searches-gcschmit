/**
   A class for executing binary searches in an array.
*/
public class BinarySearcher
{  
   /**
      Finds a value in a range of a sorted array, using the binary
      search algorithm.
      @param a the array in which to search
      @param low the low index of the range
      @param high the high index of the range
      @param value the value to find
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public static int search(int[] a, int low, int high, int value)
   {  
        // terminating condition 0 or 1 element to search
        if(low >= high)
        {
            if(a[low] == value)
            {
                return low;
            }
            else
            {
                return -1;
            }
        }
        
        // take a small step towards a solution by finding the midpoint
        //   of the specified range
        int midIndex = (high + low) / 2;
        
        if(value < a[midIndex])
        {
            // value must be in the lower half of the range
            return search(a, low, midIndex - 1, value);
        }
        else if(value > a[midIndex])
        {
            // value must be in the upper half of the range
            return search(a, midIndex + 1, high, value);
        }
        else // a[midIndex] == value
        {
            // we found the value!
            return midIndex;
        }
   }
}


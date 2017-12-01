package lu.uni.lab7.Exercice1.Filters;

import java.util.Arrays;

/**
 * This class simply stores the int array (as an IntSet) for the subclasses.<br>
 * Furthermore, it provides with a static method, which allows to aplly <br>
 * up to 5 filters to an "Unfiltered" type object.<br>
 * 
 * @author Esteves "estti379" Tiago
 * @version 1.2 (22/11/2017)
 */
public abstract class Filter {
	
	int[] myIntSet;
	
	public Filter() {
	}
	
	/**
	 * This method returns an array with "split"-number of elements, and <br>
	 * copies the elements from the input array into the old element until <br>
	 * the new array is full or the input array runs out of elements. <br>
	 * 
	 * In the context of this class and it's subclasses, this method serves<br>
	 * to shorten a "filtered" array with redundant elements.<br>
	 * 
	 * @param oldArray : 
	 * @param split : has to be a positive integer.
	 */
	protected int[] shortenArray(int[] oldArray , int split) {
		int[] newArray;
				
		if ( split < 0)	{
			newArray = new int[0];
		} else {
			newArray = new int[split];
			for ( int i = 0 ; (i < newArray.length) 
							&& (i < oldArray.length) ; i++ ) {
				
				newArray[i] = oldArray[i];
			}
		}
		return newArray;
		
	}
	
	
	@Override
	/**
	 * Returns the values of the stored array in the format: <br>
	 * [ e1, e2, ... , en ]
	 */
	public String toString() {
		
		return Arrays.toString(myIntSet);
	}
	
	/**
	 * Returns a copy of the current int Array stored by the filter.
	 * 
	 */
	public int[] getIntArray() {
		int[] tempSet = new int[myIntSet.length];
		for ( int i = 0 ; i < myIntSet.length ; i++ ) {
			tempSet[i] = myIntSet[i];
		}
		
		return tempSet;
	}
	
	/**
	 * Makes changes to a copy of the Array from the input "Filter" <br>
	 * depending on the "Filter"-Object being used to call this method.<br>
	 * State of the input "Filter" is conserved. The "Filter"-Object<br>
	 * will store the modified Int Array<br>
	 * 
	 * @param toBeFiltered
	 */
	public abstract void filterArray(Filter toBeFiltered);
	
	
	
}

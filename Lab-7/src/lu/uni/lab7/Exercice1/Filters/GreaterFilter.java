package lu.uni.lab7.Exercice1.Filters;

public class GreaterFilter extends Filter {
	
	private int pivot;
	
	public GreaterFilter(int value) {
		super();
		pivot = value;
	}
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		int tempIndex = 0;
		int[] tempArray = new int[toBeFiltered.myIntSet.length];
		
		for ( int i = 0 ; i < toBeFiltered.myIntSet.length ; i++ ) {
			if ( toBeFiltered.myIntSet[i] >= pivot ) {
				tempArray[tempIndex] = toBeFiltered.myIntSet[i];
				tempIndex++;
			}
		}
		tempArray = this.shortenArray(tempArray, tempIndex);
		myIntSet = tempArray;
		
	}
	
}

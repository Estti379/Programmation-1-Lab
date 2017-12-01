package lu.uni.lab7.Exercice1.Filters;

public class OddFilter extends Filter {
	
	
	public OddFilter() {
		super();
	}
	
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		int tempIndex = 0;
		int[] tempArray = new int[toBeFiltered.myIntSet.length];
		
		for ( int i = 0 ; i < toBeFiltered.myIntSet.length ; i++ ) {
			if ( (toBeFiltered.myIntSet[i] % 2) != 0 ) {
				tempArray[tempIndex] = toBeFiltered.myIntSet[i];
				tempIndex++;
			}
		}
		
		tempArray = this.shortenArray(tempArray, tempIndex);
		myIntSet = tempArray;
		
	}
	
}

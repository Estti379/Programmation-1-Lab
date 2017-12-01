package lu.uni.lab7.Exercice1.Filters;

public class DivisibleFilter extends Filter {
	
	private double pivot;
	
	public DivisibleFilter(double value) {
		super();
		if ( value == 0) {
			System.out.println("Error: DivisibleFilter - can't divide by 0!");
			value = 1;
		}
		pivot = value;
	}
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		int tempIndex = 0;
		int[] tempArray = new int[toBeFiltered.myIntSet.length];
		
		for ( int i = 0 ; i < toBeFiltered.myIntSet.length ; i++ ) {
			if ( (toBeFiltered.myIntSet[i] % pivot) == 0 ) {
				tempArray[tempIndex] = toBeFiltered.myIntSet[i];
				tempIndex++;
			}
		}
		tempArray = this.shortenArray(tempArray, tempIndex);
		myIntSet = tempArray;
		
	}
	
}

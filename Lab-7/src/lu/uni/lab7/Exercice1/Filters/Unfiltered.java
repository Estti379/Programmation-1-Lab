package lu.uni.lab7.Exercice1.Filters;

public class Unfiltered extends Filter {

	public Unfiltered(int[] newArray) {
		super();
		setTheSet(newArray);
	}
	
	private void setTheSet(int[] newArray) {
		myIntSet = new int[newArray.length];
		for ( int i = 0 ; i < myIntSet.length ; i++ ) {
			myIntSet[i] = newArray[i];
		}
		
	}

	@Override
	public void filterArray(Filter toBeFiltered) {
		myIntSet = toBeFiltered.getIntArray();

	}

}

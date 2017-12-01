package lu.uni.lab7.Exercice1.Filters;

public class IntervalFilter extends Filter {
	
	private int pivot1;
	private int pivot2;
	
	public IntervalFilter(int limite1, int limite2) {
		super();
		
		// pivot1 needs to be the smallest of the two values
		if ( limite1 <= limite2 ) {
			pivot1 = limite1;
			pivot2 = limite2;
		} else {
			pivot2 = limite1;
			pivot1 = limite2;
		}
	}
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		GreaterFilter greaterThanPivot1 = new GreaterFilter(pivot1);
		// pivot2 +1 => lessFilter is exclusive, pivot2 would be dropped
		LessFilter lessThanPivot2 = new LessFilter(pivot2 +1);
		
		greaterThanPivot1.filterArray(toBeFiltered);
		lessThanPivot2.filterArray(greaterThanPivot1);
		
		myIntSet = lessThanPivot2.getIntArray();
		
	}
		
}

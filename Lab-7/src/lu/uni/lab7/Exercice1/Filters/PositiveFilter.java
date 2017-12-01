package lu.uni.lab7.Exercice1.Filters;

public class PositiveFilter extends Filter {
	
	
	public PositiveFilter() {
		super();
	}
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		GreaterFilter greaterThan0 = new GreaterFilter(0);
		greaterThan0.filterArray(toBeFiltered);
		
		myIntSet = greaterThan0.getIntArray();
		
	}
	
}

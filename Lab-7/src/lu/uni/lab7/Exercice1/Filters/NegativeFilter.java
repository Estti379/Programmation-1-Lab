package lu.uni.lab7.Exercice1.Filters;

public class NegativeFilter extends Filter {
	
	
	public NegativeFilter() {
		super();
	}
	
	@Override
	public void filterArray(Filter toBeFiltered) {
		LessFilter lessThan0 = new LessFilter(0);
		lessThan0.filterArray(toBeFiltered);
		
		myIntSet = lessThan0.getIntArray();
		
	}
	
}

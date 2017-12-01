package lu.uni.lab7.Exercice1.Filters;

public class FilterSet extends Filter {

	private Filter[] filterList;

	public FilterSet(Unfiltered firstFilter) {
		filterList = new Filter[1];
		filterList[0] = firstFilter;
		myIntSet = filterList[0].getIntArray();
	}

	public void expandWith(Filter newFilter) {
		Filter[] tempSet = new Filter[2];
		tempSet[0] = filterList[0];
		tempSet[1] = newFilter;
		filterList = tempSet;
		
		this.filterArray(this);
	}

	@Override
	public void filterArray(Filter toBeFiltered) {
		for (Filter currentFilters : filterList) {
			currentFilters.filterArray(toBeFiltered);
		}
		myIntSet = filterList[filterList.length - 1].getIntArray();
	}
	
	public void reset(Unfiltered firstFilter) {
		filterList = new Filter[1];
		filterList[0] = firstFilter;
		myIntSet = filterList[0].getIntArray();
	}
}

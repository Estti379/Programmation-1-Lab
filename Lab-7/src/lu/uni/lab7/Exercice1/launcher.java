package lu.uni.lab7.Exercice1;

import lu.uni.lab7.Exercice1.Filters.DivisibleFilter;
import lu.uni.lab7.Exercice1.Filters.EvenFilter;
import lu.uni.lab7.Exercice1.Filters.FilterSet;
import lu.uni.lab7.Exercice1.Filters.GreaterFilter;
import lu.uni.lab7.Exercice1.Filters.IntervalFilter;
import lu.uni.lab7.Exercice1.Filters.LessFilter;
import lu.uni.lab7.Exercice1.Filters.NegativeFilter;
import lu.uni.lab7.Exercice1.Filters.OddFilter;
import lu.uni.lab7.Exercice1.Filters.PositiveFilter;
import lu.uni.lab7.Exercice1.Filters.Unfiltered;

/**
 * Class with the "main" method.<br>
 * Used to test out Class "Filter" and it's subclasses.<br>
 * 
 * @author estti379
 * @version 1.2 (22/11/2017)
 */
public class launcher {
	
	public static void main(String[] args) {
		int[] testArray = {-1,-2,-3,-4,-5,-6,0,1,2,3,4,5,6};
		Unfiltered toBeFiltered;
		EvenFilter evenFilter = new EvenFilter();
		GreaterFilter greaterThan4 = new GreaterFilter(4);
		OddFilter oddFilter = new OddFilter();
		LessFilter lessThanNegative3 = new LessFilter(-3);
		PositiveFilter posiFilter = new PositiveFilter();
		NegativeFilter negaFilter = new NegativeFilter();
		DivisibleFilter divisibleBy3 = new DivisibleFilter(3);
		IntervalFilter betweenValues = new IntervalFilter(5, -3);
		FilterSet megaFilter;
		
		toBeFiltered = new Unfiltered(testArray);
		megaFilter = new FilterSet(toBeFiltered);
		
		System.out.println("Megafilter:\n" + megaFilter.toString() );
		
		System.out.println("Unfiltered:\n" + toBeFiltered.toString() );
		evenFilter.filterArray(toBeFiltered);
		System.out.println("Evenfilter:\n" + evenFilter.toString() );
		
		megaFilter.expandWith(oddFilter);
		megaFilter.expandWith(negaFilter);
		megaFilter.expandWith(divisibleBy3);
		System.out.println("Oddfilter:\n" + oddFilter.toString() );
		System.out.println("Negafilter:\n" + negaFilter.toString() );
		System.out.println("divisiblefilter:\n" + divisibleBy3.toString() );
		System.out.println("Megafilter:\n" + megaFilter.toString() );
	}
			
}

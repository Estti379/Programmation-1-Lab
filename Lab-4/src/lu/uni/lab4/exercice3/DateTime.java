package lu.uni.lab4.exercice3;

public class DateTime {
	Date today;
	Time now;
	
	DateTime() {
		this(1, 1, 1, 0, 0, 0);
	}
	
	DateTime(int newDay, int newMonth, int newYear, int newHours,
			int newMinutes, int newSeconds) {
		today = new Date(newDay, newMonth, newYear);
		now = new Time(newHours, newMinutes, newSeconds);	
		
	}
	
	
	
	void tick() {
		if( now.tick() ) {
			today.addDay();
		}
	}
	
	
	void print(boolean us, String delimiter) {
		
		System.out.print( today.format(us, delimiter) + " "
							+ now.format(us) );
		
	}
	
}

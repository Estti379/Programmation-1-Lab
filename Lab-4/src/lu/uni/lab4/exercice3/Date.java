package lu.uni.lab4.exercice3;

public class Date {

	int day, month, year;
	
	
	Date(int newDay, int newMonth, int newYear){
		
		if ( (newYear < 1) || (newYear > 9999) ) {
			newYear = 1;
		}
		
		if ( ( daysInMonth(newMonth, isLeapYear(newYear) ) ) == -1 ) {
			newMonth = 1;
		}
		
		if ( (newDay < 1) || (newDay > daysInMonth(newMonth, isLeapYear(newYear) ) ) )  {
			newDay = 1;
		}
		setDate(newDay, newMonth, newYear);
	}
	
	/**
	 * Checks if the input year is a leap year.
	 * 
	 * @param year
	 * @return
	 */
	static boolean isLeapYear(int year) {
		boolean leapYear = false;
			if ( (year % 4) != 0 ) {
				leapYear = false;
			} else if ( (year % 100) != 0 ) {
				leapYear = true;
			} else if ( (year % 400) != 0 ) {
				leapYear = false;
			} else {
				leapYear = true;
			}
		return leapYear;
	}
	
	
	/**
	 * Returns the last day possible of a month.<br>
	 * Takes leap years into account.<br>.
	 * 
	 * @param month
	 * @param leapYear Boolean to indicate if the year used is a leap year or not.
	 * @return Returns -1 if the input month is invalid.
	 */
	static int daysInMonth(int month, boolean leapYear) {
		int lastDayOfMonth = 0;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDayOfMonth = 31 ;
			break;
			
		case 4: case 6: case 9: case 11: 
			lastDayOfMonth = 30 ;
			break;
			
		case 2: 
			if ( leapYear ) {
				lastDayOfMonth = 29 ;
			} else {
				lastDayOfMonth = 28 ;
			}
			break;
			
		default:  // Month is not between 1 and 12 (inclusive)
			System.out.println();
			System.out.println("EROOR - gaysInMonth: Month has to be between " 
			+ "0 and 12!");
			lastDayOfMonth = -1 ;
			break;
			
		}// End switch
		
		return lastDayOfMonth;
	}
	
	
	/**
	 * Checks if the input date is valid. <br>
	 * Year has to be between 1 and 9999. <br>
	 * Month between 1 and 12. day between 1 and 28-31, depending on month.
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	static boolean isDateValid(int day, int month, int year) {
		boolean dateValid = true;
		
		/*
		 * Value of "dateValid" stays true, unless one of the 3 next 
		 * condition structures makes it false.
		 */
		if ( (year < 1) || (year > 9999) ) {
			dateValid = false;
			System.out.println();
			System.out.println("ERROR - isDateValid: Year has to be between 0 "
								+"and 9999!");
		}
		
		/* getLastDayOfMonth returns "-1" if the month is not valid.*/
		if ( ( daysInMonth(month, isLeapYear(year) ) ) == -1 ) {
			dateValid = false;
			System.out.println();
			System.out.println("ERROR - isDateValid: Month has to be between 0 "
							    +"and 12!");	
		}
	
		if ( (day < 1)) {
			dateValid = false;
			System.out.println();
			System.out.println("ERROR - isDateValid: Day has to be at least 1!");
		} else if ( day > daysInMonth(month, isLeapYear(year) ) ) {
			dateValid = false;
			System.out.println();
			System.out.println("ERROR - isDateValid: Day is not valid for the month "
								+"used as input!");
		}
		
		return dateValid;
	}
	
	
	/**
	 * Changes date to the input values.
	 * 
	 * @param newDay
	 * @param newMonth
	 * @param newYear
	 * @return Returns <CODE>true</CODE> if change was successful.<br>
	 * Else, it returns <CODE>false</CODE>.
	 */
	boolean setDate(int newDay, int newMonth, int newYear) {
		boolean success = false;
		if ( isDateValid(newDay, newMonth, newYear) ) {
			day = newDay;
			month = newMonth;
			year = newYear;
			success = true;
		} else {
			success = false;
		}
		return success;
	}
	
	
	/**
	 * Adds the value of "days" to the stored date. <br>
	 * Handles changes in months and years, if needed.
	 * 
	 * @param days
	 * @return
	 */
	boolean addDay() {
		boolean success = false;
		int tempDay, tempMonth, tempYear;
		
		/* Avoid working on invalid dates.*/
		if ( !(isDateValid(day, month, year) ) ) {
			success = false;
		} else {
			tempMonth = month;
			tempYear = year;
			tempDay = day + 1;
				
			// Add days. Change month and year accordingly.
			while (tempDay > daysInMonth(tempMonth,
										isLeapYear(tempYear) ) ) {
				tempDay = tempDay - daysInMonth(tempMonth,
												isLeapYear(tempYear) );
				tempMonth++;
				if( tempMonth > 12 ) {
					tempYear++;
					tempMonth = 1;
					}
			}
				
				// Check if new date is valid.
				if( isDateValid(tempDay, tempMonth, tempYear) ) {
					success = true;
					setDate(tempDay, tempMonth, tempYear);
				} else {
					success = false;
				}
				
			
		}
		return success;
	}
	
	
	
	String format(boolean us, String delimiter) {
		String formatDate = "";
		int tempMonth = month, tempDay = day;
		
		if(us) {
			tempMonth = day;
			tempDay = month;
		}	
		
		if( tempDay < 10) {
			formatDate = formatDate + "0";
		}
		
		formatDate = formatDate + String.valueOf(tempDay);
		formatDate = formatDate + delimiter;
		if( tempMonth < 10) {
			formatDate = formatDate + "0";
		}
		formatDate = formatDate + String.valueOf(tempMonth);	
		formatDate = formatDate + delimiter;
		if ( (year < 1000) && (year >= 100) ) {
			formatDate = formatDate + "0";
		} else if ( (year < 100) && (year >= 10) ) {
			formatDate = formatDate + "00";
		} else if ( year < 10 ) {
			formatDate = formatDate + "000";
		}
		formatDate = formatDate + String.valueOf(year);
		
		return formatDate;
	}
	
}

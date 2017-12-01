package lu.uni.lab4.exercice3;

public class Time {

	int hours, minutes, seconds;
	
	
	Time(int newHours, int newMinutes, int newSeconds) {
		
		if( (newHours < 0) || (newHours > 23) ) {
			newHours = 0;
		}
		if( (newMinutes < 0) || (newMinutes > 59) ) {
			newMinutes = 0;
		}
		if( (newSeconds < 0) || (newSeconds > 59) ) {
			newSeconds = 0;
		}
		
		hours = newHours;
		minutes = newMinutes;
		seconds = newMinutes;
	}
	
	
	
	boolean tick() {
		boolean becomesNextDay = false;
		
		seconds++;
		
		if (seconds >= 60) {
			seconds = 0;
			minutes++;
			
			if (minutes >= 60) {
				minutes = 0;
				hours++;
				
				if (hours >= 24) {
					hours = 0;
					becomesNextDay = true;
				}
			}
		}
		
		return becomesNextDay;
	}
	
	
	String format(boolean us) {
		String formatHour = "";
		int tempHours = hours;
		boolean isAM = false;
		
		if( us ) {			
			if( tempHours > 11 ) {
				tempHours = tempHours - 12;
				isAM = false;
				
			} else {
				isAM = true;
			}
			
			if ( tempHours == 0) { tempHours = 12; }
		}
		
		if( tempHours < 10 ) {
			formatHour = formatHour + "0";
		}
		
		formatHour = formatHour + String.valueOf(tempHours) + ":";
		
		
		if( minutes < 10 ) {
			formatHour = formatHour + "0";
		}
		formatHour = formatHour + String.valueOf(minutes) + ":";
		if( seconds < 10 ) {
			formatHour = formatHour + "0";
		}
		formatHour = formatHour + String.valueOf(seconds);
		if ( (us) && (isAM) ) {
			formatHour = formatHour + " AM";
		} else if( (us) && (!isAM) ) {
			formatHour = formatHour + " PM";
		}
		
		
		return formatHour;
	}
	
	
	
}

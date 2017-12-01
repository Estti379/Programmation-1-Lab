package lu.uni.lab2;

import java.util.Scanner;

public class Wait_a_second {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Initialize variables with "default" values
		int maxHour = 24;
		boolean isAM = false;
		
		//Get user input - system type - AM/PM - time
		System.out.println("Do you want to use a 24-hour clock system?");
		System.out.println("(type \"true\" for 24-hour system.)");
		System.out.println("(type \"false\" for 12-hour system.)");
		boolean is24HourSystem = scanner.nextBoolean();
		
		// if 12 hours system, change maxHour and get input for AM/PM
		if (!is24HourSystem) {
			maxHour = 12;
			
			System.out.println("Is it currently AM?");
			System.out.println("(type \"true\" if it's AM.)");
			System.out.println("(type \"false\" if it's PM.)");
			isAM = scanner.nextBoolean();
		}
		
		
		System.out.println("Input the current hour:");
		byte hour = scanner.nextByte();
		System.out.println("Input the current minutes:");
		byte minutes = scanner.nextByte();
		System.out.println("Input the current seconds:");
		byte seconds = scanner.nextByte();
		
		
		//Check for correct user input
		boolean goodTimeInput = ( ( (hour >= 0) && (hour < maxHour) )
				               && ( (minutes >= 0) && (minutes < 60) )
				               && ( (seconds >= 0) && (seconds < 60) ) );
		
		
		//If incorrect input, return error + instructions + skip rest of program.
		if (!goodTimeInput) {
			System.out.println("Critical error: time input is out of the boundaries!");
			System.out.println("Hours have to be between 0 and " + (maxHour-1) +".");
			System.out.println("Minutes have to be between 0 and 59.");
			System.out.println("Seconds have to be between 0 and 59.");
			
			
		} else {
			//Display time in format HH:MM:SS AM/PM
			System.out.print("The current time is: ");
			if (hour<10) System.out.print("0"); //Format to 0H:0M:0S when values are lower than 10
			System.out.print( hour +":");
			if (minutes<10) System.out.print("0");
			System.out.print( minutes +":");
			if (seconds<10) System.out.print("0");
			System.out.print( seconds );
			if ( (!is24HourSystem) && (isAM)) System.out.print(" AM");
			if ( (!is24HourSystem) && (!isAM)) System.out.print(" PM");
			
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("An eternity (second) later!");
			System.out.println("");
			
			
			
			//Increment by one second. Change minutes, hour and AM/PM when applicable
			seconds++;
			
			if (seconds >= 60) {
				seconds = 0;
				minutes++;
				
				if (minutes >= 60) {
					minutes = 0;
					hour++;
					
					if (hour >= maxHour) {
						hour = 0;
						// NOTE: next line changes isAM default value even when is24HourSystem is true.
						// But it will have no effect, as isAM gets used only if is24HourSystem is false!
						isAM = (!isAM);
					}
				}
			}
			//Display time in format HH:MM:SS AM/PM (same as before)
			System.out.print("The current time is: ");
			if (hour < 10) System.out.print("0");
			System.out.print( hour +":");
			if (minutes < 10) System.out.print("0");
			System.out.print( minutes +":");
			if (seconds < 10) System.out.print("0");
			System.out.print( seconds );
			if ( (!is24HourSystem) && (isAM) ) System.out.print(" AM");
			if ( (!is24HourSystem) && (!isAM) ) System.out.print(" PM");			
		}
		
		scanner.close();
	}

}

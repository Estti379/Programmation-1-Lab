package lu.uni.lab5.exercice7;

import java.util.Scanner;

public class TestingGround {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myIDString = new String("");
		StudentID myID = null;
		
		System.out.println("What is your ID?");
		myIDString = scanner.next();
		
		myID = new StudentID(myIDString);
		
		if ( !myID.checkValidity() ) {
			System.out.println("This ID is not valid!");
			
		} else {
			System.out.println("Your ID is valid!");
			System.out.print("Your first semester of enrollment was the ");
			
			if ( myID.getSemester() == 0 ) {
				System.out.print("winter");
			} else {
				System.out.print("summer");
			}
			
			System.out.print(" semester of " + myID.getYear() + "!" );
		}
		
		scanner.close();
	}

}
//112345670b   is a valid ID.
//0123456720   is a valid ID.

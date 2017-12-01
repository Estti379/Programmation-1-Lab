package lu.uni.helloworld;

import java.util.Scanner;

public class Course_evaluation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Grade of the 1st Midterm:");
		int grade1Midterm = Math.min(Math.max(scanner.nextInt() , 0  ) , 20 );
		System.out.println("Grade of the 2nd Midterm:");
		int grade2Midterm = Math.min(Math.max(scanner.nextInt() , 0  ) , 20 );
		System.out.println("Grade of the final exam:");
		int gradeFinal = Math.min(Math.max(scanner.nextInt() , 0  ) , 20 );
		
		int semesterGrade =  (grade1Midterm + grade2Midterm)* 20/100 
							+ gradeFinal* 60/100;
		
		
		System.out.println("Your grades are recorded as:");
		System.out.println("1st Midterm: " + grade1Midterm);
		System.out.println("2nd Midterm: " + grade2Midterm);
		System.out.println("Final Exam: " + gradeFinal);
		System.out.println("You grade for this semester is: " + semesterGrade);
		
		scanner.close();
	}

}

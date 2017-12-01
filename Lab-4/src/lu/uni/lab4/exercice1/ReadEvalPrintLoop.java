package lu.uni.lab4.exercice1;

import java.util.Scanner;

public class ReadEvalPrintLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator value = new Calculator();
		
		boolean done = false;
		double parameter = 0;
		int currentMenu = -1;
		
		do {
			System.out.println("The current ANS is: " + value.getValue() );
			System.out.println("Type 1 to enter the addidtion menu.");
			System.out.println("Type 2 to enter the subtraction menu.");
			System.out.println("Type 3 to enter the multiplication menu.");
			System.out.println("Type 4 to enter the division menu.");
			System.out.println("Type 0 to quit the calculator!.");
			
			currentMenu = scanner.nextInt();
			
			switch (currentMenu) {
			case 1:
				System.out.println("What do you want to add to "
									+ value.getValue() + "?");
				parameter = scanner.nextDouble();
				value.add(parameter);
				break;
			case 2:
				System.out.println("What do you want to subtract from "
						+ value.getValue() + "?");
				parameter = scanner.nextDouble();
				value.subtract(parameter);
				break;
			case 3:
				System.out.println("What do you want to multiply with "
						+ value.getValue() + "?");
				parameter = scanner.nextDouble();
				value.multiply(parameter);
				break;
			case 4:
				System.out.println("What do you want to divide "
						+ value.getValue() + " by?");
				parameter = scanner.nextDouble();
				value.divide(parameter);
				break;
			case 0:
				System.out.println("Byebye!");
				done = true;
				break;
			default:
				System.out.println("That menu doesn't exist!");
				break;
			}
			
			System.out.println();
		} while (!done);
		
		scanner.close();
	}

}

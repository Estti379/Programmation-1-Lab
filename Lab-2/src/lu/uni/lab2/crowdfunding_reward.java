package lu.uni.lab2;

import java.util.Scanner;

public class crowdfunding_reward {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		//Get input from user
		System.out.println("How much are you planing to pledge?");
		int pledge = scanner.nextInt();
		
		//display rewards depending on the pledged amount
		System.out.println("You unlocked the following rewards:");
		switch(pledge) {
			case 500:{System.out.println("* Autograph of your professors");}
			case 200:{System.out.println("* Uni.lu Smartphone cover");}
			case 100:{System.out.println("* USB Stick of 8GB");}
			case 50:{System.out.println("* Public display of your donation on Moodle");}
				break; //Breaks at each case after 50 to avoid "mixing" rewards
			case 20:{System.out.println("* Your name in ASCII art");}
				break;
			case 10:{System.out.println("* High five with TAs");}
				break;
			default:{ //Display error when wrong amount pledged + information
				System.out.println("Wrong amount has been pledge."
									+" Please, input one of the following amounts:\n"
									+"* 10 €\n* 20 €\n* 50 €\n* 100 €\n* 200 €\n* 500 €\n");
			}
				break;
		
		}
		
		scanner.close();
	}

}

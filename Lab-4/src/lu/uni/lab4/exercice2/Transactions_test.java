package lu.uni.lab4.exercice2;

import java.util.Objects;
import java.util.Scanner;

public class Transactions_test {

	private static Scanner scanner = new Scanner(System.in);
	private static BankAccount firstAccount, secondAccount;
	
	
	public static void main(String[] args) {
		
		/* Ignore this */
		/*
		/// WTF is going on here???
		String test1 = "test", test2 = "test";
		if( test1 == test2 ) {
			System.out.println("it works! (1)");
		}
		if ( test1 == "test") {
			System.out.println("it works! (2)");
		}
		test1 = scanner.next();
		System.out.println(test1);
		if( test1 == "test" ) {
			System.out.println("it works! (3)");
		} else if( Objects.equals(test1, "test")) {
			System.out.println("it works! (4)");
		}
		test2 = scanner.next();
		System.out.println(test2);
		if( test1 == test2 ) {
			System.out.println("it works! (5)");
		} else if(  Objects.equals(test1,test2) ) {
			System.out.println("it works! (6)");
		}
		test1 = scanner.next();
		*/
		
		
		BankAccount accountQuit = new BankAccount(0, "quit");
		String userInputString;
		boolean done = false;
		
		
		
		System.out.println("Creating first account!");
		firstAccount = createAccount(accountQuit);
		System.out.println("\nCreating second account!");
		secondAccount = createAccount(firstAccount);
		
		done = false;
		do {
			System.out.println("\nOn which account do you want to work on?\n\"" 
					+ firstAccount.getHolder().getName()+ "\" or \""
					+ secondAccount.getHolder().getName() + "\" ?"
					+ "\n(Type \"quit\" if you want to stop)");
			userInputString = scanner.next() + scanner.nextLine();
			
			if( Objects.equals(userInputString, "quit") ) {
				System.out.println("Bye bye!");
				done = true;
				
			} else if( Objects.equals(userInputString, firstAccount.getHolder().getName() ) ) {
				openSessionMenu(firstAccount);
				
			} else if( Objects.equals(userInputString, secondAccount.getHolder().getName() ) ) {
				openSessionMenu(secondAccount);
				
			} else {
				System.out.println("You didn't input a valid account holder!");
			}
			
		} while(!done);
		
		
		scanner.close();
	}

	
	static BankAccount createAccount(BankAccount otherAccount) {
		String nameOwner;
		double amountMoney = -1;
		boolean done = false;
		
		do {
			System.out.println("What is the name of the account owner?");
			nameOwner = scanner.next() + scanner.nextLine();
			
			/*is this even readable?*/
			if(        ( Objects.equals(nameOwner,"quit") )
					|| ( Objects.equals(nameOwner,
									otherAccount.getHolder().getName() ) ) ) {
				
				System.out.println("That name cannot be used!");
				done = false;
			} else {
				done = true;
				System.out.println("How much money does that person already own?");
				amountMoney = scanner.nextDouble();
			}

		} while( !done );
		return new BankAccount(amountMoney, nameOwner);
	}
	
	static void openSessionMenu(BankAccount currentAccount) {
		boolean done = false;
		String userInputString;
		double amount = -1;
			
		do {
			System.out.println("\nHello " + currentAccount.getHolder().getName()
							+ "! What do you want to do?");
			System.out.println("Type \"info\" \"deposit\" \"withdraw\" \"transfer\" or \"back\".");
	
			userInputString = scanner.next() + scanner.nextLine();
			
			if( Objects.equals(userInputString, "info") ) {
				currentAccount.printBalance();
				
			} else if( Objects.equals(userInputString, "deposit") ) {
				System.out.println("How much do you want to deposit?");
				amount = scanner.nextDouble();
				currentAccount.deposit(amount);
				currentAccount.printBalance();
				
			} else if( Objects.equals(userInputString, "withdraw") ) {
				System.out.println("How much do you want to withdraw?");
				amount = scanner.nextDouble();
				if( currentAccount.withdraw(amount) ) {
					System.out.println(amount + " euros were withdraw from your account.");
					currentAccount.printBalance();
				}
				
			} else if( Objects.equals(userInputString, "transfer") ) {
				transferMenu(currentAccount);
				
			} else if( Objects.equals(userInputString, "back") ) {
				done = true;
				
			} else {
				System.out.println("You didn't input a valid command!");
			}
			
		} while( !done );
		
	}
	
	static void transferMenu(BankAccount currentAccount) {
		boolean done = false;
		String userInputString = null;
		BankAccount targetAccount = null;
		double amount = -1;
		
		currentAccount.printBalance();
		do {	
			System.out.println("\nTo which account do you want to transfer money to?"
					+ "\n(Type \"quit\" to cancel the transfer procedure.)");
			userInputString = scanner.next() + scanner.nextLine();
			
			if( Objects.equals(userInputString, "quit") ) {
				done = true;
				targetAccount = null;
				
			} else if( Objects.equals(userInputString, firstAccount.getHolder().getName() ) ) {
				targetAccount = firstAccount;
				done = true;
					
			} else if( Objects.equals(userInputString, secondAccount.getHolder().getName() ) ) {
				targetAccount = secondAccount;
				done = true;
					
			} else {
				targetAccount = null;
				System.out.println("You didn't input a valid account holder!");
			}
			
			if( targetAccount != null ) {
				if( currentAccount == targetAccount ) {
					System.out.println("You can't transfer money to the account you are transfering from!");
					done = false;
					
				} else {
					System.out.println("How much do you want to transfer to "
										+ targetAccount.getHolder().getName() +"?");
					amount = scanner.nextDouble();
					if( currentAccount.transfer(targetAccount, amount) ) {
						System.out.println(amount + " euros were transfered to "
											+ targetAccount.getHolder().getName() + "!");
						currentAccount.printBalance();
					}
				}
			}	
			
		} while( !done );
	}

}

package lu.uni.lab4.exercice2;

public class BankAccount {
	Person holder;
	double balance;
	
	BankAccount(double money, String name) {
		
		if( money < 0 ) { balance = 0; }
		else { balance = money; }
		holder = new Person(name);
		
	}
	
	Person getHolder() {
		return holder;
	}
	
	double getBalance() {
		return balance;
	}
	
	void deposit(double amount) {
		if( amount < 0 ) {
			System.out.println("You can't deposit negative money into your "
								+"account!");
		} else {
			balance = balance + amount;
		}
	}
	
	boolean withdraw(double amount) {
		boolean success = false;
		if( amount < 0 ) {
			System.out.println("You can't withdraw negative money from your "
								+"account!");
			success = false; 
		} else if (amount > balance) {
			System.out.println("You don't have enough money in your account. "
					+"Withdrawnal was canceled!");
			success = false;
		} else {
			balance = balance - amount;
			success = true;
		}
		return success;
	}

	void printBalance() {
		System.out.println("Account Information:");
		System.out.println( holder.getName() +" => " + getBalance() + " euros." );
	}
	
	boolean transfer(BankAccount beneficiary , double amount) {
		boolean success = false;
		
		if( amount < 0 ) {
			System.out.println("You can't transfer negative money from your "
								+"account!");
			success = false; 
		} else if (amount > balance) {
			System.out.println("You don't have enough money in your account. "
					+"Transfer was canceled!");
			success = false;
		} else {
			withdraw(amount);
			beneficiary.deposit(amount);
			success = true;
		}
		
		return success;
	}
}

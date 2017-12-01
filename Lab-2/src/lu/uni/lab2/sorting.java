package lu.uni.lab2;

import java.util.Scanner;

public class sorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//Get 3 numbers to sort from user
		System.out.println("Give me 3 numbers.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int temp = 0; 
		
		// Sort the 3 values then display them
		if (a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a<c) {
			temp = a;
			a = c;
			c = temp;
		}
		if(b<c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println(a +" "+ b +" "+ c);
		
		
		
		scanner.close();

	}

}

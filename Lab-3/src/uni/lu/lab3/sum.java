package uni.lu.lab3;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int integerN = -1, i = 0;
		int sumFor =0, sumWhile =0, sumDo =0;
		
		do {
			System.out.println("What is your positive integer for n?");
			integerN = scanner.nextInt();
			
		}while(integerN<0);
		
		//for loop
		sumFor = 0;
		for (i = 0;i<=integerN;i++) {
			sumFor = sumFor + i;
		}
		
		//while loop
		sumWhile = 0;
		i = 0;
		while(i<=integerN) {
			sumWhile = sumWhile + i;
			i++;
		}
		
		//Do while loop
		sumDo = 0;
		i = 0;
		do {
			sumDo = sumDo + i;
			i++;
		}while(i<=integerN);
		
		int trueResult = (integerN*(integerN+1))/2;
		
		System.out.println("Avec FOR: "+ sumFor);
		System.out.println("Avec WHILE: "+ sumWhile);
		System.out.println("Avec DO WHILE: "+ sumDo);
		System.out.println("Expected result: "+ trueResult);
		
		scanner.close();
	}

}

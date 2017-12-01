package lu.uni.helloworld;

import java.util.Scanner;

public class hows_the_weather {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the current temperature? (in celsius)");
		float tempCelsius = scanner.nextFloat();
		
		float tempFahrenheit = tempCelsius *9/5 + 32;
		System.out.println("While for you the temperature is " + tempCelsius
				+ " degrees celsius, Americans say it is " + tempFahrenheit 
				+ " degrees Fahrenheit. Silly Americans!");
		
		scanner.close();
	}

}

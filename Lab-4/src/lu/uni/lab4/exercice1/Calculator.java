package lu.uni.lab4.exercice1;

public class Calculator {

	private double value;
	
	Calculator(double myValue) {
		value = myValue;
	}
	Calculator() {
		this(0);
	}
	
	double getValue(){
		return value;
	}
	
	void add(double secondValue) {
		value = getValue() + secondValue ;
	}
	
	void subtract(double secondValue) {
		this.add( - secondValue);
	}
	
	void multiply(double secondValue) {
		value = getValue() * secondValue;
	}
	
	void divide(double secondValue) {
		if (secondValue == 0) {
			System.out.println("ERROR - divide: can't divide by 0!");
		} else {
			this.multiply(1/secondValue);
		}
		
	}
	
	
}

package lu.uni.lab5.exercice1;

import java.util.Arrays;
import java.util.Random;

public class Vector {
	
	private static Random generator = new Random( );
	private double[] values;
	
	Vector(int size) {
		values = new double[size];
	}
	
	
	void randomFill(int upperBound, int lowerBound) {
		int i = 0;
		
		for( i = 0 ; i < values.length; i++ ) {
			values[i] = generator.nextInt(upperBound) + lowerBound;
		}
		
	}
	
	
	int getDimensions() {
		return values.length;
		
	}
	
	
	double getElement(int index) {
		double result = -1;
		
		if( !isIndexValid(index) ) {
			System.out.println("Index is out of bounds!");
		} else {
			result = values[index];
		}
		
		return result;
	}
	
	
	void setElement(double newValue, int index) {
		
		if( !isIndexValid(index) ) {
			System.out.println("Index is out of bounds!");
		} else {
			values[index] = newValue;
		}
		
		
		
	}
	
	boolean isIndexValid(int index) {
		boolean isValid = false;
		
		if( (index < 0 ) && (index > (values.length - 1) ) ) {
			isValid = false;
		} else {
			isValid = true;
		}
		
		return isValid;
	}
	
	double getNorm() {
		double theNorm = 0;
		int i = 0;
		
		for( i = 0 ; i < values.length ; i++ ) {
			theNorm = theNorm + (values[i] * values[i]);
			
		}
		
		theNorm = Math.sqrt( theNorm );
		
		return theNorm;
	}
	
	Vector add(Vector secondValues) {
		Vector result = null;
		int i = 0;
		double addition = 0;
		
			if( this.getDimensions() != secondValues.getDimensions() ) {
				result = null;
			} else {
				result = new Vector( this.getDimensions() );
				
				for( i = 0 ; i < getDimensions() ; i++ ) {
					addition = this.getElement(i) + secondValues.getElement(i);
					result.setElement( addition , i) ;
				}
			}
	
		return result;
	}
	
	
	public String toString() {
		String myFormat;
		
		myFormat = Arrays.toString(values);
		myFormat = myFormat.replace('[', '(');
		myFormat = myFormat.replace(']', ')');
		
		
		return myFormat;
	}
	
	
	
	
	
	
	
}

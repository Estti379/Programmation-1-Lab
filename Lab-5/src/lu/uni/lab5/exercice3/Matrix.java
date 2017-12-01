package lu.uni.lab5.exercice3;

import java.util.Random;

public class Matrix {
	
	private int[][] matrixM;
	private static Random generator = new Random(System.currentTimeMillis() );
	
	Matrix(int m, int n) {
		matrixM = new int[m][n];
		
	}
	
	void randomFill() {
		int m, n;
		
		for ( m = 0 ; m < matrixM.length; m++ ) {
			for ( n = 0 ; n < matrixM[0].length; n++ ) {
				matrixM[m][n] = generator.nextInt(100);
			}
		}
		
	}
	
	void set(int value, int m, int n) {
		matrixM[m][n] = value;
	}
	
	void print() {
		int m, n;
		
		for ( m = 0 ; m < matrixM.length; m++ ) {
			for ( n = 0 ; n < matrixM[0].length; n++ ) {
				System.out.print( String.format( "%3d\t", matrixM[m][n]) );
			}
			
			System.out.println();
		}	
	}
	
	Matrix transpose() {
		Matrix transMatrix = new Matrix(matrixM[0].length, matrixM.length);
		int m = 0, n = 0;
		
		for ( n = 0 ; n < matrixM[0].length; n++ ) {
			for ( m = 0 ; m < matrixM.length; m++ ) {
				transMatrix.set(matrixM[m][n], n, m);
			}
		}
		
		return transMatrix;
	}
	
	
}

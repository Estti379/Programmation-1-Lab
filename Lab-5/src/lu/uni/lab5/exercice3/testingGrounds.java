package lu.uni.lab5.exercice3;

public class testingGrounds {

	public static void main(String[] args) {
		Matrix myMatrix = new Matrix(4,2);
		Matrix transMatrix;
		
		myMatrix.randomFill();
		myMatrix.print();
		
		System.out.println();
		
		transMatrix = myMatrix.transpose();
		transMatrix.print();
	}

}

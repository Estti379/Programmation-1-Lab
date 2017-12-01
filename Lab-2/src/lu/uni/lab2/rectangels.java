package lu.uni.lab2;

import java.util.Scanner;

public class rectangels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Get point's coordinates from user. In total, 3 points are needed.
		System.out.println("Input you point's coordinates.");
		System.out.println("Xp: ");
		int pointX = scanner.nextInt();
		System.out.println("Yp: ");
		int pointY = scanner.nextInt();
		
		System.out.println("");
		
		System.out.println("A rectangle is defined by 2 points."
						  +" Input 2 points A and B which define your rectangle!");
		
		System.out.println("Point A");
		System.out.println("Xa: ");
		int xA = scanner.nextInt();
		System.out.println("Ya: ");
		int yA = scanner.nextInt();
		
		System.out.println("");
		
		System.out.println("Point B");
		System.out.println("Xb: ");
		int xB = scanner.nextInt();
		System.out.println("Yb: ");
		int yB = scanner.nextInt();
		
	
		//If the coordinate xAisn't the biggest value between xA and xB, both get switched with each other.
		//Same is done with yA and yB.
		//NOTE: this can be done because the point pair Pa(Xa,YA) and Pb(Xb,Yb) define the exact same rectangle as
		//the point pair Pc(Xa,Yb) and Pd(Xa,Yb)
		if (xA < xB) {
			xA = xA + xB;
			xB = xA - xB;
			xA = xA - xB;
		}
		if (yA < yB) {	
			yA = yA + yB;
			yB = yA - yB;
			yA = yA - yB;
		}
		
		
		//Check if point is inside of the rectangle. Display result accordingly.
		boolean isXGood = (pointX <= xA) && (pointX >= xB) ;
		boolean isYGood = (pointY <= yA) && (pointY >= yB) ;
		
		if (isXGood && isYGood) System.out.println("Your point is inside of the retangle!");
		else System.out.println("Doesn't look like your point is inside of the retangle!");
		
		scanner.close();
	}

}

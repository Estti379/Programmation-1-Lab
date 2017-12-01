package lu.uni.lab2;

public class tell_me_the_truth {
	
	public static void main ( String [] args ) {
			
		// a -> b  <=>  !a ou b
		// This formula is needed to resolve this problem

		Boolean a = true, b = false , c = true;
		
		//Display a table
		System.out.println(" a      b      a->b");

		a = false; b = false;
		c = (!a || b);
		System.out.println(a + "   " + b + "   " + c);
		
		a = false; b = true;
		c = (!a || b);
		System.out.println(a + "   " + b + "   " + c);
				
		a = true; b = false;
		c = (!a || b);
		System.out.println(a + "   " + b + "   " + c);
				
		a = true; b = true;
		c = (!a || b);
		System.out.println(a + "   " + b + "   " + c);		
	}

}

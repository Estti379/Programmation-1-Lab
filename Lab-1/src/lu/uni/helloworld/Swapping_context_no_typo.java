package lu.uni.helloworld;

public class Swapping_context_no_typo {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Standard swap
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a= " + a + "! b= " + b + "!");
		
		//swap with swag
		a = 11;
		b = 22;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a= " + a + "! b= " + b + "!");

	}

}

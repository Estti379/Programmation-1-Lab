package lu.uni.lab2;

public class go_with_flow {

	public static void main(String[] args) {
				
		byte a;
		
		// By adding 1, "a" becomes -128
		a = 127;
		
		System.out.println(a + " + 1 = "+ ++a);
		
		// By substracting 1, a becomes 127
		a = -128;
		
		System.out.println(a + " - 1 = "+ --a);
	}

}

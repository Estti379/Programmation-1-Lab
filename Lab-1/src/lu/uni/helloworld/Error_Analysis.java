package lu.uni.helloworld;

public class Error_Analysis {

	public static void main(String[] args) {
		// 1
/*
 * int a, b, c, d
 * a = 200
 * 
 * Syntatical error!
 * Both statements are missing a ";" at the end.
 * 
 * Semantic error: (Minor)
 * Variables were created and allocated, but not used at all.
 * 
 * Even though not necessary, it is a good practice to assign
 * a value to each variable when or right after declaring them.	
 */
	
		 int a, b, c, d;
		 a = 200;
		 b = 1000;
		 c = 330;
		 d = 7;
		 
		 //2
		 
/*
 * System.out.println((1+2)-3));
 * 
 * Syntatical error!
 * This statement creates issues because of the parentheses.
 * The best way to fix it, is by getting rid of one of the two parentheses
 * who come after the "3".
 * 
 * Another way, would be to add a parenthese before the "1", but that way we would
 * have a redundant opening and closing parentheses which aren't wrong, just not
 * needed.
 * 
 * Semantic error: (Minor)
 * The parentheses in (1+2), even though not wrong, they are redundant.
 * 
 *(1+2)-3 = 1+2-3
 * 
 */
		 System.out.println((1+2)-3);
		 

/*
 * int e = 0.1;
 * 
 * Semantic error:
 * It is not possible to store a non-integer in a variable of type "int".
 * We have to use a "double" instead.
 */
		 
		 double e = 0.1;

		 
		 //4
/*
 * f = f + 1;
 * 
 * Semantic error:
 * 
 * The variable "f" hasn't been declared yet.
 * We need to declare it before it is used.
 * On top of that, we can't give "f" a value which depends on "f" which has no value yet. 
 * .
 * 
 * int f = a + 1; is fine, because "a" has already a value.
 * int f = f + 1; isn't, because "f" has no value yet.
 * 
 * As stated before, it is a good practice to assign a value to a variable when
 * declaring it.
 */
		
		 int f = 0;
		 f = f + 1;
		 
		 

	}

}

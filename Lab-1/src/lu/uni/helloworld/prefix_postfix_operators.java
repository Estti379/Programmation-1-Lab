package lu.uni.helloworld;

public class prefix_postfix_operators {

	public static void main(String[] args) {
		int i = 0, j, k;
		
		
		i++;
		// i = 1
		System.out.println("i = " + i);
		//display: i = 1
		++i;
		//i = 2
		System.out.println("i = " + i);
		//display: i = 2
		System.out.println("i = " + ++i);
		//display: i = 3
		//i = 3
		System.out.println("i = " + i++);
		//display: i = 3
		//i = 4		
		System.out.println("i = " + i);
		//display: i = 4
		
		j = i++; System.out.println("i = " + i + ", j = " + j);
		// i= 5  j = 4
		//display: i = 5, j = 4
		j = ++i; System.out.println("i = " + i + ", j = " + j);
		// i= 6 j = 6
		//display: i = 6, j = 6
		
		k = i++ + ++j;
		// i= 7 j = 7 k = 13
		System.out.println("i = " + i++ + ", j = " + ++j + ", k = " + k++);
		// display: i = 7, j = 8 ,k = 13
		// i = 8 j = 8 k = 14
		k = ++i + j++;
		// i = 9 j =9 k = 17
		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		//display:  i = 9, j = 9 ,k = 17

	}

}

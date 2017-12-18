package lu.uni.lab10.Exercise4;

import java.io.IOException;

import lu.uni.lab10.Exercise4.MyFindAndGrep.IllegalArgumentException;
import lu.uni.lab10.Exercise4.MyFindAndGrep.MyFindAndGrep;

public class Launcher {

	public static void main(String[] args) throws IllegalArgumentException, IOException {

		MyFindAndGrep search = new MyFindAndGrep();
		String[] testParameters = new String[6];
		
		testParameters[0] = "/";
		testParameters[1] = ".java";
		testParameters[2] = "testParameters";
		testParameters[3] = "Override";
		testParameters[4] = "carol";
		testParameters[5] = "am/I/here/wasICreated.txt";
		
		
		search.useFindAndGrep( testParameters );
		//search.toString();

	}

}

package lu.uni.lab10.Exercise3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lu.uni.lab10.Exercise3.MultipleOutput.MultipleOutputStream;

public class Launcher {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		/* using slightly modified version of exercice 2 */
		
		if ( args.length == 0 ) {
			System.out.println("No parameters were given.");
		} else {
			String[] fileName;
			fileName = args[0].split("\\.");
			
			long time = System.currentTimeMillis();
			
			try ( BufferedInputStream inputStream =
						new BufferedInputStream( new FileInputStream(args[0]) );
				  BufferedOutputStream outputStreamA =
						new BufferedOutputStream( new FileOutputStream(fileName[0]
						+ "_copyA." + fileName[1] ) );
				  BufferedOutputStream outputStreamB =
						new BufferedOutputStream( new FileOutputStream(fileName[0]
						+ "_copyB." + fileName[1] ) );
					MultipleOutputStream masterOutput =
						new MultipleOutputStream(outputStreamA) ) {
				
				masterOutput.addNewOutputStream(outputStreamB);
				
				int c;
				while ( (c = inputStream.read() ) != -1 ) {
					masterOutput.write(c);
				}
			System.out.println("Copying was sucessfull!");
			time = System.currentTimeMillis() - time;
			System.out.println("Time : " + ((double)time/1000) + " seconds." );
			}
			
		}
	}
}

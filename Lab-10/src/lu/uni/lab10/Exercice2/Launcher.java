package lu.uni.lab10.Exercice2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		if ( args.length == 0 ) {
			System.out.println("No parameters were given.");
		} else {
			String[] fileName;
			fileName = args[0].split("\\.");
			
			long time = System.currentTimeMillis();
			
			try ( BufferedReader inputStream =
					new BufferedReader( new FileReader(args[0]) );
				    BufferedWriter outputStream =
				    new BufferedWriter( new FileWriter(fileName[0]
				    + "_buffered." + fileName[1] ) ) ) {
				
				int c;
				while ( (c = inputStream.read() ) != -1 ) {
					outputStream.write(c);
				}
				
			}
			
			System.out.println("First copy was sucessfull!");
			time = System.currentTimeMillis() - time;
			System.out.println("Time : " + ((double)time/1000) + " seconds." );
			
			try ( FileReader inputStream =
					new FileReader(args[0]) ;
				    FileWriter outputStream =
				    new FileWriter(fileName[0]
				    + "_notBuffered." + fileName[1] )  ) {
				
				int c;
				while ( (c = inputStream.read() ) != -1 ) {
					outputStream.write(c);
				}
				
			}
			
			System.out.println("Second copy was sucessfull!");
			time = System.currentTimeMillis() - time;
			System.out.println("Time : " + ((double)time/1000) + " seconds." );
			
			
			try ( BufferedInputStream inputStream =
					new BufferedInputStream( new FileInputStream(args[0]) );
				    BufferedOutputStream outputStream =
				    new BufferedOutputStream( new FileOutputStream(fileName[0]
				    + "_buffered2." + fileName[1] ) ) ) {
				
				int c;
				while ( (c = inputStream.read() ) != -1 ) {
					outputStream.write(c);
				}
				
			}
			
			System.out.println("Third copy was sucessfull!");
			time = System.currentTimeMillis() - time;
			System.out.println("Time : " + ((double)time/1000) + " seconds." );
			
			try ( FileInputStream inputStream =
					 new FileInputStream(args[0]) ;
				    FileOutputStream outputStream =
				     new FileOutputStream(fileName[0]
				    + "_notBuffered2." + fileName[1] ) )  {
				
				int c;
				while ( (c = inputStream.read() ) != -1 ) {
					outputStream.write(c);
				}
				
			}
			
			System.out.println("Fourth copy was sucessfull!");
			time = System.currentTimeMillis() - time;
			System.out.println("Time : " + ((double)time/1000) + " seconds." );
			
			
		}
		
		
	}

}

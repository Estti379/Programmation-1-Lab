package lu.uni.lab10.Exercise4.MyFindAndGrep;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class MyFindAndGrep {
	
	
	private File searchDir;
	private String extension;
	private String[] termsToSearch;
	private File outputFile;
	private List<File> possibleHits;
	
	public MyFindAndGrep() {
		possibleHits = new ArrayList<>();
	}
	
	public void useFindAndGrep(String[] parameter) throws IllegalArgumentException, IOException {
		if( parameter.length < 4 ) {
			//TODO create and thrown error
			System.out.println("Not enough parameters!");
		} else {
			formatCommand(parameter);
			find(searchDir, extension);
			grep(possibleHits, termsToSearch, outputFile);
		}
		
	}
	
	private void formatCommand(String[] parameter) throws IllegalArgumentException {
		File tempFile = new File(System.getProperty("user.dir")
									+ File.separator + parameter[0] + File.separator);
		
		termsToSearch = new String[parameter.length - 3];
		
		/* Test if searchDir is a directory */
		if ( !tempFile.exists() ) {
			throw new IllegalArgumentException();
		} else if ( !tempFile.isDirectory() ) {
			throw new IllegalArgumentException();
		} else { /* TempFile exists AND it is a directory */
			searchDir = tempFile;
			
			extension = parameter[1];
			
			for (int i = 2 ; i < (parameter.length -1) ; i++ ) {
				termsToSearch[i - 2] = parameter[i];
				}
		
			outputFile = new File( parameter[ parameter.length -1 ] );
			
		}
		
	}
	
	private void find(File currentDir, String extension) {
		String[] filesAndFolders  = currentDir.list();
		File currentFile;
		String currentFilePath;
		int extensionLength = extension.length();
		int stringLengthDiff;
		
		if ( filesAndFolders.length == 0 ) {
			/* Leave, here is nothing to find */
		} else {
			for (int i = 0 ; i < filesAndFolders.length ; i++) {
				currentFile = new File(currentDir.getPath()
									   + File.separator
									   + filesAndFolders[i]);
				if ( currentFile.isDirectory() ) {
					find(currentFile, extension);
				} else if ( currentFile.canRead() ) {
					
					// Check for extension
					currentFilePath = currentFile.getPath();
					stringLengthDiff = currentFilePath.length()
										- extensionLength;
					
					if ( extension.equals(
							currentFilePath.substring(stringLengthDiff) ) )  {
						possibleHits.add(currentFile);
					}
					
				} else {
					/* Leave, here is nothing to find */
				}
				
			}
		}

	}
	
	private void grep(List<File> possibleHits, String[] termsToSearch,
						File outputFile) throws IOException {
		
		BufferedWriter outputStream = null;
		String thisLine = null;
		boolean found = false;
		String[] toBeCreatedDir;
		File outputDir;
		
		//Open the right output stream
		if ( outputFile.getName().equals("/dev/pts/0") ) {
			outputStream = new BufferedWriter(
							new OutputStreamWriter(System.out) );
		} else {
			toBeCreatedDir = outputFile.getName().split(File.separator);
			outputDir = new File(System.getProperty("user.dir")
									+ "\\" + File.separator + toBeCreatedDir[0]);
			/* Create directories for output file, if needed */
			if ( !outputFile.exists() ) {
//				for ( int i ; ; ) {
				System.out.println("AA");
//				}
			}
			outputStream = new BufferedWriter(new FileWriter(outputFile) );
		}
		
		//Start searching for the expressions
		for (File currentFile : possibleHits) {
			
			try(BufferedReader inputStream = new BufferedReader(
											 new FileReader(currentFile) ) ) {
				
				/* Read File Line by Line */
				while ( (thisLine = inputStream.readLine() ) != null) {
					found = false;
					for (String thisTerm : termsToSearch) {
						/* Check if line contains the searched term.
						 * Stop checking if the line was printed once
						 */
						if ( (thisLine.contains(thisTerm) ) && (!found) ) {
							outputStream.write(currentFile.getName() + " : "
												+ thisLine + "\n");
							found = true;
						}
					}
				}
			
			
			
			
			} catch (FileNotFoundException e) {
				System.out.println("Failed to find File: "
									+ currentFile.getName() );
			} catch (IOException e) {
				System.out.println("Failed to open File: "
						+ currentFile.getName() );
			}
		}
		
		outputStream.close();
	}
	
	
	// used for debugging
	@Override
	public String toString() {
		if (possibleHits.isEmpty()) {
			System.out.println("There was no hit!");
		} else {	
			for ( File currentFile : possibleHits ) {
				System.out.println(currentFile.getPath());
			}
		}
		
		return null;
	}
	
}

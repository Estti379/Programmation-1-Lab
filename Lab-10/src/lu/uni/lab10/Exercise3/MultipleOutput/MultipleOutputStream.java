package lu.uni.lab10.Exercise3.MultipleOutput;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;

public class MultipleOutputStream extends OutputStream {
	
	private HashSet<OutputStream> multipleOutput;
	
	public MultipleOutputStream(OutputStream newOutput) {
		multipleOutput = new HashSet<>();
		addNewOutputStream(newOutput);
	}
	
	public void addNewOutputStream(OutputStream newOutput) {
		multipleOutput.add(newOutput);
	}
	
	
	/* The OutputStream class has different implementations of the overloaded
	 * method "write".
	 * With the exception of write(int b), each of those overloaded methods
	 * call upon write(int b).
	 * Thus, By simply changing write(int b), the other methods will
	 * automatically have the desired effect (using more than one OutPutStream)
	 * 
	 * But we still need to override both flush() and close() to make sure that
	 * each OutpuStream stored in this class has the ability to flush/close
	 * when one of those comands are used on a instance of this class.
	 * 
	 */
	@Override
	public void write(int b) throws IOException {
		
		for ( OutputStream currentOutput : multipleOutput ) {
			currentOutput.write(b);
		}
		
		
	}
	
	@Override
	public void flush() throws IOException {
		for ( OutputStream currentOutput : multipleOutput ) {
			currentOutput.flush();
		}
	}
	
	@Override
	public void close() throws IOException {
		for ( OutputStream currentOutput : multipleOutput ) {
			currentOutput.close();
		}
	}

}

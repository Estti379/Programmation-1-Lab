package lu.uni.lab10.Exercise4.MyFindAndGrep;

public class IllegalArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2384816369101535517L;

	public IllegalArgumentException() {
		super("This path does not exist or it isn't a valid directory.");
	}



}

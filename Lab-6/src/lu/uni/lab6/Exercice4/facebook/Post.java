package lu.uni.lab6.Exercice4.facebook;

class Post {
	
	private final Profile autor;
	private String message;
	
	protected Post(Profile newAutor, String newMessage ) {
		autor = newAutor;
		message = newMessage;
	}
	
	private String getAutorName() {
		return autor.getName();
	}
	
	private String getMessage() {
		return message;
	}
	
	protected void editMessage(User currentUser, String newMessage) {
		if (currentUser == autor) {
			message = newMessage;
			
		} else { /* Wrong user */
			System.out.println("Error: Post - You ( "+ currentUser.getName()
					+" ) no rights to edit this message!");
		}
	}
	
	@Override
	public String toString() {
		
		return ( getAutorName() +":\n" + getMessage() + "\n" );
	}
}

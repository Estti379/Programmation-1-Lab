package lu.uni.lab6.Exercice4.facebook;

abstract public class Profile {
	
	private static int nextID = 1001;
	private int profileID;
	private String name;
	private Post[] posts;
	
	public Profile(String newName) {
		profileID = nextID;
		nextID++;
		name = newName;
		posts = new Post[0];
		
	}
	
	public String getName() {
		return name;
	}
	
	abstract protected void showTimeline(User visitor);
	
	protected void givePosts() {
		for ( int i = 0 ; i < posts.length ; i++ ) {
			System.out.println(posts[i]);
		}
	}
	
	protected void addPost(Post newPost) {
		Post[] newPostList = new Post[posts.length + 1];
		for (int i = 0 ; i < posts.length ; i++ ) {
			newPostList[i + 1] = posts[i];
		}
		newPostList[0] = newPost;
		posts = newPostList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	protected void editPost(User currentUser, String newMessage, int index) {
		if ( index < posts.length) {
			posts[index].editMessage(currentUser, newMessage);
		} else {
			System.out.println("Error: Profile - This post doesn't exist!");
		}
	}
	
	@Override
	public String toString() {
		
		return "Name: " +this.getName() + "\nProfile ID:"
				+ Integer.toString(profileID);
	}
}

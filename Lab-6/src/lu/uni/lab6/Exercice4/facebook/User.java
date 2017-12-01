package lu.uni.lab6.Exercice4.facebook;

public class User extends Profile{
	
	User[] friends;
	
	public User(String newName) {
		super(newName);
		friends = new User[0];
		
	}
	
	public boolean isAFriendOf(User possibleFriend) {
		boolean isAFriend = false;
		int i = 0;
		
		while ( (i < friends.length) && (!isAFriend) ) {
			if ( friends[i] == possibleFriend) {
				isAFriend = true;
			}
			i++;
		}
		
		return isAFriend;
	}
	
	public void addFriend(User newFriend) {
		User[] newFriendList = new User[friends.length + 1];
		
		if ( newFriend == this) {
			System.out.println("Error: User - You( "+ this.getName()+" )"
					+ " can't add yourself as friend!!");
		} else if ( !this.isAFriendOf(newFriend) ) {
			for (int i = 0 ; i < friends.length ; i++) {
				newFriendList[i] = friends[i];
			}
			newFriendList[friends.length] = newFriend;
			friends = newFriendList;
			newFriend.addFriend(this);
		}
		
	}
	
	
	public void publyPost(Profile correspodence, String newMessage) {
		Post newPost = new Post(this, newMessage);
		correspodence.addPost(newPost);	
	}
	
	public void changeMessageAt(Profile correspondence, String newMessage, 
								int messageNumber) {
		
		correspondence.editPost(this, newMessage, messageNumber);
	}
	
	public void visitTimelineFrom(Profile target) {
		target.showTimeline(this);
	}
	
	public void likeAPage(Page target) {
		target.addLike();
	}
	
	@Override
	protected void showTimeline(User visitor) {
		if ( (this.isAFriendOf(visitor) ) || (this == visitor) ) {
			System.out.println("=~~=~~=~~=~~=~~~ " + this.getName()
			+ "'s profile =~~=~~=~~=~~=~~~");
			this.givePosts();
		} else { /* They are not friends nor the owner of the timeline */
			System.out.println("Error: User - Visitor(" + visitor.getName()
			+ ") can't access the timeline");
		}
		
	}
	
	
}

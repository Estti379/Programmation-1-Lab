package lu.uni.lab6.Exercice4.facebook;

public class Page extends Profile {
	private int likeCounter;
	
	public Page(String newName) {
		super(newName);
		likeCounter = 0;
	}
	
	protected void addLike() {
		likeCounter++;
	}
	
	@Override
	protected void showTimeline(User visitor) {
		System.out.println("=~~=~~=~~=~~=~~~ " + this.getName()
		+ "'s official page =~~=~~=~~=~~=~~~");
		this.givePosts();
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nLikes: " + likeCounter;
	}
}

package lu.uni.lab6.Exercice4;

import lu.uni.lab6.Exercice4.facebook.Page;
import lu.uni.lab6.Exercice4.facebook.User;

public class Launcher {

	public static void main(String[] args) {
		User jamesDamore = new User("James Damore");
		User jordanPeterson = new User("Jordan Peterson");
		Page bookWorms = new Page("Book Worms");
		User basedGoddess = new User("Based Godess");
		User basedMom = new User("Christina Hoff Sommers");
		
		jordanPeterson.visitTimelineFrom(jamesDamore);
		jamesDamore.addFriend(jamesDamore);
		jamesDamore.addFriend(jordanPeterson);
		jamesDamore.publyPost(jordanPeterson, "How are you doing, jordan?");
		jordanPeterson.publyPost(jamesDamore, "Doing well, how about you?");
		jamesDamore.publyPost(jamesDamore, "Today I had lunch!");
		jordanPeterson.visitTimelineFrom(jamesDamore);
		jamesDamore.visitTimelineFrom(jordanPeterson);
		
		basedGoddess.visitTimelineFrom(jordanPeterson);
		
		basedGoddess.publyPost(jordanPeterson, "I know you can read this. "
				+ "We really should befriend each other here!");
		
		jordanPeterson.visitTimelineFrom(jordanPeterson);
		
		basedGoddess.publyPost(bookWorms, "Oh, come on. Why can't I read "
				+ "what jiurdan writes?");
		basedMom.publyPost(bookWorms, "Who are you actually?");
		basedGoddess.visitTimelineFrom(bookWorms);
		
		basedGoddess.setName("Camille Paglia");
		basedGoddess.publyPost(bookWorms, "My bad, forgot I have "
				+ "been using my Nickname.");
		basedMom.visitTimelineFrom(bookWorms);
		
		basedGoddess.publyPost(bookWorms, "Oh my, what a typo... "
								+ "Let me edit that really quick.");
		basedGoddess.changeMessageAt(bookWorms, "Oh, come on. Why can't I "
				+ "read what Jordan writes?" , 3);
		basedMom.visitTimelineFrom(bookWorms);
		
		jordanPeterson.likeAPage(bookWorms);
		System.out.println(bookWorms);
		
	}

}

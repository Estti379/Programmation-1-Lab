package lu.uni.lab4.exercice4;

import java.util.Random;

public class Shop {
	
	private static int maxNumberOfGiveaways = 0;
	
	private int localNumberOfGiveaways;
	
	Shop(int localGiveAways) {
		localNumberOfGiveaways = localGiveAways;
		maxNumberOfGiveaways = maxNumberOfGiveaways + localGiveAways;
	}
	
	
	void buy(Item item) {
		double priceItem = item.getPrice();
		Random generator = new Random(System.currentTimeMillis());
		int chance = 0;
		
		System.out.println("You bought an Item for " + priceItem
							+ " euros.");
		if( localNumberOfGiveaways <= 0 ) {
			System.out.println("Unfortunately, there are no giveaways left in"
								+ " our shop.");
			if ( maxNumberOfGiveaways <= 0  ) {
				System.out.println("And it looks like our national pool is"
									+" empty, too.");
			}
			
		}
		
		
		if( (localNumberOfGiveaways > 0) && (maxNumberOfGiveaways > 0) ) {
			if( priceItem < 20 ) {
				chance = 2;
			} else if( (priceItem >= 20) && (priceItem <= 100) ) {
				chance = 5;
			} else if( priceItem > 100 ) {
				chance = 10;
			}
		}
		
		if( chance >= (generator.nextInt(99) + 1) ) {
			System.out.println("Hooray! You are the lucky winner of our "
								+"giveaway!!!");
		localNumberOfGiveaways--;
		maxNumberOfGiveaways--;
		}
		
	}
	
	static boolean isGiveAwayOnGoing() {
		boolean isOnGoing = false;
		if( maxNumberOfGiveaways > 0 ) {
			isOnGoing = true;
		}
		return isOnGoing ;
	}
}

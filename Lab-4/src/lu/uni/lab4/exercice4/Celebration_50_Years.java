package lu.uni.lab4.exercice4;

import java.util.Random;
import java.util.Scanner;

public class Celebration_50_Years {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random(System.currentTimeMillis());
		int userInt = 0;
		int randomShop = 0;
		int i = 0;
		Item boughtItem;
		
		Shop aspelt, hellange, frisange;
		
		do {
			System.out.println("How many giveaways (in total) are you ready to"
								+"give out?");
			userInt = scanner.nextInt();
		} while ( (userInt % 3) != 0);
			
		aspelt = new Shop( (userInt)/3 );
		hellange = new Shop( (userInt)/3 );
		frisange = new Shop( (userInt)/3 );
		
		do {
			boughtItem = new Item( (double)(generator.nextInt(12001) ) / 100 );
			randomShop = generator.nextInt(3);
			
			switch(randomShop) {
			case 0:
				aspelt.buy(boughtItem);
				break;
			case 1:
				hellange.buy(boughtItem);
				break;
			case 2:
				frisange.buy(boughtItem);
				break;
			default:
				break;
			}
			
			if ( !( Shop.isGiveAwayOnGoing() ) ) {
				i++;
			}
			
		} while( i <= 3 );
		
		
		
		
		scanner.close();
	}

}

package lu.uni.lab9.Exercice2.StarTrek.Items;

import java.util.Random;

public class Crystal {
	
	private static final int maxEnergy = 500;
	private static final int minEnergy = 100;
	private static Random random = new Random( System.currentTimeMillis() );
	
	private final int energy;
	
	
	public Crystal() {
		energy = random.nextInt( maxEnergy - 1 ) + minEnergy + 1;
	}


	protected int getEnergy() {
		return energy;
	}
	
	
}

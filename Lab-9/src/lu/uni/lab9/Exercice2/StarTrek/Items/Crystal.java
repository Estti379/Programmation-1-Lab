package lu.uni.lab9.Exercice2.StarTrek.Items;

import java.util.Random;

public class Crystal {
	
	private static final int MAX_ENERGY = 500;
	private static final int MIN_ENERGY = 100;
	private static Random random = new Random( System.currentTimeMillis() );
	
	private final int energy;
	
	
	public Crystal() {
		energy = random.nextInt( MAX_ENERGY - 1 ) + MIN_ENERGY + 1;
	}


	protected int getEnergy() {
		return energy;
	}
	
	
}

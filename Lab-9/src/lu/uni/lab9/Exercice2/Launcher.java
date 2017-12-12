package lu.uni.lab9.Exercice2;

import lu.uni.lab9.Exercice2.StarTrek.KlingtonStarship;
import lu.uni.lab9.Exercice2.StarTrek.Outpost;
import lu.uni.lab9.Exercice2.StarTrek.Starship;

public class Launcher {

	public static void main(String[] args) {
		
		// Creating outposts and 3 Starships
		Outpost alliedOutpost = new Outpost("Federation Outpost");
		Outpost enemyOutpost = new Outpost("Klingon Outpost");
		
		Starship federationHope = new Starship("SS Hope");
		Starship federationGlory = new Starship("SS Glory");
		
		KlingtonStarship klingonShadow = new KlingtonStarship("SC Shadow");
		
		// Rearming Starships
		
		alliedOutpost.rearmStarship(federationGlory);
		alliedOutpost.rearmStarship(federationHope);
		
		enemyOutpost.rearmStarship(klingonShadow);
		
		// Preparing for battle. SS Hope forgets to use crystals.
		
		federationGlory.useCrystal();
		
		klingonShadow.useCrystal();
		
		// Battle starts
		System.out.println("\n" + klingonShadow.getName() + ", "
				+ federationGlory.getName() + " and "
				+ federationHope.getName() + " start fighting!");
		
		System.out.println("\nRound 1: ");
		
		federationGlory.useSimpleLaser(federationGlory);
		federationHope.useSimpleLaser(klingonShadow);
		klingonShadow.useSimpleLaser(federationHope);
		
		klingonShadow.useCrystal();
		federationGlory.useCrystal();
		federationHope.useCrystal();
		
		System.out.println("\nRound 2: ");
		
		federationGlory.useSimpleLaser(klingonShadow);
		federationHope.useSimpleLaser(klingonShadow);
		klingonShadow.useBurstLaserFire(federationHope);
		
		klingonShadow.useCrystal();
		federationGlory.useCrystal();
		federationHope.useCrystal();
		
		System.out.println("\nRound 3: ");
		
		klingonShadow.engageCloak();
		
		federationGlory.useSimpleLaser(klingonShadow);
		federationHope.useSimpleLaser(klingonShadow);
		klingonShadow.useBurstLaserFire(federationHope);
		
		klingonShadow.useCrystal();
		
		// KlingtonStarship flees
		System.out.println("\n" + klingonShadow.getName() + " flees the "
				+ "battlefield while cloaked!\n");
		klingonShadow.disengageCloak();
		enemyOutpost.repairStarship(klingonShadow);
		
		System.out.println("The federation ships are able to locate "
							+ klingonShadow.getName() + " and "
							+ enemyOutpost.getName() + ". They engage them!" );
		
		//Second battle
		System.out.println("\nRound 1: ");
		
		federationGlory.useSimpleLaser(klingonShadow);
		federationHope.useSimpleLaser(enemyOutpost);
		klingonShadow.useBurstLaserFire(federationHope);
		
		klingonShadow.useCrystal();
		federationGlory.useCrystal();
		federationHope.useCrystal();
		
	}

}

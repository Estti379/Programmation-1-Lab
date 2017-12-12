package lu.uni.lab9.Exercice2.StarTrek.Items;

import java.util.ArrayList;
import java.util.List;
import lu.uni.lab9.Exercice2.StarTrek.SpaceStructure;
import lu.uni.lab9.Exercice2.StarTrek.Starship;

public class CrystalContainer extends CargoObject implements Consumable{
	
	private List<Crystal> storedCrystal;
	
	public CrystalContainer() {
		storedCrystal = new ArrayList<>();
	}
	
	public int getStoredAmmount()  {
		return storedCrystal.size();
	}
	
	
	@Override
	public void consumeItem(SpaceStructure target) {
		int energyRecharged = 0;
		/* TODO To use "instance of" or not? */
		Starship myTarget = (Starship) target;
		if ( storedCrystal.size() != 0 ) {
			energyRecharged = storedCrystal.get(0).getEnergy();
			this.removeItem(1);
			
			myTarget.rechargeEnergy(energyRecharged);
		}
		
		
		
	}

	@Override
	public void addItem(int ammount) {
		for (int i = 0 ; i < ammount ; i++ ) {
			storedCrystal.add( new Crystal() );
		}
		
	}

	@Override
	public void removeItem(int ammount) {
		for (int i = 0 ; i < ammount ; i++ ) {
			storedCrystal.remove(0);
		}
		
		
	}

}

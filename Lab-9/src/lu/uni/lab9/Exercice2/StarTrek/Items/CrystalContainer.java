package lu.uni.lab9.Exercice2.StarTrek.Items;

import java.util.List;
import lu.uni.lab9.Exercice2.StarTrek.SpaceStructure;
import lu.uni.lab9.Exercice2.StarTrek.Starship;

public class CrystalContainer extends CargoObject implements Consumable{
	
	private List<Crystal> storedCrystal;
	
	
	@Override
	public void consumeItem(SpaceStructure target) {
		int energyRecharged = 0;
		Starship myTarget = (Starship) target;
		if ( storedCrystal.size() != 0 ) {
			energyRecharged = storedCrystal.get(0).getEnergy();
			storedCrystal.remove(0);
			
			myTarget.rechargeEnergy(energyRecharged);
		}
		
		
		
	}

	@Override
	public void addItem() {
		storedCrystal.add( new Crystal() );
		
	}

	@Override
	public void removeItem() {
		storedCrystal.remove(0);
		
	}

}

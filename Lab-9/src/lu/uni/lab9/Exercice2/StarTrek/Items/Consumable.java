package lu.uni.lab9.Exercice2.StarTrek.Items;

import lu.uni.lab9.Exercice2.StarTrek.SpaceStructure;

public interface Consumable {

	public void consumeItem(SpaceStructure target);
	
	public void addItem(int ammount);
	
	public void removeItem(int ammount);
}

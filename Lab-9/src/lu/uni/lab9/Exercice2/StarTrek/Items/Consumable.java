package lu.uni.lab9.Exercice2.StarTrek.Items;

import lu.uni.lab9.Exercice2.StarTrek.SpaceStructure;

public interface Consumable {

	public int consumeItem(SpaceStructure target);
	
	public void addItem();
	
	public void removeItem(int index);
}
package lu.uni.lab9.Exercice2.StarTrek;

public abstract class SpaceStructure implements Attackable{
	
	private String name;
	
	public SpaceStructure(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
}

package lu.uni.lab9.Exercice2.StarTrek;

public class Outpost extends SpaceStructure {
	
	private boolean destroyed;
	
	public Outpost(String newName) {
		super(newName);
		
		destroyed = false;
	}

	@Override
	public void getHit(int damage) {
		
		if ( damage > 0 ) { /* Waterguns won't destroy an outpost... */
			System.out.println( this.getName() + " was destroyed!" );
			destroyed = true;
		}

	}

	@Override
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void repairStarship(Starship target) {
		target.restoreShield();
	}
	
	public void rearmStarship(Starship target) {
		
		target.getCrystalCargo().addItem(100
				- target.getCrystalCargo().getStoredAmmount() );
	}
}

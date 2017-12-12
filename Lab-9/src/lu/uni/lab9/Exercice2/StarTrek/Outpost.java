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
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "perform any actions.");
		} else {
			target.restoreShield();
		}
	}
	
	public void rearmStarship(Starship target) {
		
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "perform any actions.");
		} else {
			target.getCrystalCargo().addItem(100
				- target.getCrystalCargo().getStoredAmmount() );
		
			System.out.println(target.getName() + " was rearmed at "
							+  this.getName() + ".");
		}
		
	}
}

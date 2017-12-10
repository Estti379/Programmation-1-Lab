package lu.uni.lab9.Exercice2.StarTrek;

public class Starship extends SpaceStructure implements Repairable{
	
	private final int maxShield = 1000;
	private int shield;
	private int energy;
	
	
	public Starship(String newName) {
		super(newName);
		
		shield = maxShield;
		energy = 0;
	}
	
	private void attackShip(Attackable target, int damage) {
		
		if ( damage > energy ) { 
			System.out.println( this.getName() + " has not enough energy to "
					+ "perform it's attack!");
		} else if  ( !target.isTargetable() ) {
			/* is empty */
		} else if (this == target) {
			System.out.println( this.getName() + " is trying to target himself"
					+ ". The attack failed!");
		} else {
			target.getHit(damage);
			energy = energy - damage;
		}
		
	}
	
	public void useSimpleLaser(Attackable target) {
		attackShip(target, 200);
	}

	@Override
	public void getHit(int damage) {
		shield = shield - damage;

		if ( this.isDestroyed() ) {
			System.out.println( this.getName() + " was destroyed!" );
		}
		
	}

	@Override
	public boolean isDestroyed() {
		boolean destroyed = false;
		
		if (shield == 0) {
			destroyed = true;
		} else if (shield < 0) {
			shield = 0;
			destroyed = true;
		}
		
		return destroyed;
	}

	@Override
	public void restoreShield() {
		shield = maxShield;
		
	}
	
	public void useCrystal() {
		
	}
}

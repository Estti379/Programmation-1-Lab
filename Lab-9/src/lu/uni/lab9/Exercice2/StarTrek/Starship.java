package lu.uni.lab9.Exercice2.StarTrek;

import lu.uni.lab9.Exercice2.StarTrek.Items.CrystalContainer;

public class Starship extends SpaceStructure implements Repairable{
	
	private final int maxShield = 1000;
	private int shield;
	private int energy;
	private CrystalContainer crystalCargo;
	
	public Starship(String newName) {
		super(newName);
		
		shield = maxShield;
		energy = 0;
		crystalCargo = new CrystalContainer();
	}
	
	public int getEnergy() {
		return energy;
	}
	
	protected void setEnergy(int energy) {
		this.energy = energy;
	}
	
	protected CrystalContainer getCrystalCargo() {
		return crystalCargo;
	}
	
	public void rechargeEnergy(int energy) {
		this.energy = this.energy + energy;
		
		System.out.println(this.getName() + " restored " + energy
				+ " energy and has a total of " + this.energy + " energy!");
	}
	
	protected void attackShip(Attackable target, int damage) {
		
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "perform any actions.");
		} else {
			/* TODO How to solve this?*/
	//		System.out.println(this.getName() + " attacks" + target.getName());
			System.out.println(this.getName() + " launches an attack.");
			
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
		
	}
	
	public void useSimpleLaser(Attackable target) {
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "perform any actions.");
		} else {
			attackShip(target, 200);
		}
	}

	@Override
	public void getHit(int damage) {
		shield = shield - damage;
		System.out.println(this.getName() + " was hit for " + damage + "!");

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
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "be repaired.");
		} else {
			shield = maxShield;
		}
		
	}
	
	public void useCrystal() {
		if ( isDestroyed() ) {
			System.out.println(this.getName() + " is destroyed. It can't "
								+ "perform any actions.");
		} else {
			crystalCargo.consumeItem(this);
		}
	}
}

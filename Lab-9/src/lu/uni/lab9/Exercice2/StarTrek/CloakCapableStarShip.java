package lu.uni.lab9.Exercice2.StarTrek;

public abstract class CloakCapableStarShip extends Starship implements Cloakable {
	
	private CloakStatus cloaking;
	
	public CloakCapableStarShip(String newName) {
		super(newName);
		cloaking  = CloakStatus.DISABLED;
		
	}
	
	@Override
	public CloakStatus getCloakStatus() {
		/* Avoiding to send the object */
		return CloakStatus.valueOf( cloaking.toString() );
	}

	@Override
	public void engageCloak() {
		cloaking = CloakStatus.ENABLED;
		
		System.out.println(this.getName() + " activated it's cloaking devices!");
	}

	@Override
	public void disengageCloak() {
		cloaking = CloakStatus.DISABLED;
		System.out.println(this.getName() + " deactivated it's cloaking devices!");
	}
	
	@Override
	protected void attackShip(Attackable target, int damage) {
		
		/* TODO How to solve this?*/
//		System.out.println(this.getName() + " attacks" + target.getName());
		System.out.println(this.getName() + " launches an attack.");
		
		if ( damage > getEnergy() ) { 
			System.out.println( this.getName() + " has not enough energy to "
					+ "perform it's attack!");
		} else if  ( !target.isTargetable() ) {
			/* is empty */
		}else if (this.getCloakStatus() == CloakStatus.ENABLED) {
			System.out.println(this.getName() + " is cloaked and can't attack!");
		} else if (this == target) {
			System.out.println( this.getName() + " is trying to target himself"
					+ ". The attack failed!");
		} else {
			target.getHit(damage);
			this.setEnergy(getEnergy() - damage);
		}
	}
}

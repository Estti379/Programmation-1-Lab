package lu.uni.lab9.Exercice2.StarTrek;

public class KlingtonStarship extends CloakCapableStarShip {

	public KlingtonStarship(String newName) {
		super(newName);
	}
	
	@Override
	public boolean isTargetable() {
		
		boolean targetable = true;
		
		if ( this.isDestroyed() ) {
			targetable = false;
			System.out.println("Can't target a destroyed Structure.");
		} else if ( getCloakStatus() == CloakStatus.ENABLED ) {
			targetable = false;
			System.out.println("Can't target a cloaked structure.");
		}
		
		return targetable;
	}
	
	public void useBurstLaserFire(Attackable target) {
		attackShip(target, Math.min( getEnergy(), 500) );
	}
	
}

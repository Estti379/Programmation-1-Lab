package lu.uni.lab9.Exercice2.StarTrek;

public class KlingtonStarship extends CloakCapableStarShip {

	public KlingtonStarship(String newName) {
		super(newName);
	}
	
	
	
	public void useBurstLaserFire(Attackable target) {
		attackShip(target, Math.min( getEnergy(), 500) );
	}
	
}

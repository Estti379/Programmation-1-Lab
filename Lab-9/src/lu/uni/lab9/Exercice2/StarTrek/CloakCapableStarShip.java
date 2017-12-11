package lu.uni.lab9.Exercice2.StarTrek;

public class CloakCapableStarShip extends Starship implements Cloakable {
	
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
		
	}

	@Override
	public void disengageCloak() {
		cloaking = CloakStatus.DISABLED;
		
	}
}

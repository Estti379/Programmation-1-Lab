package lu.uni.lab9.Exercice2.StarTrek;

public interface Cloakable {
	/* Even though every class implementing this interface will have a
	 * "CloakStatus" object, I decided to put those methods in this interface,
	 * just incase that something that is NOT a Starship gets the ability to
	 * cloak. (Like a special Outpost, little fighterspacecraft, moons, ect.
	 */
	
//	CloakStatus status;
	/* This makes no sense, this would become
	* "final"/constant
	*
	*/
	
	public CloakStatus getCloakStatus();
	
	public void engageCloak();
	
	public void disengageCloak();
	
}

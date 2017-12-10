package lu.uni.lab9.Exercice2.StarTrek;

public interface Attackable {
	
	public void getHit(int damage);
	
	public boolean isDestroyed();
	
	default public boolean isTargetable() {
		/* All Attackable Objects are targetable by default, unless they 
		 * are destroyed.
		 */
		boolean targetable = true;
		
		if ( this.isDestroyed() ) {
			targetable = false;
			System.out.println("Can't target a destroyed Structure.");
		}
		
		return targetable;
	}
}

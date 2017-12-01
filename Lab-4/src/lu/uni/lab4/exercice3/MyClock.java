package lu.uni.lab4.exercice3;

public class MyClock {

	public static void main(String[] args) {
		int i;
		DateTime currentTime;
		
		boolean us = true;
		String delimiter = "-";
		
		
		
		currentTime = new DateTime(28, 2, 2001, 23, 0, 0);
		
		for( i = 0; i < 400000 ; i++ ) {
			currentTime.tick();
			
			if( (i%100) == 0 ) {
				currentTime.print(us, delimiter);
				System.out.println();
			}
		}
		
		
	}

}

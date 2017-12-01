package lu.uni.lab6.Exercice3;

public class Schedule {

	private String takeOffDate;
	private Flight route;
	private Passenger[] passengerList;
	private Pilot mainPilot;
	private Pilot coPilot;
	private Plane airbus;
	
	public Schedule(String newTakeOffDate, Flight newRoute,
			Passenger[] newPassengerList, Pilot newMainPilot,
			Pilot newCoPilot, Plane newAirbus) {
		
		takeOffDate = newTakeOffDate;
		route = newRoute;
		mainPilot = newMainPilot;
		coPilot = newCoPilot;
		airbus = newAirbus;
		setPassengerList(newPassengerList);
		
	}
	
	/* Setters */
	
	public Pilot getCoPilot() {
		return coPilot;
	}
	
	public Pilot getMainPilot() {
		return mainPilot;
	}
	
	public Passenger[] getPassengerList() {
		return passengerList;
	}
	
	public Flight getRoute() {
		return route;
	}
	
	public String getTakeOffDate() {
		return takeOffDate;
	}
	
	public Plane getAirbus() {
		return airbus;
	}
	
	/* Getters */
	
	public void setTakeOffDate(String takeOffDate) {
		this.takeOffDate = takeOffDate;
	}
	
	public void setMainPilot(Pilot mainPilot) {
		this.mainPilot = mainPilot;
	}
	
	public void setCoPilot(Pilot coPilot) {
		this.coPilot = coPilot;
	}
	
	public void setRoute(Flight route) {
		this.route = route;
	}
	
	public void setPassengerList(Passenger[] newPassengerList) {
		int i = 0;
		
		if ( newPassengerList.length <= airbus.getCapacity() ) {
			passengerList = new Passenger[airbus.getCapacity()];
			for ( i = 0 ; i < newPassengerList.length ; i++ ) {
				passengerList[i] = newPassengerList[i];
			}
			
		} else {
			System.out.println("Error - Failed to assign passenger list."
					+ " Plane would be over capacity.");
		}
		
	}
	
	public void setAirbus(Plane airbus) {
		Passenger[] newPassengerList = passengerList;
		this.airbus = airbus;
		setPassengerList(newPassengerList);
		
	}
	
	public void addPassenger(Passenger newPassenger) {
		int i = 0;
		
		if ( passengerList.length < airbus.getCapacity() ) {
			for ( i = 0 ; i < passengerList.length ; i++ ) {
				if ( passengerList[i] == null ) {
					passengerList[i] = newPassenger;
				}
			}
			
		} else {
			System.out.println("Error - Failed to add passenger to list."
					+ " Plane is at max capacity.");
		}
	}
}

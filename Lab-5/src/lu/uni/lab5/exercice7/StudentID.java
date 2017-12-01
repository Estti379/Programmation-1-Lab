package lu.uni.lab5.exercice7;

public class StudentID {
	
	private String id;
	
	
	StudentID(String newID) {
		id = new String(newID);
	}
	
	
//	StudentID(boolean winterSemester, int firstYear, int identifier,
//			String checksum) {
//		
//		String newID = new String("");
//		String tempYear = new String("");
//		
//		if ( winterSemester ) {
//			newID = newID + "0";
//		} else {
//			newID = newID + "1";
//		}
//		
//		if ( firstYear < 10 ) {
//			newID = newID + "0" + String.valueOf(firstYear);
//		} else {
//			tempYear = String.valueOf(firstYear);
//			newID = newID + tempYear.substring(tempYear.length() - 2,
//												tempYear.length() - 1) ;
//		}
//		
//		newID = newID + String.valueOf(identifier) + checksum;
//		
//		/*
//		 * Next line fails, a call to an instructor must be the first statement
//		 */
////		this(newID);
//		
//		id = new String(newID);
//	}
	
	
	int getSemester() {
		int semester = -1;
		String partialID = new String("");
		
		if ( id.length() > 0 ) {
			partialID = partialID + id.charAt(0);
		}
			
		if ( (partialID.equals("0") ) || (partialID.equals("1") ) ) {
			semester = Integer.parseInt(partialID);
			
		} else {
			semester = -1;
		}
		
		return semester;
	}
	
	
	
	int getYear() {
		int year = -1;
		String partialID1 = new String("");
		String partialID2 = new String("");
		
		if ( id.length() > 2 ) {
			partialID1 = partialID1 + id.charAt(1);
			partialID2 = partialID2 + id.charAt(2);
			
			partialID1 = partialID1.replaceAll("[^0-9]", "");
			partialID2 = partialID2.replaceAll("[^0-9]", "");
		}
			
		if ( (partialID1.equals("") ) || (partialID2.equals("") ) ) {
			year = -1;
			
		} else {
			year = 10 * Integer.parseInt(partialID1)
					+ Integer.parseInt(partialID2);
			
		}
		
		if ( (year >= 2) && (year <= 17) ) {
			year = 2000 + year;
		}
		
		return year;
	}
	
	String getChecksum() {
		String partialID = new String("");
		
		if ( id.length() > 9 ) {
			partialID = partialID + id.substring(8, 10);
		}
		
		if ( partialID.equals("") ) {
			partialID = partialID + "-1";
		}
		return partialID;
	}
	
	boolean checkValidity() {
		boolean isValid = false;
		String partialID = new String("");
		String checksum = new String("");
		int rest = -1;
		
		if ( id.length() != 10 ) {
			isValid = false;
			
		} else {
			partialID = partialID + id.substring(0, 8);
			partialID = "1" + partialID.replaceAll("[^0-9]", "");
			
			if ( partialID.length() != 9 ) {
				isValid = false;
				
			} else {
				rest = Integer.parseInt(partialID) % 97;
				checksum = String.format("%02x", rest);
				checksum = checksum.toUpperCase();
				
				if ( checksum.equals( getChecksum().toUpperCase() ) ) {
					isValid = true;
					
				} else {
					isValid = false;
				}
			}
			
		}
		
		if ( (getSemester() == -1) || ( getYear() == -1) ) {
			isValid = false;
		}
		
		return isValid;
	}
	
	
	
}

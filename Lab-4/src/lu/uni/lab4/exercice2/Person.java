package lu.uni.lab4.exercice2;

public class Person {
	String name;
	
	Person(String newName) {
		name = newName;
	}
	
	
	Person(){
		this("Default Name");
	}
	
	String getName() {
		return name;
	}
}

package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<String>();
		
		//Storing elements in computer's memory
		cities.add("London"); //object.method()
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Los Angeles");
		cities.add("Tokyo");
		cities.add("London");
		
		//Retrieve the elements stored in the computer's memory 
		for (String t : cities) {  //"for each" loop
			System.out.println(t);
		}
		
		//Check number of elements in the list
		System.out.println("Total number of elements = " + cities.size());
		
		//Retrieve the item stored at index 1
		//System.out.println("Item strored at index 1 = " + cities.get(1));
		
		//What is the index of Paris?
		//System.out.println("Index of Paris  = " + cities.indexOf("Paris"));
		
		//Is Bangalore in the list?
		
		System.out.println("Is Bangalore on the list? " + cities.contains("Bangalore"));
		
	}

}

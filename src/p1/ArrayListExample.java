package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Arraylist- its a class which implements list interface
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Aarti");
		myList.add("Akansha");
		myList.add("Priyanka");
		myList.add("Prasoon");
		myList.add("Vaibahbi");
		myList.add("Jahnvi");
		System.out.println(myList);
		myList.add("Aravind");
		myList.remove("Aarti");
		myList.remove("Vaibahbi");
		myList.remove("Priyanka");
		System.out.println(myList);
		System.out.println(myList.get(1));
		myList.add(0, "Nikita");
		myList.add(1, "Nikita");
		System.out.println(myList);

	//set class
	Set<String> mySet = new HashSet<String>();
	mySet.add("Monalisha");
	mySet.add("Sayesha");
	System.out.println(mySet);
	mySet.add("Monalisha");
	
	//Map- Hashmap
	HashMap<Integer, String> myMap=new HashMap<Integer,String>();
	myMap.put(1, "One");
	myMap.put(2, "Two");
	System.out.println(myMap);
	System.out.println(myMap.get(1));
	System.out.println(myMap.get(2));
	
	}
}

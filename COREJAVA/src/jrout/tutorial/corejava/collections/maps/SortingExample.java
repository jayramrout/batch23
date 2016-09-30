package jrout.tutorial.corejava.collections.maps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import jrout.tutorial.corejava.io.serialization.Person;

public class SortingExample {

	public static void main(String[] args) {
//		List<Person> persons = new ArrayList<>();
//		persons.add(new Person("John","USA"));
//		persons.add(new Person("Ana","Germany"));
//		persons.add(new Person("Zak","Italy"));
//		persons.add(new Person("Sam","Rome"));
//		persons.add(new Person("Ben","India"));
//		System.out.println(persons);
//		
//		Collections.sort(persons);
//		
//		System.out.println(persons);
//		
//		
//		Collections.sort(persons, new PlaceSorter());
		
		
		SortingExample se = new SortingExample();
		se.sortUsingComparator();
	}

	
	public void sortUsingComparator(){
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("John","USA"));
		persons.add(new Person("Ana","Germany"));
		persons.add(new Person("Zak","Italy"));
		persons.add(new Person("Sam","Rome"));
		persons.add(new Person("Ben","India"));
		System.out.println(persons);
		
		Collections.sort(persons);
		
		System.out.println(persons);
		
		Collections.sort(persons, new PlaceSorter());
		
		System.out.println(persons);
		
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getPlace().compareTo(o2.getPlace());
			}
		});
		/*
		 * This is Lambda Expression...
		 */
		Collections.sort(persons, (o1,o2) -> o1.getPlace().compareTo(o2.getPlace()));
	}
	class PlaceSorter implements Comparator<Person> {
		@Override
		public int compare(Person o1, Person o2) {
			
			return o1.getPlace().compareTo(o2.getPlace());
		}
	}
}

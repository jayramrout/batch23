package jrout.tutorial.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import jrout.tutorial.corejava.io.serialization.Person;

public class CollectionsExample {

	public static void main(String[] args) {
		
//		setExample();
		//listExample();
//		listToSet();

		Set<Person> persons = new HashSet<>();
		persons.add(new Person("John"));
		persons.add(new Person("Ana"));
		persons.add(new Person("Zak"));
		persons.add(new Person("Sam"));
		persons.add(new Person("Ben"));
		
		System.out.println(persons);	
		
		Iterator iter = persons.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
	
	public static void listToSet(){
		List<String> names = fetchNames();
		System.out.println(names);
		
		Set<String> names2 = new HashSet<>(names);
		System.out.println(names2);
	}
	
	public static void setExample(){
		/// Read all the unique words from a file...and the file is all about something..
		
//		List<String> names = new ArrayList();
//		Set<String> names = new HashSet<>();
		Set<String> names = new TreeSet<>();
		
		names.add("Ram");
		names.add("Zak");
		names.add("John");
		names.add("John");
		names.add("Sam");
		
		System.out.println(names);
		// output from set [Zak, John, Sam, Ram]
		// output from List [Ram, Zak, John, John, Sam]
		
		// [Zak, John, Sam, Ram]
		// [John, Ram, Sam, Zak]
	}
	
	public static void listExample(){
		List<String> names = new ArrayList();
		List<String> multiNames = new LinkedList<>();
		
		names.add("Ram");
		names.add("Zak");
		names.add("John");
		names.add("Sam");
		System.out.println(names);
		
		names.add(1, "Jay");
		
		Collections.sort(names);
		
		System.out.println(names);
		
//		List<Integer> ages = new ArrayList();
//		ages.add(100); // 1 ... Integer
//		ages.add(100);
//		
//		System.out.println(ages);
//		for(int i = 0 ; i < 5 ; i++) {
//			ages.add(i);
//		}
//		//ages.add("Jayram");
//		
//		System.out.println(ages);
//		System.out.println(ages.size());
//		
//		System.out.println("ages.get(0) "+ages.get(0));
//		
//		for(int i = 0 ; i < ages.size(); i++) {
//			System.out.print(ages.get(i) +"  ");
//		}
//		
//		
//		for(int age: ages) {
//			System.out.println(age);
//		}
	}
	
	
	public static List<String> fetchNames() {
		
		List<String> names = new ArrayList<>();
		
		names.add("Ram");
		names.add("Zak");
		names.add("John");
		names.add("John");
		names.add("Sam");
		
		return names;
		
		
	}
}

package jrout.tutorial.corejava.string;

import jrout.tutorial.corejava.classesexample.Human;

public class StringExample {

	public static void main(String[] args) {
		String name1 = "Sandeep";
		
		String name2 = "Sandeep";
		
		String name3 = new String("Sandeep"); //never do this...
		
		String name4 = "Vanaja";
		
//		System.out.println(name1 == name2);
		
		System.out.println(name1 == name3);
		
		
		
		System.out.println(name1.equals(name3));
//		
//		System.out.println(name1 == name4);
//		
		Human human1 = new Human("Jathin",23);
		
		Human human2 = new Human("Jathin",23);
		
		System.out.println(human1 == human2 );
		
		System.out.println(human1.equals(human2));
	
//		 public boolean equals(Object obj) {
//		        return (this == obj);
//		    }
		
		
		
	}

}

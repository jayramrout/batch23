package jrout.tutorial.corejava.string;

import jrout.tutorial.corejava.classesexample.Human;

public class StringExample2 {

	public static void main(String[] args) {
//		String firstName = "John";
//		String lastName = "Snow";
//		
//		String fullName = firstName.concat(lastName);
		
		Human human = null;
		
		String name = "John";
		name = name+" Snow";
		
//		String numbers = "";
//		for(int i = 0 ; i < 5; i++) {
//			numbers += i;
//		}
//		System.out.println(numbers);
//		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0 ; i < 5 ;i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
		
		
		Integer integer = new Integer(10);
		int age = integer; // auto boxing....
		System.out.println(integer.toString());
		
		
		StringBuilder sbuilder = new StringBuilder();
		for(int i = 0 ; i < 5 ;i++) {
			sbuilder.append(i);
		}
		System.out.println(sb.toString());
		
		
		
		
		
		
		String firstName = "John";
		firstName = firstName.concat(" Snow");
		
		System.out.println(firstName);
		
		
		
		
	}

}

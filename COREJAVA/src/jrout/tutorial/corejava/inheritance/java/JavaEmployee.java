package jrout.tutorial.corejava.inheritance.java;

import jrout.tutorial.corejava.inheritance.SoftwareEmployee;

public class JavaEmployee extends SoftwareEmployee {

	public JavaEmployee(String name, int id) {
		super(name, id);
	}
	
	
	@Override
	public void officeTime() {
		System.out.println("Office Time for "+ getName()+" is 10:30 AM");
	}
	
	public void understandingAboutJVM(){
		System.out.println("all Java guys have a very good understanding about JVM");
	}
	
	@Override
	public void workLoad() {
		System.out.println("Work load is 3 Hrs...");
	}
	
}
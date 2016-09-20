package jrout.tutorial.corejava.inheritance.interfaceexample;

import jrout.tutorial.corejava.inheritance.SoftwareEmployee;


public class Python extends SoftwareEmployee implements Swimming {

	public Python(String name, int id) {
		super(name, id);
	}

	@Override
	public void workLoad() {
		
	}

	@Override
	public void smim() {
		System.out.println("Java Programmer knows how to swim....");
	}	
}

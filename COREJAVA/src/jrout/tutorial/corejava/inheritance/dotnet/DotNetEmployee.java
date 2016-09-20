package jrout.tutorial.corejava.inheritance.dotnet;

import jrout.tutorial.corejava.inheritance.SoftwareEmployee;

public class DotNetEmployee extends SoftwareEmployee {

	public DotNetEmployee(String name, int id) {
		super(name, id);
		
	}

	@Override
	public void workLoad() {
		System.out.println("Work load is 4 Hrs..");
	}
}

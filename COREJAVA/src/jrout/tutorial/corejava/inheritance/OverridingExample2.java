package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.java.JavaEmployee;

public class OverridingExample2 {
	public static void main(String arg[]) {
		OverridingExample2 oe = new OverridingExample2 ();
		
		
		Employee javaEmp2 = new JavaEmployee("Sandeep",67);
		javaEmp2.setCompanyName("H2KInfosys");
		javaEmp2.officeTime();
		
	}
}

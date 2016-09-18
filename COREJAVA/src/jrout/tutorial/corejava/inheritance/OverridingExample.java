package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.java.JavaEmployee;

public class OverridingExample {
	public static void main(String arg[]) {
		OverridingExample oe = new OverridingExample ();
		
		NonITEmployee nie = new NonITEmployee("Anusha", 45);
		nie.setCompanyName("H2KInfosys");
		nie.officeTime();
		oe.printEmployeeDetails(nie);
		
		
		JavaEmployee javaEmp1 = new JavaEmployee("Sandeep",67);
		nie.setCompanyName("H2KInfosys");
		javaEmp1.officeTime();
		oe.printEmployeeDetails(javaEmp1);
		javaEmp1.understandingAboutJVM();
		
//		Employee javaEmp3 = javaEmp1;
		
		
		Employee javaEmp2 = new JavaEmployee("Sandeep",67);
		javaEmp2.setCompanyName("H2KInfosys");
		javaEmp2.officeTime();
		// How do i call understandingAboutJVM(); using super class reference
//		JavaEmployee temp = (JavaEmployee)javaEmp2;
//		temp.understandingAboutJVM();
		
		
		oe.printEmployeeDetails(javaEmp2);
		
		
		
		
	}
	
	
	public void printEmployeeDetails(Employee employee) {
		System.out.println("Emplyee Details");
		System.out.println(employee.getCompanyName() +" " + employee.getName());
//		employee.understandingAboutJVM();
		
		
	}
}

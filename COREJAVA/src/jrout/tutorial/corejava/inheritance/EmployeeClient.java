package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.java.JavaEmployee;

public class EmployeeClient {

	public static void main(String[] args) {
		/*Employee emp = new Employee("John",23);
		emp.setCompanyName("H2kInfosys");
		System.out.println(emp.getName());*/
		
		/*SoftwareEmployee se = new SoftwareEmployee("Jathin", 34);
		se.setCompanyName("H2kInfosys");
		se.setProgExperience(5);
		se.setProgramName("Java"); */
		
//		System.out.println(se.getName());
		
		
		/*NonITEmployee nie = new NonITEmployee("Anusha", 45);
		se.setCompanyName("H2kInfosys");
		nie.officeTime();
		System.out.println(nie.getName());*/
		
		JavaEmployee javaEmp1 = new JavaEmployee("Sandeep",67);
		javaEmp1.officeTime();
		
		System.out.println(javaEmp1.toString());
		
	}

}

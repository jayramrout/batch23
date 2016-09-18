package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.java.JavaEmployee;

public class InstanceOfExample {
	public static void main(String arg[]) {
		InstanceOfExample ioe = new InstanceOfExample();
		/*Employee javaEmp2 = new JavaEmployee("Sandeep",67){
			@Override
			public void officeTime() {
				System.out.println("Office Time is 12:00 Noon");
			}
			
		};
		javaEmp2.setCompanyName("H2KInfosys");
		javaEmp2.officeTime();*/
		
		Employee javaEmp2 = new JavaEmployee("Sandeep",67);
		javaEmp2.setCompanyName("H2KInfosys");
		ioe.printEmployeeDetails(javaEmp2);

		
		NonITEmployee nie = new NonITEmployee("Anusha", 45);
		nie.setCompanyName("H2KInfosys");
		ioe.printEmployeeDetails(nie);
	}
	
	
	public void printEmployeeDetails(Employee employee) {
		System.out.println("Emplyee Details");
		System.out.println(employee.getCompanyName() +" " + employee.getName());

		if(employee instanceof JavaEmployee) {
			JavaEmployee je = (JavaEmployee) employee;
			je.understandingAboutJVM();
		}else if(employee instanceof NonITEmployee) {
			((NonITEmployee)employee).nonITExperience();
		}
		
		
//		((JavaEmployee)employee).understandingAboutJVM();
		
		
	}
}

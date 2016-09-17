package jrout.tutorial.corejava.inheritance;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee emp = new Employee("John",23);
		emp.setCompanyName("H2kInfosys");
		System.out.println(emp.getName());
		
		SoftwareEmployee se = new SoftwareEmployee("Jathin", 34);
		se.setCompanyName("H2kInfosys");
		se.setProgExperience(5);
		se.setProgramName("Java");
		
		System.out.println(se.getName());
		
		
		NonITEmployee nie = new NonITEmployee("Anusha", 45);
		se.setCompanyName("H2kInfosys");
		
		System.out.println(nie.getName());
	}

}

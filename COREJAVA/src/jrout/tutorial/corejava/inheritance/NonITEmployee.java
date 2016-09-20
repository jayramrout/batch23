package jrout.tutorial.corejava.inheritance;

public class NonITEmployee extends Employee {

	public NonITEmployee(String name , int id) {
		super(name , id);
	} 
	
	public void nonITExperience(){
		System.out.println("This is my Non IT JOB...");
	}

	@Override
	public void workLoad() {
		// TODO Auto-generated method stub
		
	}
}

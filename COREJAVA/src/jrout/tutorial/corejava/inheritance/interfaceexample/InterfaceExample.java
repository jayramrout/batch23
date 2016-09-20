package jrout.tutorial.corejava.inheritance.interfaceexample;

import jrout.tutorial.corejava.inheritance.Employee;

public class InterfaceExample {
	public static void main(String arg[]) {
		InterfaceExample ie = new InterfaceExample();
		
		Python py = new Python("Raj",678);
		py.workLoad();
		py.smim();
		
		
		LabDog ld = new LabDog();
		ld.smim();
		ld.barking();
		
		
		ie.printSwimmingBehaviour(py);
		ie.printSwimmingBehaviour(ld);
		
		
		
		Swimming pys = new Python("Raj",678);
		pys.smim();
		
		Swimming lds = new LabDog();
		lds.smim();
		
		
		
	}
	
	
	public void printSwimmingBehaviour(Swimming swim) {
		swim.smim();
	}
	
	
}

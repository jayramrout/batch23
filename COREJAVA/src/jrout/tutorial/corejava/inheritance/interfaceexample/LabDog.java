package jrout.tutorial.corejava.inheritance.interfaceexample;

public class LabDog extends Animal implements Swimming {

	public void barking()
	{
		System.out.println("It barks really loud...");
	}	
	
	@Override
	public void smim() {
		System.out.println("Lab dog swims as well...");
		
	}
	
}

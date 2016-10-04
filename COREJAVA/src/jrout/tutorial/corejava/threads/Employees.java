package jrout.tutorial.corejava.threads;

public class Employees extends Thread{
	
	public Employees(Printer printer,String name){
		super(printer);
		setName(name);
	}
}

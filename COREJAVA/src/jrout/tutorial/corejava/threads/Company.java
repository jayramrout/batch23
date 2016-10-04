package jrout.tutorial.corejava.threads;

public class Company {

	public static void main(String[] args) {
		
		Printer firstFloorPrinter = new Printer("FirstFloorPrinter");
		
		Employees raj = new Employees(firstFloorPrinter,"Raj");
		
		Employees susmitha = new Employees(firstFloorPrinter,"Susmitha");
		
		Employees vanaja = new Employees(firstFloorPrinter,"Vanaja");
		
		raj.start();
		susmitha.start();
		vanaja.start();
		
		
	}

}


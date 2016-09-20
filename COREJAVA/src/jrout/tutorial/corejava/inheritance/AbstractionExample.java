package jrout.tutorial.corejava.inheritance;

import jrout.tutorial.corejava.inheritance.dotnet.DotNetEmployee;
import jrout.tutorial.corejava.inheritance.java.JavaEmployee;

public class AbstractionExample {

	public static void main(String[] args) {
		
		// Compile time error and RuntimeException..
		
		Employee javaemp = new JavaEmployee("John",222);
		javaemp.workLoad();
		
		Employee dotnetemp = new DotNetEmployee("Mike",255);
		dotnetemp.workLoad();
		
	}

}

package jrout.tutorial.corejava;

public class VariableExample {

	public static void main(String[] args) {
		Keyboard earbud = new Keyboard("Earbud","Black","Samsung");
		earbud.name = "TestBud";
		
		System.out.println(Constants.TYPE);
		System.out.println(Math.PI);
		
		Keyboard light = new Keyboard("Light","White","Apple");
		
		earbud.printKeyboardInformation();
		
		light.printKeyboardInformation("Its pretty Small and does not make much noise..");
		System.out.println(Keyboard.count);
		
		new VariableExample().callMe();
		VariableExample.callMe();
		callMe();
		
//		VariableExample ve = new VariableExample();
//		ve.callMe();
	}
	
	
	public static void callMe(){
		System.out.println("");
	}

}
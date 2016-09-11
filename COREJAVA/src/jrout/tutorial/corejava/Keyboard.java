package jrout.tutorial.corejava;

public class Keyboard {
	final String type = "Computers";
	public String name;
	private String color;
	private String company;
	
	public static int count;
	
	public Keyboard(String name , String color, String company){
		this.name = name;
		this.color = color;
		this.company = company;
		count++;
	}
	
	public void printKeyboardInformation() {
		System.out.println("Name = "+ name +" Color ="+ color + " Company =" + company);
	}
	
	public void printKeyboardInformation(String extraInfo) {
		System.out.println("Name = "+ name +" Color ="+ color + " Company =" + company);
		System.out.println("Extra Info : " + extraInfo);
	}
}

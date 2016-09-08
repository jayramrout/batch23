package jrout.tutorial.corejava.classesexample;

public class Human {
	public String name;
	public int age;
	public Integer height;
	public Float marks;
	public String specilization;
	
	/*public Human(){
	}*/
	
	//1st Constructor
	public Human(String name, int age){
		this.name = name;
		/*if(age > 0 ) {
			this.age = age;	
		}else {
			this.age = 10;
		}*/
		this.age = age > 0 ? age : 10;
	}
	
	//2nd constructor
	public Human(String name, int age , String specilization){
		this(name,age);
		this.specilization = specilization;
	}
	
	// 3rd Const.
	public Human(String name, int age , Integer height ,String specilization){
		this(name, age, specilization);
		this.height = height;
	}
	
}

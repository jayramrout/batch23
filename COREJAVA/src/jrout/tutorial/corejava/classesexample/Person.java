package jrout.tutorial.corejava.classesexample;

public class Person {
	private String name;
	private int age;
	private int height;
	
	public Person(String name, int age){
		this.name = name;
		if(age > 0) {
			this.age = age;
		}else {
			this.age = 10;
		}
//		this.age = age > 0 ? age : 10;
	}
	
	public void setHeight(int height){
		this.height = height > 3 ? height : 4;
	}
	
	public int getHeight(){
		return this.height;
	}
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age > 0 ? age : 10;
	}
	
	@Override
	public String toString() {
		return "Name = "+ this.name +" age = "+ this.age +" Height = "+ this.height;
	}
	
}

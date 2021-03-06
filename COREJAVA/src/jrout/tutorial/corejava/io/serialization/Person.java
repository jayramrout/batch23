package jrout.tutorial.corejava.io.serialization;

import java.io.Serializable;

/**
 * Interfaces without any methods are known as Marker Interface
 * @author Jayram
 *
 */
public class Person implements Serializable , Comparable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5397138856714462475L;
	
	private String name;
	private String place;
	private String profession;
	private transient int ssn;
	private String gender;
	
	public Person(){}
	public Person(String name){this.name = name;}
	public Person(String n,String place) {
		this.name = n; 
		this.place = place;
	}
	public Person(String n, String pr, String place) {
		name = n; profession = pr; this.place = place;
	}
	public Person(String n, String pr, String place, int ssn) {
		name = n; profession = pr; this.place = place;
		this.ssn = ssn;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public String toString() {
		return name +":"+ place;
	}
	@Override
	public int compareTo(Object o) {
		Person obj = (Person)o;
		return this.name.compareTo(obj.getName());
//		return this.place.compareTo(obj.getPlace());
	}
}
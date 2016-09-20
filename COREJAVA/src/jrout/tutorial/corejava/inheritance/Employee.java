package jrout.tutorial.corejava.inheritance;

/**
 * This is an abstract class which has so and so properties....
 * @author jrout
 *
 */
public abstract class Employee {
	private String name;
	private int id;
	private String workInfo;
	private String companyName;
	
	public Employee(String name , int id) {
		this.name = name;
		this.id = id;
	}

	public Employee(String name , int id, String companyName) {
		this(name,id);
		this.companyName = companyName;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getWorkInfo() {
		return workInfo;
	}

	public void setWorkInfo(String workInfo) {
		this.workInfo = workInfo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public void officeTime() {
		System.out.println("Office Time for "+name+" is 10:00 AM");
	}
	/**
	 * This is a workLoad Method which is use to define the specific workload behaviour
	 * of an Employee...
	 */
	public abstract void workLoad();
	
}

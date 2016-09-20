package jrout.tutorial.corejava.inheritance;

public abstract class SoftwareEmployee extends Employee {

	private int progExperience;
	private String programName;
	
	public SoftwareEmployee(String name , int id) {
		super(name , id);
	}

	public int getProgExperience() {
		return progExperience;
	}

	public void setProgExperience(int progExperience) {
		this.progExperience = progExperience;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	} 
	
	
}

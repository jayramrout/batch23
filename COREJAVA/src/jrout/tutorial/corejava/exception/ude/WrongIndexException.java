package jrout.tutorial.corejava.exception.ude;

public class WrongIndexException extends Exception {
	
	private String message;
	public WrongIndexException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
			return "User Defined Exception "+ message;
	}
}

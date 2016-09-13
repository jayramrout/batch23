package jrout.tutorial.corejava.innerclass;

public class InnerClassesExample {
	public String className = "InnerClassesExample";
	
	public static void main(String[] args) {
		System.out.println(Book.count);
		
	
		//Pen rotomac = new Pen();
//		Book book = new Book();
		
		InnerClassesExample ice = new InnerClassesExample();
		System.out.println(ice.className);;
		Book book = ice.new Book();
		
		// Assignment :
		/**
		 * Change the Book class to static and call the printBookDetails method
		 */
//		ice.callParentMethod();
//		InnerClassesExample.callParentMethod();
	}
	
	public static void callParentMethod(){
		
	}
	
	class Book {
		private String name;
		private float cost;
		/**
		 * The field count cannot be declared static in a non-static inner type, unless initialized with a constant expression
		 */
		public final static int count = 90;	
		
		public void printBookDetails(){
			callParentMethod();
		}
	}
}


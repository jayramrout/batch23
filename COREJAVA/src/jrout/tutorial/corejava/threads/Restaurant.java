package jrout.tutorial.corejava.threads;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("Thread Name :"+ Thread.currentThread().getName());
		
		Waiter steveWaiter = new Waiter("Steve");
		steveWaiter.setPriority(Thread.MAX_PRIORITY);
		steveWaiter.start();
		
		Waiter danWaiter = new Waiter("DanWaiter");
		danWaiter.start();

		Waiter panWaiter = new Waiter("PanWaiter");
		panWaiter.start();

	}
}

class Waiter extends Thread {
	private String name;
	public Waiter(String name) {
		this.name = name;
		setName(name);
	}
	
	public void run(){
		serve();
	}
	
	public void serve(){
		//System.out.println( name+ "  serving food " + Thread.currentThread().getName());
		for(int i= 0 ; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + ": "+ name + "Serving Food "+ i);
		}
		
	}
}
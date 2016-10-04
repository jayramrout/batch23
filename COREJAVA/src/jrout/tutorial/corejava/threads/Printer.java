package jrout.tutorial.corejava.threads;

public class Printer extends Thread {
	
	public Printer(String name) {
		setName(name);
	}
	
	@Override
	public synchronized void run() {
		for(int i = 0 ; i < 5 ; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( Thread.currentThread().getName() + " Printer " +getName() + "  "+i);
		}
	}
}
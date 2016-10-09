package jrout.tutorial.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIDemoServer {

	public static void main(String[] args) throws RemoteException {
		RMIDemo demo = new RMIDemoImpl();
		Registry registry = LocateRegistry.createRegistry(2345);
		registry.rebind("RMIDemo", demo);
		
		System.out.println("RMI DEMO binding is completed....");
	}

}

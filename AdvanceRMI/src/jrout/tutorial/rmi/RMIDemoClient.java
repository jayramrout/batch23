package jrout.tutorial.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIDemoClient {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		RMIDemo demo = null;
		Registry registry = LocateRegistry.getRegistry("localhost",2345);
		demo = (RMIDemo)registry.lookup("RMIDemo");
		System.out.println(demo.sayHello("Raja"));
	}
}
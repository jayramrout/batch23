package jrout.tutorial.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoImpl extends UnicastRemoteObject implements RMIDemo , Serializable{
	
	protected RMIDemoImpl() throws RemoteException{
		super();
	}
	
	@Override
	public String sayHello(String name) throws RemoteException {
		return  customMessage() + returnOnly3Char(name);
	}
	
	
	public String customMessage(){
			return "Hello How are you doing .. Today is Monday...we had holiday...";
	}


	public String returnOnly3Char(String name){
		return name.substring(0,4);
	}
	
}

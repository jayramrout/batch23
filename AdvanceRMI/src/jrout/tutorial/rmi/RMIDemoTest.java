package jrout.tutorial.rmi;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

public class RMIDemoTest {
	RMIDemoImpl impl = null;
	
	@Before
	public void setUp() throws Exception {
		impl = new RMIDemoImpl();
	}

	/*@Test
	public void test() {
		//fail("Not yet implemented");
	}*/
	
	
	@Test
	public void return3CharTest() throws RemoteException{
		String only3Char = impl.returnOnly3Char("Vanaja");
		assertEquals("Vana", only3Char);
		//System.out.println(only3Char);
	}
	
	@Test
	public void sayHelloTest() throws RemoteException{
		assertEquals("dfdffdfs", impl.sayHello("Jay"));
	}
	
}

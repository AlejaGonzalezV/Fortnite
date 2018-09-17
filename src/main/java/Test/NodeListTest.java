package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;
import structures.NodeList;

public class NodeListTest extends TestCase {
	private String verbs;
	private String verbsNext;
	private NodeList<String> nodeList;
	
	 public void escenarioUno() {
		
		 verbs =  "Rise";
		 nodeList =  new NodeList<String>(verbs);
	}

	@Test
	public void testGetInfo() {
		
		escenarioUno();
		
		String remot = nodeList.getInfo();
		assertEquals(remot, verbs);
		
	}
	@Test
	public void testSetInfo() {
		escenarioUno();
		String change = " UP";
		nodeList.setInfo(change);
		
		assertEquals(nodeList.getInfo(), change);
		
	}

}

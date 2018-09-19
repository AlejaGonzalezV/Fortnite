package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;
import structures.Structures;

public class StructuresTest extends TestCase{

	private String firstElement;
	private Structures<String> estructure;
	
	void escenarioUno() {
		
		firstElement = "hope";
		estructure = new Structures<String>();
		
	}

	@Test
	public void testPush() {
		
		escenarioUno();
		
		estructure.push(firstElement);
		
		assertEquals(estructure.getTop(), firstElement);
	}
	
	@Test
	public void testPop() {
		escenarioUno();
		
		estructure.push(firstElement);
		
		try {
			String actual = estructure.pop();
			System.out.println(estructure.getTop());
			assertEquals(estructure.getTop(), null);
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	@Test
	public void testTop() throws Exception {
		
		escenarioUno();
		
		estructure.push(firstElement);
		
		String actual = estructure.top();
		
		assertEquals(actual, firstElement);
		
	}
	@Test
	public void TestIsEmptyS() {
		
		escenarioUno();
		estructure.push(firstElement);
		
		assertTrue(false == estructure.isEmptyS());
		
	}
	@Test
	public void testIsEmptyQ() {
		
		escenarioUno();
		
		estructure.enqueque(firstElement);
		
		assertTrue(false == estructure.isEmptyQ());
	}
	@Test
	public void testEnqueque()  {
		
		escenarioUno();
		
		estructure.enqueque(firstElement);
		
		assertTrue(false == estructure.isEmptyQ());

	}
	@Test
	public void testFront() throws Exception {
		
		escenarioUno();
		estructure.enqueque(firstElement);
		String actual = estructure.front();
		assertEquals(actual, firstElement);
	}
	
	@Test
	public void testDequeque() throws Exception {
		
		escenarioUno();
		estructure.enqueque(firstElement);
		
		String actual = estructure.dequeque();
		
		assertEquals(actual, firstElement);
		
	}
}
	


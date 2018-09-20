package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;
import structures.Structures;

public class StructuresTest extends TestCase{

	private String firstElement;
	private Structures<String> structure;
	
	void stageOne() {
		
		firstElement = "hope";
		structure = new Structures<String>();
		
	}

	@Test
	public void testPush() {
		
		stageOne();
		
		structure.push(firstElement);
		
		assertEquals(structure.getTop(), firstElement);
	}
	
	@Test
	public void testPop() {
		stageOne();

		
		structure.push(firstElement);
		
		try {
			String actual = structure.pop();
			System.out.println(structure.getTop());
			assertEquals(structure.getTop(), null);
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	@Test
	public void testTop() throws Exception {
		
		stageOne();
		
		structure.push(firstElement);
		
		String actual = structure.top();
		
		assertEquals(actual, firstElement);
		
	}
	@Test
	public void TestIsEmptyS() {
		
		stageOne();
		structure.push(firstElement);
		
		assertTrue(false == structure.isEmptyS());
	
	}
	@Test
	public void testIsEmptyQ() {
		
		stageOne();
		
		structure.enqueque(firstElement);
		
		assertTrue(false == structure.isEmptyQ());
	}
	@Test
	public void testEnqueque()  {
		
		stageOne();
		
		structure.enqueque(firstElement);
		
		assertTrue(false == structure.isEmptyQ());

	}
	@Test
	public void testFront() throws Exception {
		
		stageOne();
		structure.enqueque(firstElement);
		String actual = structure.front();
		assertEquals(actual, firstElement);
	}
	
	@Test
	public void testDequeque() throws Exception {
		
		stageOne();
		structure.enqueque(firstElement);
		
		String actual = structure.dequeque();
		
		assertEquals(actual, firstElement);
		
	}
	@Test 
	public void testRemoveAll() {
		stageOne();
		
		structure.enqueque(firstElement);
		
		structure.removeAll();
		
		assertEquals(structure.getTop(), null);
	}
	@Test
	public void testSize() {
		stageOne();
		
		structure.enqueque(firstElement);
	
		
		assertTrue(structure.sizeS() == 1);
	}
}
	


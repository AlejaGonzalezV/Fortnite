package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import structures.Structures;

public class StructuresTest {

	private String firstElement;
	private Structures<String> estructure;
	
	void stageOne() {
		
		firstElement = "hope";
		estructure = new Structures<String>();
		
	}

	@Test
	public void testPush() {
		
		stageOne();
		
		estructure.push(firstElement);
		
		assertEquals(estructure.getTop(), firstElement);
	}
	
	@Test
	public void testPop() throws Exception {
		stageOne();
		
		estructure.push(firstElement);
		
		String actual = estructure.pop();
		
		assertEquals(estructure.getTop(), null);
	}
	@Test
	public void testTop() throws Exception {
		
		stageOne();
		
		estructure.push(firstElement);
		
		String actual = estructure.top();
		
		assertEquals(actual, firstElement);
		
	}
	@Test
	public void TestIsEmptyS() {
		
		stageOne();
		estructure.push(firstElement);
		
		assertTrue(false == estructure.isEmptyS());
		
	}
	@Test
	public void testIsEmptyQ() {
		
		stageOne();
		
		estructure.enqueque(firstElement);
		
		assertTrue(false == estructure.isEmptyQ());
	}
	@Test
	public void testEnqueque()  {
		
		stageOne();
		
		estructure.enqueque(firstElement);
		
		assertTrue(false == estructure.isEmptyQ());

	}
	@Test
	public void testFront() throws Exception {
		
		stageOne();
		estructure.enqueque(firstElement);
		String actual = estructure.front();
		assertEquals(actual, firstElement);
	}
	
	@Test
	public void testDequeque() throws Exception {
		
		stageOne();
		estructure.enqueque(firstElement);
		
		String actual = estructure.dequeque();
		
		assertEquals(actual, firstElement);
		
	}
}
	


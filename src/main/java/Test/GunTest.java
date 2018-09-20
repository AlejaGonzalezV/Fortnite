package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import junit.framework.TestCase;
import model.Gun;

public class GunTest extends TestCase{

	private String name;
	private int bullets;
	private Gun gun;
	
	void stageOne() {
		
		
		name = "Shark";
		bullets = 32;
		
		gun = new Gun(name, bullets);
		
	}


	@Test
	public void testGetName() {
		
		stageOne();
	
		assertEquals(gun.getName(), name);
	}
	@Test
	public void testSetName() {
		
		stageOne();
		
		String other = "Bird";
			
		gun.setName(other);
		
		assertEquals(gun.getName(), other);
	
	}
	@Test
	public void testGetBullets() {
		
		stageOne();
		
		int bullet = gun.getBullets();
		assertTrue(bullets == bullet);
	}
	@Test
	public void tesSettBullets() {
		
		stageOne();
		int newbullets = 3;
		gun.setBullets(newbullets);
		
		int updatedBullests = gun.getBullets();
		assertTrue(newbullets == updatedBullests);
		
	}
	
}

package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import interfaces.IStack;
import junit.framework.TestCase;
import model.Gun;
import model.Player;

public class PlayerTest extends TestCase {
	
	private String name;
	private String platform;
	private int ping;
	private Gun gun;
	private Player player;
	
	void stageOne() {
		name = "Pittacus";
		platform = "Xbox";
		ping = 12;
		gun = new Gun("Shark", 32);
		player = new Player(name, platform, ping, gun);
	}
	@Test
	public void testDeleteGun() throws Exception {
		
		stageOne();
		
		player.deleteGun();
		assertEquals(player.getList().top(), null);
		
	}
	@Test
	public void testNameFisrtGun() {
		
		stageOne();
		
		String firstname = player.nameFirstGun();
		
		assertEquals(firstname, gun.getName());
	}
	
	@Test
	public void testBulletsFirstGun() {
		
		stageOne();
		
		int firstGunBullets = player.bulletsFirstGun();
		int actualBullets = gun.getBullets();
		assertTrue(firstGunBullets == actualBullets );
	}
	@Test
	public void testAddGun() throws Exception {
		
		stageOne();
		Gun gun2 = new Gun("Ross", 21);
		
		try {
			player.addGun(gun2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(player.getList().top(), gun2);
	}
	
	@Test
	public void testGetName() {
		
		stageOne();
	
		assertEquals(player.getName(), name);
	}
	@Test
	public void testSetName() {
		
		stageOne();
		
		String other = "Rom";
			
		player.setName(other);
		
		assertEquals(player.getName(), other);
	
	}
	@Test
	public void testGetPlatform() {
		
		stageOne();
	
		assertEquals(player.getPlatform(), platform);
	}
	@Test
	public void testSetPlatform() {
		
		stageOne();
		
		String other = "iphone";
			
		player.setPlatform(other);
		
		assertEquals(player.getPlatform(), other);
	
	}
	@Test
	public void testGetPing() {
		
		stageOne();
	
		assertEquals(player.getPing(), ping);
	}
	@Test
	public void testSetPing() {
		
		stageOne();
		
		int other = 54;
		player.setPing(other);
		
		int actual = player.getPing();
		assertTrue( actual == other);
	
	}
}

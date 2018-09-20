package Test;

import static org.junit.Assert.*;



import org.junit.AfterClass;
import org.junit.Test;

import interfaces.Queque;
import junit.framework.TestCase;
import structures.HashTable;
import structures.Structures;

public class HashTableTest extends TestCase{

	private HashTable<String> hash;
	private Queque<String> one;
	private String name;
	private int key;
	void stageOne(){
	
		key = 65;
		name = "Vale";
		one = new Structures<String>();
		hash= new HashTable<String>();
	}
	@Test
	public void testIsEmpty() {
		
		stageOne();
		
		assertEquals(hash.isEmpty(), true);
		
	}
	@Test
	public void testHashFunction() {
		
		stageOne();
		
		int numberkey = hash.hashFunction(key);
		
		assertTrue(numberkey == 3);
	}
	@Test
	public void testInsert() {
		stageOne();
		
		hash.insert(name, key);
		
		assertTrue(hash.Size() == 1);
		
	}
	@Test 
	public void testGet() {
		
		stageOne();
		hash.insert(name, key);
		
		String actual = hash.Get(key);
		
		assertEquals(actual, name);
		
	}
	
}

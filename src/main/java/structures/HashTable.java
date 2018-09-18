package structures;

import interfaces.IHashTable;
import interfaces.Queque;

public class HashTable<A> implements IHashTable<A> {
	
	private Queque<A> one;
	private Queque<A> two;
	private Queque<A> three;
	private Queque<A> four;
	private Queque<A> five;
	private int size;
	private Queque<A>[] table;
	
	public HashTable() {
		
		table = new Queque[5];
		
		one = new Structures<A>();
		two = new Structures<A>();
		three = new Structures<A>();
		four = new Structures<A>();
		five = new Structures<A>();
		
		table[0] = one;
		table[1] = two;
		table[2] = three;
		table[3] = four;
		table[4] = five;
		size = 0;
		
	}


	public boolean isEmpty() {
		boolean empty;
		if(size != 0) {
			empty = false;
		}else {
			empty = true;
		}
		
		return empty;
	}

	
	public int Size() {
		return size;
	}

	
	public A remove(A element) {
		// TODO Auto-generated method stub
		return null;
	}



	public int hashFunction(Number key) {
		
		int key2 = key.intValue();
		int pos = 0;
		
		if(key2 >= 0 && key2 < 20) {
			pos = 0;
		}else if(key2 >= 20 && key2 < 40) {
			pos = 1;
		}else if(key2 >= 40 && key2 < 60) {
			pos = 2;
		}else if(key2 >= 60 && key2 < 80) {
			pos = 3;
		}else if(key2 >= 80) {
			pos = 4;
		}
		
		return pos;
	}

	
	public void insert(A element, Number key) {
		int pos = hashFunction(key);
		
		table[pos].enqueque(element);
		size++;

	}
	
	public Queque<A> queueActual(int key){
		return table[key];
	}

	
	public A Get(Number key) {
		
		int pos = hashFunction(key);
		
		
		try {
			return table[pos].front();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return null;
	}
	


}

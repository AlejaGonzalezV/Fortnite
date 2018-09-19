package model;
import interfaces.IHashTable;
import structures.*;

public class Game {
	
	private Player player;
	private IHashTable<Player> PC;
	private IHashTable<Player> Xbox;
	private IHashTable<Player> Playstation;
	private IHashTable<Player> Nintendo;
	private IHashTable<Player> iPhone;
	
	public Game(Player player) {
		
		this.player = player;
		PC = new HashTable<Player>();
		Xbox = new HashTable<Player>();
		Playstation =new HashTable<Player>();
		Nintendo = new HashTable<Player>();
		iPhone = new HashTable<Player>();
		
		addPlayer(player);
	
		
	}
	
	public void addPlayer(Player user) {
		
		if(user.getPlatform().equalsIgnoreCase("PC")) {
			PC.insert(user, user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Xbox")) {
			Xbox.insert(user, user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Playstation")) {
			Playstation.insert(user, user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Nintendo")) {
			Nintendo.insert(user, user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("iPhone")) {
			iPhone.insert(user, user.getPing());
		}
	}
	
	public int position(Player user) {
		
		int pos = 0;
		
		if(user.getPlatform().equalsIgnoreCase("PC")) {
			pos = PC.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Xbox")) {
			pos = Xbox.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Playstation")) {
			pos = Playstation.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("Nintendo")) {
			pos = Nintendo.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equalsIgnoreCase("iPhone")) {
			pos = iPhone.hashFunction(user.getPing());
		}

		return pos;
	}
	
	public boolean QueueFull(int key, String platform) {
		boolean full = false;
		if(platform.equalsIgnoreCase("PC")) {
			if(PC.queueActual(key).sizeQ() == 10) {
				full = true;
			}
		}else if(platform.equalsIgnoreCase("Xbox")) {
			if(Xbox.queueActual(key).sizeQ() == 10) {
				full = true;
			}
		}else if(platform.equalsIgnoreCase("Playstation")) {
			if(Playstation.queueActual(key).sizeQ() == 10) {
				full = true;
			}
		}else if(platform.equalsIgnoreCase("Nintendo")) {
			if(Nintendo.queueActual(key).sizeQ() == 10) {
				full = true;
			}
		}else if(platform.equalsIgnoreCase("iPhone")) {
			if(iPhone.queueActual(key).sizeQ() == 10) {
				full = true;
			}
		}
		
		return full;
	}
	
	public void removeQueue(int key, String platform) {
		
		if(platform.equalsIgnoreCase("PC")) {
			
			PC.queueActual(key).removeAll();

		}else if(platform.equalsIgnoreCase("Xbox")) {
			
			Xbox.queueActual(key).removeAll();
			
		}else if(platform.equalsIgnoreCase("Playstation")) {
			
			Playstation.queueActual(key).removeAll();
			
		}else if(platform.equalsIgnoreCase("Nintendo")) {
			
			Nintendo.queueActual(key).removeAll();
			
		}else if(platform.equalsIgnoreCase("iPhone")) {
			
			iPhone.queueActual(key).removeAll();
			
		}
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public String gunName() {
		
		return player.nameFirstGun();
		
	}
	
	public int bullets() {
		
		return player.bulletsFirstGun();
		
	}
	
	public void deleteGun() {
		
		player.deleteGun();
		
	}
	
	public void shoot() {
		
		player.shoot();
		
	}

}

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
		
		if(user.getPlatform().equals("PC")) {
			PC.insert(user, user.getPing());
			
		}else if(user.getPlatform().equals("Xbox")) {
			Xbox.insert(user, user.getPing());
			
		}else if(user.getPlatform().equals("Playstation")) {
			Playstation.insert(user, user.getPing());
			
		}else if(user.getPlatform().equals("Nintendo")) {
			Nintendo.insert(user, user.getPing());
			
		}else if(user.getPlatform().equals("iPhone")) {
			iPhone.insert(user, user.getPing());
		}
	}
	
	public int position(Player user) {
		
		int pos = 0;
		
		if(user.getPlatform().equals("PC")) {
			pos = PC.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equals("Xbox")) {
			pos = Xbox.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equals("Playstation")) {
			pos = Playstation.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equals("Nintendo")) {
			pos = Nintendo.hashFunction(user.getPing());
			
		}else if(user.getPlatform().equals("iPhone")) {
			pos = iPhone.hashFunction(user.getPing());
		}

		return pos;
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

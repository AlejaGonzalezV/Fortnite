package model;
import interfaces.IHashTable;
import structures.*;

public class Game {
	
	private Player player;
	private IHashTable<Player> table;
	
	public Game(Player player) {
		
		this.player = player;
		table = new HashTable<Player>();
		addPlayer(player);
		
		
	}
	
	public void addPlayer(Player user) {
		
		table.insert(user, user.getPing());
		
	}
	
	public int position(Player user) {
		
		return table.hashFunction(user.getPing());
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

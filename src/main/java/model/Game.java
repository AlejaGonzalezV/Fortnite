package model;
import structures.*;

public class Game {
	
	private Player player;
	
	public Game(Player player) {
		
		this.player = player;
		
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

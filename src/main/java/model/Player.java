package model;
import java.util.ArrayList;

import interfaces.IStack;
import structures.*;

public class Player {
	
	private String name;
	private String platform;
	private int ping;
	private int experience;
	private int kills;
	private int games;
	private IStack<Gun> list;

	
	
	public Player(String name, String platform , int ping, int experience, int kills, int games, Gun initGun) {
		
		list = new Structures<Gun>();
		this.name = name;
		this.ping = ping;
		this.experience = experience;
		this.kills = kills;
		this.games = games;
		this.platform = platform;
		try {
			addGun(initGun);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
	public void addGun(Gun theGun) throws Exception {

			list.push(theGun);
			
	}
	
	public void shoot() {
		
		
		try {
			
			list.top().setBullets(list.top().getBullets()-1);
			
			if(list.top().getBullets() == 0) {
				
				list.pop();
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getPing() {
		return ping;
	}

	public void setPing(int ping) {
		this.ping = ping;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}


	
	

}

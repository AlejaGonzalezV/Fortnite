package model;
import java.util.ArrayList;

import interfaces.IStack;
import structures.*;

public class Player {

	private String name;
	private String platform;
	private int ping;

	private IStack<Gun> list;

	
	
	public Player(String name, String platform , int ping, Gun initGun) {
		
		list = new Structures<Gun>();
		this.name = name;
		this.ping = ping;
		this.platform = platform;
		try {
			addGun(initGun);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void deleteGun() {
		
		try {
			list.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String nameFirstGun() {
		
		String name = null;
		
		try {
			name = list.top().getName();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return name;
	}
	
	public int bulletsFirstGun() {
		
		int bullets=0;
		
		try {
			bullets = list.top().getBullets();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return bullets;
		
	}
	
	public IStack<Gun> getList() {
		return list;
	}


	public void setList(IStack<Gun> list) {
		this.list = list;
	}
	
	
	public void addGun(Gun theGun) throws Exception {

			list.push(theGun);
			
	}
	
	public void shoot() {
		
		
		try {
			
			if(list.top().getName() != "Pickaxe") {
				
				list.top().setBullets(list.top().getBullets()-1);
				
				if(list.top().getBullets() == -1) {
					
					
					list.pop();
					
				}
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




	
	

}

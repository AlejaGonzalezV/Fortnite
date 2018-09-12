package model;

public class Gun {
	
	private String name;
	private int bullets;
	
	public Gun(String name, int bullets) {
		
		this.name = name;
		this.bullets = bullets;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	
	
	
	
	

}

package maceraOyunu;

public class Inventory {
	private boolean water,food,firewood;
	private String wname,aname;
	private int damage,armor;

	
	public Inventory() {

	this.water=false;
	this.food=false;
	this.firewood=false;
	this.damage=0;
	this.armor=0;
	this.wname=null;
	this.aname=null;
	}


	public boolean isWater() {
		return water;
	}


	public void setWater(boolean water) {
		this.water = water;
	}


	public boolean isFood() {
		return food;
	}


	public void setFood(boolean food) {
		this.food = food;
	}


	public boolean isFirewood() {
		return firewood;
	}


	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}


	public String getWname() {
		return wname;
	}


	public void setWname(String wname) {
		this.wname = wname;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getArmor() {
		return armor;
	}


	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	
}

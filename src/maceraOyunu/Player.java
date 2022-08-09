package maceraOyunu;

import java.util.Scanner;

public class Player {
	private int damage,healty,money,rhealhty;
	public int getRhealhty() {
		return rhealhty;
	}

	public void setRhealhty(int rhealhty) {
		this.rhealhty = rhealhty;
	}

	private String name,cName;
    private Inventory inv;
     Scanner scan = new Scanner(System.in);
    public Player(String name) {
		
		this.name = name;
		this.inv=new Inventory();
		
	}
    
    public void selectChar()
    {
   switch(charMenu())
   {
   
   case 1:
	  initPlayer("Samuray", 5, 21, 15);
	   
   case 2:
	   initPlayer("ok�u", 7, 18, 20);
   case 3:   
	   initPlayer("�ovalye", 8, 24, 5);
   
   default: 
	   initPlayer("Samuray", 5, 21, 15);
   }
   System.out.println("Karakter:"+getcName()+ "\tHasar: "+getDamage()+ "\tSa�l�k: "+getHealty()+ "\tMoney"+ getMoney());
    }
    
    public int charMenu()
    {
    	System.out.println("L�tfen karakter se�iniz: ");
    	System.out.println(" 1-Samuray,\t Hasar: 5, Sa�l�k: 21, Para: 15");
    	System.out.println(" 2-ok�u, \tHasar: 7, Sa�l�k: 18, Para: 20");
    	System.out.println(" 3-Samuray, \tHasar: 8, Sa�l�k: 24, Para: 5");
    	System.out.println("Se�iminiz. ");
    	int chaID=scan.nextInt();
    	
    	while(chaID<1 || chaID>3)
    	{
    		System.out.println("L�tfen ge�erli bir karakter se�iniz: ");
    		chaID=scan.nextInt();
    	}
    	return chaID;
    }
    public int getTotaldamage()
    {
    	return this.getDamage()+ this.getInv().getDamage();
    }
    
    public void initPlayer(String cname, int dmg,int healty,int money)
    {
    	 
    setcName(cname);
  	   setDamage(dmg);
  	   setHealty(healty);
  	   setMoney(money);
    	setRhealhty(healty);
    }
    
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealty() {
		return healty;
	}

	public void setHealty(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	

}

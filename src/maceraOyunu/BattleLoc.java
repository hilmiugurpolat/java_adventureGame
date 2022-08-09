package maceraOyunu;

public  abstract class BattleLoc extends Location {

	 protected Obstacle obstacle;
	 protected String award;
	BattleLoc(Player player,String name,Obstacle obstacle,String award) {
		super(player);
		this.name=name;
		this.obstacle=obstacle;
		this.award=award;
		
	}

	public boolean getLocation()
	{
		
		int obsCount=obstacle.Count();
		System.out.println("Suan buradasýnýz: "+this.getName() );
		System.out.println("Dikkatli ol burada"+ obsCount+ "tane"+obstacle.getName()+"yaþiyor");
		
		System.out.print("<S>avas veya <K>ac");
		String selCase= scan.nextLine();
		selCase =selCase.toUpperCase();
		
		if(selCase.equals("S"))
		{
			if(combat(obsCount)==true)
			{
				
				System.out.println(this.getName()+ "bolgesindeki Tum dusmanlarý yendiniz ");
				if(this.award.equals("Food")&& player.getInv().isFood()==false)
				{
					System.out.println(this.award + "Kazandiniz! ");
					player.getInv().setFood(true);
				}
				
				else if(this.award.equals("Water")&& player.getInv().isWater()==false)
				{
					System.out.println(this.award + "Kazandiniz! ");
					player.getInv().setWater(true);
				}
				
				
				else if(this.award.equals("Firewood")&& player.getInv().isFirewood()==false)
				{
					System.out.println(this.award + "Kazandiniz! ");
					player.getInv().setFirewood(true);
				}
				
				return true;
			}
			
			if(player.getHealty()<=0)
			{
				System.out.println("oldunuz ");
				return false;
			}
			
		
	}
		return true;
	}
	
	
	public boolean combat(int obscount)
	{
		
		for(int i=0;i<obscount;i++)
		{
			int defobshealth=obstacle.getHealth();
			
			playerStats();
			enemyStats();
			
			while(player.getHealty()>0 && obstacle.getHealth()>0 )
			{
				System.out.print("<V>ur veya <K>aç");
				String selcase= scan.nextLine();
				selcase=selcase.toUpperCase();
				if(selcase.equals("V")){
					
					
					System.out.println("siz vurdunuz");
					obstacle.setHealth(obstacle.getHealth()-player.getTotaldamage());
				afterhit();
				if(obstacle.getHealth()>0 )
					
				{
					System.out.println();
					System.out.println("canavar size vurdu");
					player.setHealty(player.getHealty()-(obstacle.getDamage()-player.getInv().getArmor()));
					afterhit();
				}
				
				}
						
				else return false;
						
			}
			if(obstacle.getHealth()<player.getHealty())
			{
				System.out.println("dusmaný  yendiniz: ");
				player.setMoney(player.getMoney()+obstacle.getAward());
				System.out.println("Guncel paranýz: "+player.getMoney());
				obstacle.setHealth(defobshealth);
				
			}
			else 
				
				{return false;}
			System.out.println("---------------------");
			

				
		
		}
		return true;
	}
	
	public void playerStats()
	{
		System.out.println("oyuncu degerleri-------------");
		System.out.println("Can: "+player.getHealty());
		System.out.println("hasar: "+player.getTotaldamage());
		System.out.println("para: "+player.getMoney());
		
		if(player.getInv().getDamage()>0 )
		{
			System.out.println("Silah"+player.getInv().getWname());
			
		}
		
		if(player.getInv().getArmor()>0 )
		{
			System.out.println("Zýrh"+player.getInv().getAname());
			
		}
	}
	
	public void afterhit()
	{
		
		System.out.println("Oyuncu caný: "+player.getHealty());
		System.out.println(obstacle.getName() + "CAný: "+ obstacle.getHealth());
		System.out.println();
	}
	
	public void enemyStats() {
		
		System.out.println(obstacle.getName()+ "degerleri");
		System.out.println("Can: "+obstacle.getHealth());
		System.out.println("hasar: "+obstacle.getDamage());
		System.out.println("odul: "+obstacle.getAward());
	}

}

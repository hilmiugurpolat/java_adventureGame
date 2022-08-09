package maceraOyunu;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
Scanner scan = new Scanner(System.in);
	
	public void login()
	{
		
		System.out.println("Macera oyunun hoþgeldinizi!");
		System.out.println("Oyuna baþlamadan önce isminizi giriniz: ");
		Scanner scan = new Scanner(System.in);
		//String playerName=scan.nextLine();
		player = new Player("asd");
		player.selectChar();
		start();
		
	}
	public void start()
	{
		while(true)
		{
			
			
			System.out.println();
			System.out.println("=============================================================");
			System.out.println();
			System.out.println("Lütfen bir yer seçiniz:");
			System.out.println("1.Güvenli ev---->size ait güvenli bir mekan");
			System.out.println("2.magara----->karþýnýza zombi çýkablilr");
	        System.out.println("3.orman------>karþýnýzsa belki vampri çýkabilir");
	        System.out.println("4.Nehir------>karþýnýzsa belki ayý çýkabilir");
	        System.out.println("5.Maðaza------>Silah veya zýrh satýn alabilirsizin");
	        int selloc=scan.nextInt();
	        while(selloc<0 || selloc>5)
	        {
	        	System.out.println("Lütfen geçerl bir yer seçiniz");
	        	selloc=scan.nextInt();
	        	
	        }
	        switch(selloc)
	        {
	        	
	        	case 1:
	        		location=new safeHouse(player);
	        		break;
	        	case 2:
	        		location=new Cave(player);
	        		break;
	        	case 3: 
	        		location=new forest(player);
	        		break;
	        	case 4:
	        		location=new River(player);
	        		break;
	        	case 5:
	        		location=new Toolstore(player);
	        		break;
	        		default:
	        			location=new safeHouse(player);
	            		break;
	        			
	        }
	        
	        if(location.getClass().getName().equals("safeHouse"))
	        {
	        	if(player.getInv().isFirewood() &&  player.getInv().isFood() &&
	        			player.getInv().isWater())
	        	{
	        		System.out.println("tebrikler oyunu bitirdiniz: ");
	        		break;
	        	}
	        }
	        
	       if(!location.getLocation())
	       {
	    	   System.out.println("Oyun bitt");
	    	   break;
	       }
		}
		
	}
}

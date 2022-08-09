package maceraOyunu;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
Scanner scan = new Scanner(System.in);
	
	public void login()
	{
		
		System.out.println("Macera oyunun ho�geldinizi!");
		System.out.println("Oyuna ba�lamadan �nce isminizi giriniz: ");
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
			System.out.println("L�tfen bir yer se�iniz:");
			System.out.println("1.G�venli ev---->size ait g�venli bir mekan");
			System.out.println("2.magara----->kar��n�za zombi ��kablilr");
	        System.out.println("3.orman------>kar��n�zsa belki vampri ��kabilir");
	        System.out.println("4.Nehir------>kar��n�zsa belki ay� ��kabilir");
	        System.out.println("5.Ma�aza------>Silah veya z�rh sat�n alabilirsizin");
	        int selloc=scan.nextInt();
	        while(selloc<0 || selloc>5)
	        {
	        	System.out.println("L�tfen ge�erl bir yer se�iniz");
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

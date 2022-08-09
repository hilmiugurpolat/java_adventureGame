package maceraOyunu;

public class Toolstore extends Normalloc{

	Toolstore(Player player)  {
		super(player,"ma�aza");
		this.name=name;
		
	}
	
	public boolean getLocation()
	{
		System.out.println("Para: "+player.getMoney());
		System.out.println("1.silahlar");
		System.out.println("2.Z�rhlar");
		System.out.println("3.��k��");
		System.out.println("Se�iniz: ");
		int settool= scan.nextInt();
		int selItemId;
		switch(settool)
		{
		case 1:
			selItemId=weaponMenu();
			buyWeapon(selItemId);
			break;
		case 2:
			selItemId=armorMenu();
			buyArmor(selItemId);
			break;
			default: 
				break;
				
		}
		return true;
	}
	public void buyArmor(int itemid)
	{
		int avoid=0,price=0;
		String aname=null;
		
		switch(itemid)
		{
		case 1:
			avoid=2;
			aname="hafif z�rh";
			price =15;
			break;
			
		case 2:
			avoid=3;
			aname="orta z�rh";
			price =20;
			break;
		case 3:
			avoid=7;
			aname="a��r z�rh";
			price =25;
			break;
			
		case 4: System.out.println("��k�s yapiliyor");
		default: System.out.println("gecersiz i�lem");
		break;
		}
		
		if(price >0)
		{
			
			if(player.getMoney()>=price )
			{
				player.getInv().setArmor(avoid);
				player.getInv().setAname(aname);
				player.setMoney(player.getMoney()-price);
				System.out.println(aname+"Silah� sat�n ald�n�z engellenen hasar  "+player.getInv().getArmor());
				
		System.out.println("kalan para: "+player.getMoney());		
			}
			else System.out.println("Bakiye yetersiz !");
			
			
		
		}
		
	}
	public int armorMenu()
	{
		
		System.out.println("1.hafif <para: 15- hasar:2>");
		System.out.println("2.orta<para: 25- hasar:3>");
		System.out.println("3.a��r para: 40- hasar:7>");
		System.out.println("4.��k��");
		System.out.println("silah se�iniz: ");
		int selArmorId= scan.nextInt();
		return selArmorId;
	}

	public int weaponMenu()
	{
		
		System.out.println("1.tabanca <para: 25- hasar:2>");
		System.out.println("2.k�l��<para: 35- hasar:3>");
		System.out.println("3.t�fek para: 45- hasar:7>");
		System.out.println("4.��k��");
		System.out.println("silah se�iniz: ");
		int selWeaponId= scan.nextInt();
		return selWeaponId;
	}

	public void buyWeapon(int itemId)
	{
		int damage=0,price=0;
		String wname=null;
		
		switch(itemId)
		{
		case 1:
			damage=2;
			wname="tabanca";
			price =25;
			break;
			
		case 2:
			damage=3;
			wname="k�l�c";
			price =35;
			break;
		case 3:
			damage=7;
			wname="Tufek";
			price =45;
			break;
			
			
		case 4: System.out.println("��k�s yapiliyor");
			default: System.out.println("gecersiz i�lem");
			break;
		}
		
		if(price >0)
		{
			
			if(player.getMoney()>price )
			{
				player.getInv().setDamage(damage);
				player.getInv().setAname(wname);
				player.setMoney(player.getMoney()-price);
				System.out.println(wname+"Silah� sat�n ald�n�z onceki hasar:  "+player.getDamage()+ 
						" yenii hasar: "+player.getTotaldamage());
				
		System.out.println("kalan para: "+player.getMoney());		
			}
			else System.out.println("Bakiye yetersiz !");
			
			
		
		}
	
	}
	
	
	
	
}

package maceraOyunu;

public class safeHouse extends Normalloc {

	safeHouse(Player player) {
		super(player, "G�venli ev");
		
	}
	
	public boolean getLocation()
	
	{
		player.setHealty(player.getRhealhty());
		System.out.println("�yili�tiniz");
		System.out.println("�u an g�venli evfesiniz.");
		return true;
	}
	

}

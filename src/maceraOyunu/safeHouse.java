package maceraOyunu;

public class safeHouse extends Normalloc {

	safeHouse(Player player) {
		super(player, "Güvenli ev");
		
	}
	
	public boolean getLocation()
	
	{
		player.setHealty(player.getRhealhty());
		System.out.println("Ýyiliþtiniz");
		System.out.println("Þu an güvenli evfesiniz.");
		return true;
	}
	

}

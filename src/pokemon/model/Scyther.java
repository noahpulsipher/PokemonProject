package pokemon.model;

public class Scyther extends Pokemon implements Grass
{
	public Scyther(int number, String name)
	{
		super(number, name);
	}
	
	public int solarBeam(boolean hit)
	{
		int damage = 0;
		
		return damage;
	}
	
	public boolean vineWhip()
	{
		boolean didHit = true;
		
		return didHit;
	}
	
	public int gigaDrain()
	{
		int healthRegained = 10;
		
		return healthRegained;
	}
	
	
}

package pokemon.model;

public class Greninja extends Frogadier implements Grass
{
	public Greninja(int number, String name)
	{
		super(number, name);
	}
	
	public int solarBeam(boolean hit)
	{
		int damage = 20;
		
		return damage;
	}
	
	public boolean vineWhip()
	{
		boolean didHit = true;
		
		return didHit;
	}
	
	public int gigaDrain()
	{
		int healthRegained = 15;
		
		return healthRegained;
	}
}

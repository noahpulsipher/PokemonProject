package pokemon.model;

public class Lombre extends Pokemon implements Water, Grass
{
	public Lombre(int number, String name)
	{
		super(number, name);
	}
	
	public String surf()
	{
		String surfing = "Surfs Up";
		
		return surfing;
	}
	
	public boolean waterShuriken(int hits)
	{
		boolean threw = false;
		
		return threw;
	}
	
	public boolean hydroPump()
	{
		boolean pumpHit = false;
		
		return pumpHit;
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

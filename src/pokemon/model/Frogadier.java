package pokemon.model;

public class Frogadier extends Pokemon implements Water
{
	public Frogadier(int number, String name)
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
}

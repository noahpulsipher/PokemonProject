package pokemon.model;

public class Jolteon extends Pokemon implements Electric
{
	public Jolteon(int number, String name)
	{
		super(number, name);
	}
	
	public int thunderbolt()
	{
		int damage = 17;
		
		return damage;
	}
	
	public void voltTackle(boolean tackle)
	{
		boolean tackled = false;
	}
	
	public String thunderPunch()
	{
		String punched = "ULTIMATE PUNCH!!!";
				
		return punched;
	}
}

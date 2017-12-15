package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu(int number, String name)
	{
		super(number, name);
	}
	
	public int thunderbolt()
	{
		int damage = 0;
		
		return damage;
	}
	
	public void voltTackle(boolean tackle)
	{
		boolean tackled = false;
	}
	
	public String thunderPunch()
	{
		String punched = "HIIIYYYYAAAA!!";
		
		return punched;
	}
}

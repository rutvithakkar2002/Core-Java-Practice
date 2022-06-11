public class Inheritancewithtejassir
{
	public static void main(String args[])
	{
		Pubg p=new Pubg(24);
	}
}
class Game
{
	Game()
	{		
		System.out.println()
	}
	Game(int a)
	{
		System.out.println("Game(int)");
	}
	void start()
	{
		System.out.println("Game::start()");
	}
}
class pubg extends Game
{
	Pubg()
	{
		Super(2);
		System.out.println("Pubg()");
	}
}
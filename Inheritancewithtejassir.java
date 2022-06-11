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
		System.out.println("Game Constructor");
	}
	Game(int a)
	{
		System.out.println("Parent(int)");
	}
	void start()
	{
		System.out.println("Parent");
	}
}
class Pubg extends Game
{
	Pubg()
	{
		super(2);
		System.out.println("child()");
	}
	Pubg(int a)
	{
		System.out.println("Child(int)");
	}
}
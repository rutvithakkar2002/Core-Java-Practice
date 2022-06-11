class Vehicle
{
	void run()
	{
		System.out.println("This is vehicle class");
	}
}
class Activa extends Vehicle
{
	void run()
	{
		System.out.println("This is Activa class");
	}	
}
public class Cycle 
{
	public static void main(String args[])
	{
		Activa a=new Activa();
		a.run();
	}	
}
public class Vehicle
{
	void run()
	{
		System.out.println("This is vehicle class");
	}
}
class Activa extends Vehicle
{
	public static void main(String args[])
	{
		Activa obj1=new Activa();
		obj1.run();		
	}
}
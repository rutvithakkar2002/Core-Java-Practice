class Bank
{
	int getinterest()
	{
		return 0;
	}
}
class Sbi extends Bank
{
	int getinterest()
	{
		return 8;
	}	
}
class Icici extends Bank
{
	int getinterest()
	{
		return 7;
	}	
}
class Axis extends Bank
{
	int getinterest()
	{
		return 9;
	}	
}
public class Childclass
{
	public static void main(String args[])
	{
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("Sbi rate is "+s.getinterest());
		System.out.println("Sbi rate is "+i.getinterest());
		System.out.println("Sbi rate is "+a.getinterest());
	}	
}
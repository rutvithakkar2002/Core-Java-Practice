//overriding concept
public class Inheritancedoubt
{
	public static void main(String args[])
	{
		Scicalc s1=new Scicalc();
		s1.add();
	}
}
class Basiccalc
{
	void add()
	{
		System.out.println("Add method of parent");
	}
}
class Scicalc extends Basiccalc
{
	void add()
	{
		super.add();
		System.out.println("Add method-->sci clac of child class");
	}	
}
public class Multilevel
{
	public static void main(String args[])	
	{
		C obj=new C();
		obj.printb();
		obj.printa();		
	}
}
class A
{
	void printa()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void printb()
	{
		System.out.println("Class B");	
	}
}
class C extends B
{
	void printc()
	{
		System.out.println("Class C");	
	}
}

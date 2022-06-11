class A
{
	String name="Rutvi";
}
class B extends A
{
	String name="Divya";
	void printname()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
class Superkey
{
	public static void main(String args[])
	{
		B b=new B();
		b.printname();
	}
}

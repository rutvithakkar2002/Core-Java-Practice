class A
{
	void printname()
	{
		System.out.println("Hello Rutvi!!");
	}
}
class B extends A
{
	void printname()
	{
		System.out.println("Hello Pradip!!");
	}
	void call()
	{
		
		printname();
		super.printname();
	}
}
class Superkey2
{
	public static void main(String args[])
	{
		B b=new B();
		b.call();
	}
}
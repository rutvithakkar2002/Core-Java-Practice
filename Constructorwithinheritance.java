public class Constructorwithinheritance
{
	public static void main(String args[])
	{
		Parent p=new Parent();	
	} 
}
class Parent
{
	int p;
	Parent()
	{
		this(9);
		System.out.println("Parent()");	
	}
	Parent(int x)
	{
		System.out.println("Parent(int)");	
	}
	
}
class Child
{
	int c;
	Child()
	{
		System.out.println("Child()");
	}
	Child(int x)
	{
		System.out.println("Child(int)");	
	}
	
}
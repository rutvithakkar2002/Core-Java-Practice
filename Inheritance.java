class BasicCalc
{
	void add()
	{
		System.out.println("Parent class Addition Method");
	}
	void sub()
	{
		System.out.println("Child class Subtraction method");
	}	
}
class ScietificCalc extends BasicCalc
{
	void sin()
	{
		System.out.println("Child class Sin method..");
	}
	void sqrt()
	{
		System.out.println("Child class sqrt method");
	}	
}
class Inheritance
{
	public static void main(String args[])
	{
		ScientificCalc obj1=new ScientificCalc();
		obj1.add();
		obj1.sub();
		obj1.sin();
		obj1.sqrt();
	}	
}
class A
{
	void add()
	{
		System.out.println("Parent class Addition Method");
	}
	void sub()
	{
		System.out.println("parent class Subtraction method");
	}	
}
class B       //Multiple level Inheritance
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
class C extends A,B
{
	void div()
	{
		System.out.println("Division Method!!");
	} 
}
class Multiple_Inheritance_demo
{
	public static void main(String args[])
	{
		SciCalc obj1=new SciCalc();
		obj1.add();
		obj1.sub();
		obj1.sin();
		obj1.sqrt();
	}	
}
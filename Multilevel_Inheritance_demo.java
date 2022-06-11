//Multiple Inheritance
		
//	A  add(),sub()
//	|
//	|
//	B  mul(),div()    ------> total 4 method because B is inherit A
//	|
//	|
//	C  root()	--------->total 5 method because C inherit class B and B inherit class A....



class BasicCalc
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
class SciCalc extends BasicCalc       //Multilevel Inheritance
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
class AdvanceCalc extends SciCalc
{
	void root()
	{
		System.out.println("Advance calc---->root method!!");
	}
}
class Multilevel_Inheritance_demo
{
	public static void main(String args[])
	{
		AdvanceCalc obj1=new AdvanceCalc();
		obj1.root();
		obj1.add();
		obj1.sub();
		obj1.sin();
		obj1.sqrt();
	}	
}
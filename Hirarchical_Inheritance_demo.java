//Hirarchical Inheritance------> it generates Tree Form...
//  -----------------------
//		A
//		|
//	------------------------
//	|			|
//	B			C
//	|			|
//  ------------	-----------------
//  |		|	|		|
//  B1		B2	C1		C2
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
class B extends A      
{
	void sin()
	{
		System.out.println("Child class of A Sin method..");
	}	
}
class C extends A
{
	void sqrt()
	{
		System.out.println("Child class of A sqrt method");
	}	
}
class B1 extends B
{
	void mul()
	{
		System.out.println("Child class of B------->multiplication method");
	}
}
class C1 extends C
{
	void div()
	{
		System.out.println("Child class of B---->division method");
	}
}
class Hirarchical_Inheritance_demo
{
	public static void main(String args[])
	{
		A obj1=new A();
		
		obj1.add();
		obj1.sub();
		
	}	
}
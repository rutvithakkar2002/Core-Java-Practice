//INHERITANCE :- object of one class can access	//	property of another class
//extends keyword to apply inheritance between two class 
//giver : parent - super - base  
//take  : child -  sub   - derived  
//class , object , inheritance 

//types of inheritance 
//oop --> 5 type 
//1) single level Inheritance
//2) multilevel Inheritance
//3) multiple Inheritance
//4) hirarchical Inheritance
//5) hybrid Inheritance

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
class SciCalc extends BasicCalc       //Single level Inheritance
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
class Single_Inheritance_demo
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
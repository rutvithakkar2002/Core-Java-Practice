//Overriding concept
//----Duplication of methods in different class!!

class BasicCalc
{
	void add()
	{
		System.out.println("add():-->Basic Calc");
	}
	void sub()
	{
		System.out.println("sub():-->Basic Calc");
	}
}
class Sci extends BasicCalc
{
	void add()
	{
		System.out.println("add():-->Scientific Calc");
		//If you want to call parent class method so, you have to add the keyword->super
		//super.add();
	}
	void sin()
	{
		System.out.println("Sin():--->Scientific calc");
	}
}
class Overriding_demo
{
	public static void main(String args[])
	{
		Sci obj1=new Sci();
		obj1.add();//sci class call
		obj1.sin();
		obj1.sub();
	//If you want to call parent class method so, you have to add the keyword->super
	//	super.add();
		
	}
}
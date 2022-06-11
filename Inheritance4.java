public class Inheritance4
{
	public static void main(String args[])
	{
		SquareofRect s1=new SquareofRect();
		Circle c1=new Circle();
		c1.print();
		s1.print();
		//super.print();
	}
}
class Shape 
{
	void print()
	{
		System.out.println("This is a Shape.");
	}
}
class Rectangle extends Shape
{	
	void print()
	{
		System.out.println("This is Rectangle.");
	}
}
class Circle extends Shape
{
	void print()
	{
		System.out.println("This is a Circle.");
	}	
}
class SquareofRect extends Rectangle
{
	void print()
	{
		super.print();
		System.out.println("Square is a Rectangle.");
	}
}
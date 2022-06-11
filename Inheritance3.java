public class Inheritance3
{
	public static void main(String args[])
	{
		SquareofRect s1=new SquareofRect();
		s1.rectdisplay();
		s1.shapedisplay();
	}
}
class Shape 
{
	void shapedisplay()
	{
		System.out.println("This is a Shape.");
	}
}
class Rectangle extends Shape
{
	void rectdisplay()
	{
		System.out.println("This is Rectangle.");
	}
}
class Circle extends Shape
{
	void circledisplay()
	{
		System.out.println("This is a Circle.");
	}	
}
class SquareofRect extends Rectangle
{
	void sqdisplay()
	{
		System.out.println("Square is a Rectangle.");
	}
}
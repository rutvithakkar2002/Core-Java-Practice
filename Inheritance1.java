//single level Inheritance
public class Inheritance1
{
	public static void main(String args[])
	{
		SciCalc s1=new SciCalc();
		s1.cube(2);
		s1.add(10,20);
		s1.sub(24,10);
	}
}
class BasicCalc
{
	void add(int a,int b)
	{
		System.out.println("Add-->"+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Sub-->"+(a-b));
	}
}
class SciCalc extends BasicCalc
{
	void cube(int a)
	{
		System.out.println("Cube is :"+(a*a*a));
	}
}
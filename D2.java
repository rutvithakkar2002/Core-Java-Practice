public class D2
{
	static
	{
		System.out.println("This is static block.");
	}
	{
		System.out.println("This is the instance block.");   //instance method
	}
	D2()//default constructor
	{
		System.out.println("This is the default constructor.");
	}
	public static void main(String args[])
	{
		System.out.println("This is the main method.");
		D2 obj=new D2();
		System.out.println("This is theened of the main method..");
	}
}
class Sample
{
	
}
class Sample2
{

}
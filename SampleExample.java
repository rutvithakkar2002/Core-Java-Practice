//Concept of Overloading or polimorphism
public class SampleExample
{
	public static void main(String args[])
	{
		SampleExample obj=new SampleExample();
		System.out.println("This is the main class.");	
		main(4);
		obj.main(10,2);	
		
	}
	public static void main(int a)
	{
		System.out.println("This is Static main method"+" "+a);
	}
	public void main(int a,int b)
	{
		System.out.println("This is non Static Method"+a+' '+b);
	}
}

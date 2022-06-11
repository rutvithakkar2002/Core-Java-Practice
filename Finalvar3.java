public class Finalvar3
{
	final int no=40;
	void print()
	{
		no=10;
	}
	public static void main(String args[])
	{
		Finalvar3 f1=new Finalvar3();
		f1.print();
		System.out.println("The value of number is: "+f1.no);
	}
}
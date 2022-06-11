public class Finalvar2
{
	final int no;
	Finalvar2(int no)
	{
		this.no=no;	
	}
	public static void main(String args[])
	{
		Finalvar2 f1=new Finalvar2(1000);
		
		System.out.println("The value of number is: "+f1.no);
	}
}
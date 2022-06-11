public class Finalvar
{
	public static void main(String args[])
	{
		final int no=10;
		System.out.println("The value of number is: "+no);
		
		//no=100;  c.e--compiletime error
		//System.out.println("The value of number is: "+no);
	}
}
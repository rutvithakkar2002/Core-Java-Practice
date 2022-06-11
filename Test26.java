import java.util.Scanner;
public class Test26
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		int y;
		float x;
		System.out.print("Enter the value of x: ");
		x=sc.nextFloat();

		if(x>0)
		{
			y=1;
			System.out.println("The value of y is: "+y);
		}
		else
		{
			if(x==0)
			{
				y=0;
				System.out.println("The value of y is: "+y);
			}
			else
			{
				y=-1;
				System.out.println("The value of y is: "+y);
			}
		}
	}
}
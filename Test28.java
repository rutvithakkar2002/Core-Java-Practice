import java.util.Scanner;
public class Test28
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int y;
		float x;
		System.out.println("Enter a number: ");
		x=sc.nextFloat();
		y=((x>0)?(y=1):(x<0)?(y=-1):(y=0));
		System.out.println("The value of y is : "+y);
	}
}
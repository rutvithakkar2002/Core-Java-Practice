import java.util.Scanner;
public class Test12
{
	public static void main(String[] args)
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		no=sc.nextInt();
		if(no>0)
		{
			System.out.println("Number is positive.");
		}
		else
		{
			System.out.println("number is negative!");
		}
	}
}
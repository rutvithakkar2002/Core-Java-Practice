import java.util.Scanner;
public class Factorialno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,fact=1;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of number is: "+fact);		
	}
}
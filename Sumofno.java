import java.util.Scanner;
public class Sumofno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of number is: "+sum);		
	}
}
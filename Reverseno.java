import java.util.Scanner;
public class Reverseno
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,r,n;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		while(n>0)
		{	
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("The reverse number is: "+sum);
			
	}
}
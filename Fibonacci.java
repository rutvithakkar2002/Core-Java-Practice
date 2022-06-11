import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1 ,c=0;
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		do
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			c++;						
		}while(c<=n);
	}
}
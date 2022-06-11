import java.util.Scanner;
public class Test14
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		a=sc.nextInt();
		System.out.println("Enter Second number: ");
		b=sc.nextInt();
		System.out.println("Enter Third number: ");
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Maximum number is "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum number is "+b);
		}
		else
		{
			System.out.println("Maximum number is: "+c);
		}
	}
}
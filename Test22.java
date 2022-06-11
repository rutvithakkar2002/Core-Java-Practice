import java.util.Scanner;
public class Test22
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		double a=sc.nextDouble();
		System.out.println("Enter b: ");
		double b=sc.nextDouble();
		System.out.println("Enter c: ");
		double c=sc.nextDouble();
		System.out.println("Enter d: ");
		double d=sc.nextDouble();	
		System.out.println("Enter m: ");
		double m=sc.nextDouble();
		System.out.println("Enter n: ");
		double n=sc.nextDouble();
		double x1=((m*d)-(b*n))/((a*d)-(c*d));
		double x2=((n*a)-(m*c))/((a*d)-(c*d));
		System.out.println("The value of x1 is: "+x1);
		System.out.println("The value of x2 is: "+x2);
	}
}
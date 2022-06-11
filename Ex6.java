import java.util.Scanner;
public class Ex6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of u: ");
		float a=sc.nextFloat();
		System.out.println("Enter the value of t: ");
		float u=sc.nextFloat();
		System.out.println("Enter the value of t: ");
		int t=sc.nextInt();
		float distance=((u*t)+((a*t)*(a*t)))/2;
		System.out.println("Distance: "+distance);		
	}
}
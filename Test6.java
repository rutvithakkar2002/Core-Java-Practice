import java.util.Scanner;
public class Test6
{
	public static void main(String[] args)
	{
		Scanner obj1=new Scanner(System.in);
		int no1,no2,ans;
		System.out.println("Enter number1: ");
		no1=obj1.nextInt();
		System.out.println("Enter number2: ");
		no2=obj1.nextInt();
		
		ans=no1+no2;
		System.out.println("Result is: "+ans);
		
	}
}
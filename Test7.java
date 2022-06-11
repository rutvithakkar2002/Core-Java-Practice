import java.util.Scanner;
public class Test7
{
	public static void main(String args[])
	{	
		int no1,no2,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1: ");
		no1=sc.nextInt();
		System.out.println("Enter number2: ");		
		no2=sc.nextInt();
		ans=no1-no2;
		System.out.println("Answer is: "+ans);
		
	}
}
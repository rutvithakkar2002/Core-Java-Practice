import java.util.Scanner;
public class Test19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		int no1,no2,ans;
		System.out.println("1. For Addition");
		System.out.println("2. For Subtraction");
		System.out.println("3. For Multiplication");
		System.out.println("4. For Division");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		if(ch>4)
		{
			System.out.println("invalid choice");
		}
		System.out.println("Enter number1: ");
		no1=sc.nextInt();
		System.out.println("Enter number2: ");
		no2=sc.nextInt();
		switch(ch)
		{
			case 1: 
				ans=no1+no2;
				System.out.println("Addition is: "+ans);
				break;
			case 2:
				ans=no1-no2;
				System.out.println("Subtraction is: "+ans);
				break;
			case 3:
				ans=no1*no2;
				System.out.println("Multiplication"+ans);
				break;
			case 4:
				ans=no1/no2;
				System.out.println("Division"+ans);
				break;
			default:
				System.out.println("Wrong choice!");
				break;
			

 				
						
		}
	}
}
import java.util.Scanner;
public class T1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,no1,no2,add,sub,mul,div;
		System.out.println("-----------Menu------------");
		System.out.println("1.For Addition");
		System.out.println("2.For Subtraction");
		System.out.println("3.For Multiplication");
		System.out.println("4.For Division");
		System.out.println("5.exit");
		System.out.println("Enter your Choice: ");
		ch=sc.nextInt();
		
		System.out.println("Enter number 1: ");
		no1=sc.nextInt();
		
		System.out.println("Enter number 2: ");
		no2=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				add=no1+no2;
				System.out.println("Addition is: "+add);
				break;
			case 2: 
				sub=no1-no2;
				System.out.println("Subtraction is: "+sub);
				break;
			case 3:
				mul=no1*no2;
				System.out.println("Multiplication is: "+mul);
				break;
			case 4:
				div=no1/no2;
				System.out.println("Division is: "+div);
				break;
			case 5:
				System.exit(0);
			
			default:
				System.out.println("Invalid Choice!!!");
				break;
		
		
		}
		
	}
}
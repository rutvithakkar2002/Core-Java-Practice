import java.util.Scanner;
public class Test8
{
	public static void main(String[] args)
	{	
		int no1,no2,add,mul,div,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1: ");
		no1=sc.nextInt();
		System.out.println("Enter number2: ");		
		no2=sc.nextInt();
		add=no1+no2;
		System.out.println("Addition is: "+add);
		sub=no1-no2;
		System.out.println("Subtraction is: "+sub);
		mul=no1*no2;
		System.out.println("Multiplication is: "+mul);
		div=no1/no2;
		System.out.println("Division is: "+div);

		
	}
}
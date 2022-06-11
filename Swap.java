import java.util.Scanner;
public class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2;
		System.out.println("Enter number 1:");
		no1=sc.nextInt();
		System.out.println("Enter number 2:");
		no2=sc.nextInt();
		System.out.println("Numbers are: "+no1+" "+no2 );
		int temp;
		temp=no1;
		no1=no2;
		no2=temp;
		
		System.out.println("Numbers are :"+no1+" "+no2);
	}

}

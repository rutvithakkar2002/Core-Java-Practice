import java.util.Scanner;
public class P2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.println("Enter number 1:");
		no1=sc.nextInt();
		System.out.println("Enter number 2:");
		no2=sc.nextInt();
		System.out.println("Enter number 3:");
		no3=sc.nextInt();
		if(no1==no2 && no2==no3)
		{
			System.out.println("Three numbers are same");
		}
		else if(no1==no3 && no1>no2)
		{
			System.out.println("no1 and no3 are same less than number 2");
		}
		else if(no2==no3 && no3<no1)
		{
			System.out.println("no2 and no3 are same less than number 1");	
		}
		else
		{
			if(no1>no2 && no1>no3)
			{		
				System.out.println("number 1 is maximum");
			}
			if(no2>no1 && no2>no3)
			{
				System.out.println("number 2 is maximum");
			}		
			else
			{
				System.out.println("number 3 is maximum.");
			}
		}
	}
}
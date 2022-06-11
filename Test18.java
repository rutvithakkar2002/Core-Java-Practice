import java.util.Scanner;
public class Test18
{
	public static void main(String[] args)
	{
		int no1,no2,no3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		no1=sc.nextInt();
		System.out.println("Enter Second number: ");
		no2=sc.nextInt();
		System.out.println("Enter Third number: ");
		no3=sc.nextInt();

		if((no1==no2) && (no2==no3))
		{
			System.out.println("Three numbers are same.");
		}
		else if((no1==no2) && (no1<no3))
		{
			System.out.println("no1 and no2 are less than no3.");
		}
		else if((no1==no3) && (no1<no2))
		{
			System.out.println("no1 and no3 are less than number 2.");
		}	
		else if((no2==no3) && (no3<no1))
		{
			System.out.println("no2 and no3 are less than number 1.");
		}
		else
		{
			if(no1<no2 && no1<no3)
			{
				System.out.println("number 1 is Manimum.");
			}
			else if(no2<no1 && no2<no3)
			{
				System.out.println("number 2 is Minimum.");
			}
			else
			{
				System.out.println("number 3 is minimum.");
			}
		}
	}
}
import java.util.Scanner;
public class Test16
{
	public static void main(String[] args)
	{
		int no1,no2,no3,no4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number: ");
		no1=sc.nextInt();
		System.out.println("Enter Second number: ");
		no2=sc.nextInt();
		System.out.println("Enter Third number: ");
		no3=sc.nextInt();
		System.out.println("Enter Forth number: ");
		no4=sc.nextInt();

		if((no1==no2) && (no2==no3) && (no3==no4))
		{
			System.out.println("All four numbers are same.");
		}
		else if((no1==no2)&&(no2==no3)&&(no3==no1)&&(no1>no4))
		{
			System.out.println("no1 ,no2,no3 are greater than no4");
		}
		else if((no2==no3)&&(no3==no4)&&(no4==no1)&&(no2>no1))
		{
			System.out.println("no2 ,no3,no4 are greater than no4");
		}
		else if((no3==no4)&&(no4==no1)&&(no1==no3)&&(no3>no1))
		{
			System.out.println("no3 ,no4,no1 are greater than no1");
		}
		else if((no1==no2) && (no1>no3) && (no1>no4))
		{
			System.out.println("no1 and no2 are greater than no3 and no4.");
		}
		else if((no2==no3) && (no2>no1) && (no2>no4))
		{
			System.out.println("no2 and no3 are greater than no1 and no4.");
		}	
		else if((no3==no4) && (no3>no1) &&(no3>no2))
		{
			System.out.println("no3 and no4 are greater than number no1 and no2.");
		}
		else if((no1==no3) && (no1>no2) && (no1>no4))
		{
			System.out.println("no1 and no3 is greater than no2 and no4");
		}
		else if((no1==no4) && (no1>no2) && (no1>no3))
		{
			System.out.println("no1 and no4 is greater than no2 and no3");
		}
		else if((no2==no4) && (no2>no1) && (no2>no3))
		{
			System.out.println("no2 and no4 is greater than no1 and no3");
		}
		
		else
		{
			if(no1>no2 && no1>no3 && no1>no4)
			{
				System.out.println("number 1 is Maximum.");
			}
			else if(no2>no1 && no2>no3 && no2>no4)
			{
				System.out.println("number 2 is Maximum.");
			}
			else if(no3>no1 && no3>no2 && no3>no4)
			{
				System.out.println("number 3 is maximum.");
			}
			else
			{
				System.out.println("number 4 is maximum.");
			}
		}
	}
}
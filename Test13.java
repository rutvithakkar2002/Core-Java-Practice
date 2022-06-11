import java.util.Scanner;
public class Test13
{
	public static void main(String[] args)
	{
		int sub1,sub2,sub3,total,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sub1 marks: ");
		sub1=sc.nextInt();
		System.out.println("Enter sub2 marks: ");
		sub2=sc.nextInt();
		System.out.println("Enter sub3 marks: ");
		sub3=sc.nextInt();
		total=sub1+sub2+sub3;
		System.out.println("Total is: "+total);
		avg=total/3;
		System.out.println("Average is: "+avg);
		if(total>90)
		{
			System.out.println("Grade A");
		}
		else if(total<90 && total>=60)
		{
			System.out.println("Grade B");
		}
		else if(total<=60)
		{
			System.out.println("Grade C");
		}	
		else
		{
			System.out.println("You are Fail!!");
		}		
	}
}
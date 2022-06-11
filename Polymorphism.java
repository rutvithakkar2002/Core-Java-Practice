import java.util.Scanner;
public class Polymorphism
{
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		int no1,no2,ans;
		System.out.println("Enter no1: ");
		no1=sc.nextInt();
		System.out.println("Enter no2: ");
		no2=sc.nextInt();
		ans=no1+no2;
		System.out.println("Addition is: "+ans);
	}
	public void add(int no1)
	{
		int no2,ans;
		System.out.println("Enter no2: ");
		no2=sc.nextInt();
		ans=no1+no2;
		System.out.println("Addition is: "+ans);
	}
	public void add(int no1,int no2)
	{
		int ans;
		ans=no1+no2;
		System.out.println("Addition is: "+ans);
	}
	public void add(int no1,int no2,int no3)
	{
		int ans;
		ans=no1+no2+no3;
		System.out.println("Additiom is: "+ans);
	}
	public static void main(String args[])
	{
		Polymorphism p1=new Polymorphism();
		p1.add();
		p1.add(20);
		p1.add(100,20);
		p1.add(10,30,20);	
		
	}
}
import java.util.Scanner;
public class Objectarray
{
	int rno;
	String name;
	int std;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno: ");
		rno=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
		sc.nextLine();
		System.out.println("Enter std: ");
		std=sc.nextInt();
	}
	void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}
	public static void main(String args[])
	{
		Objectarray o[]=new Objectarray[5];
		for(int i=0;i<o.length;i++)
		{
			o[i]=new Objectarray();
			o[i].getdata();
		}
		for(int i=0;i<o.length;i++)
		{
			o[i].display();
		}				
	}
}
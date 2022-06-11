import java.util.Scanner;
public class Nnprimitivearray
{
	int r_no;
	int std;
	void scan()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter roll_number: ");
		r_no=sc.nextInt();
		System.out.println("Enter standard : ");
		std=sc.nextInt();
	}
	void display()
	{
		System.out.println("Details are: "+r_no+" "+std);
	}
	public static void main(String args[])
	{
		Nnprimitivearray s[]=new Nnprimitivearray[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Nnprimitivearray();
			s[i].scan();
		}		
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}
	}
}
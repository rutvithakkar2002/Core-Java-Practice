import java.util.Scanner;
public class Constructor
{
	int roll_no;
	String name;
	int std;
	//default Constructor
	Constructor()
	{
		System.out.println("Start:: Default constructor-"+this);
		roll_no=1;
		name="Rutvi";
		std=12;
		System.out.println("Exit:: Default constructor-"+this);
	}
	//parameterized constructor
	Constructor(int r,String n,int s)
	{
		System.out.println("Start:: Parameterized constructor-"+this);
		roll_no=r;
		name=n;
		std=s;
		System.out.println("End:: parameterized constructor-"+this);
	}
	//copy constuctor
	Constructor(Constructor s)
	{
		roll_no=s.roll_no;
		name=s.name;
		std=s.std;
	}
	void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll_no: ");
		roll_no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter std: ");
		std=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("Rollno: "+roll_no+" "+"Name: "+name+" "+"Standard: "+std+" ----"+this);
	}
	public static void main(String args[])
	{	
		Constructor s1=new Constructor();
		Constructor s4=new Constructor();
		Constructor s2=new Constructor(2,"Dev",6);
		Constructor s3=new Constructor(s1);
		//System.out.println("Rollno: "+s1.roll_no+" "+"Name: "+s1.name+" "+"Standard: "+s1.std);
		s1.display();
		s2.display();
		s3.display();
	}
}
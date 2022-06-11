import java.util.Scanner;
public class EmployeeArray
{
	int eid;
	String name;
	int salary;
	String des;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");	
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name: ");	
		name=sc.nextLine();
		System.out.println("Enter salary: ");	
		salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter designation: ");	
		des=sc.nextLine();
	}
	void display()
	{
		System.out.println(eid+" "+name+" "+salary+" "+des);
	}
	public static void main(String args[])
	{
		EmployeeArray e1[]=new EmployeeArray[3];
		for(int i=0;i<e1.length;i++)
		{
			e1[i]=new EmployeeArray();
			e1[i].getdata();
			
		}
		for(int i=0;i<e1.length;i++)
		{
			e1[i].display();
		}				
	}
}

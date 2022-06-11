import java.util.Scanner;
public class Employee4
{
	int eid;
	String name,des;
	float salary;
	static String companyname;
	public void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your employee id: ");
		eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		name=sc.next();		
		System.out.println("Enter your designation: ");
		des=sc.next();
		System.out.println("Enter your salary: ");
		salary=sc.nextFloat();		
	}
	public void display()
	{
		System.out.println(eid+"  "+name+"  "+des+"  "+salary + " " +companyname);	
	}
	public static void setcompanyname(String companyname) 
	{
		Employee4.companyname = companyname;
	}
	public static void main(String args[])
	{
		int i;
		Employee4 e[]=new Employee4[2];
		Employee4.setcompanyname("royal");
		for(i=0;i<e.length;i++)
		{	
			e[i]=new Employee4();
			e[i].getdata();
		}
		for(i=0;i<e.length;i++)
		{	
			e[i].display();
		}
	}
}

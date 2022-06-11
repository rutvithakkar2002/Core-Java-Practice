import java.util.Scanner;
class Employee2
{
	int id;
	String name;
	int salary;
	/*void scan()
	{
		Scanner sc=new Scanner(System.in);
			Scanner sc=new scanner(System.in);
			System.out.println("--------------Enter employee details----------------- ");		
			System.out.println("Enter id:");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			name=sc.nextLine();
			System.out.println("Enter salary:");
			sal=sc.nextInt();
	}*/
	void display()
	{
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Employee["+i+"]");
		}
	}
	public static void main(String args[])
	{
		Employee2 e[]=new Employee2[3];
		System.out.println(e);
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee2();
			e[i].scan();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}
	}
}
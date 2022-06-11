import java.util.Scanner;
public class Student1
{
	int r_no;
	String name;
	int std;
	String school_name;
	
	void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll-number of the student: ");
		r_no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name of the Student: ");
		name=sc.nextLine();
		System.out.println("Enter Standard of the student: ");
		std=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter School-name of the Student: ");
		school_name=sc.nextLine();
	}
	void display()
	{
		System.out.println("Roll_number:"+r_no+" "+ "Student_name:"+name+" "+"Standard:"+std+" "+"School_name:"+school_name);
	}
	public static void main(String args[])
	{
		//Student1 s1=new Student1();      //primitive array.
		//s1.scan();
		//s1.display();

		Student1 s1[]=new Student1[5];   // refernce variable creation
		System.out.println(s1);                     //it will print hash code
		for(int i=0;i<s1.length;i++)
		{
			//s1[i]=new Student1();          //non primitive array  // it will create object of variable.
			s1[i].scan();	
		}
		for(int i=0;i<s1.length;i++)
		{
			s1[i].display();	
		}
	
	}
}
import java.util.Scanner;
public class Inheritance2
{
	public static void main(String args[])
	{
		
	}
}
class Member
{
	String name,address;
	int age,phoneNumber;
	float salary;
	void printsalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary: ");
		salary=sc.nextFloat();
		System.out.println("The salary is: "+salary);
	}
	
}
class Manager extends Member
{
	String department;
	String ProjectName;
}
class Employee extends Member
{
	String department;	
	String technology;
}
class Person 
{
	String name;
	public Person() 
	{
		System.out.println("hello");	
	}
	public Person(String name) 
	{
		this.name = name;
	} 
}
public class Inheritancedemo extends Person 
{
	int id;
	int salary;

	public Inheritancedemo(int id,String name,int salary) 
	{
		//super(name);
		this.id=id;
		this.salary=salary;
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " " + salary);
	}
	public static void main(String[] args) 
	{
		Inheritancedemo obj = new Inheritancedemo(20, "Rutvi", 10);
		obj.disp();		
	}
	
}
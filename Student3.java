public class Student3
{	
	private int rno;
	private String name;
	private int std;
	public Student3(int rno,String name,int std)
	{
		this.rno=rno;
		this.name=name;
		this.std=std;
	}
	public void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}
	public static void main(String args[])
	{
		Student3 s3=new Student3(2301,"Dev",9);
		s3.display();	
	}
}
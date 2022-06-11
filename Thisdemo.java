public class Thisdemo
{
	int a;
	void valuea(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println("The value of a is: "+a);
	}
	public static void main(String args[])
	{
		Thisdemo t=new Thisdemo();
		t.valuea(200);
		t.display();	
	}
}
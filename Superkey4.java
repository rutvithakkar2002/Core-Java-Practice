class A
{
	int rollno;
	A(int rollno)
	{
		this.rollno=rollno;
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println(rollno);
		System.out.println("Good Evening");
	}
}
class Superkey4
{
	public static void main(String args[])
	{
		B b=new B();
	}
}
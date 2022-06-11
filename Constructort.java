public class Constructort
{
	public static void main(String args[])
	{
		A obj=new A(30,20.1f);    //A obj=new A();----->default to parameterized constructor..
		obj.display();
	} 
}
class A
{
	byte b;//0
	short s;//0
	char c;//Null char
	int i;//0
	long l;//0		
	float f;//0.0
	double d;//0.0
	boolean bb;//false
	A()  //if you want to set other default value of your own gussing..
	{
	//	this(30.1,40);
		System.out.println("A()");
		b=12;
		c='R';
		bb=true;	
	}
	A(int a,float x)
	{
		this(); //jump to default constructor
		System.out.println("A(int,float)");
		i=a;
		f=x;
	}
	void display()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);
	}
}
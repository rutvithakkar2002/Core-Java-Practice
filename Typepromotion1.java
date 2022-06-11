public class Typepromotion1
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		Typepromotion1 t=new Typepromotion1();
		t.sum(10,20);
		t.sum(20,30,1);	
	}
}
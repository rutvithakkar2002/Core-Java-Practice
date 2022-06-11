public class Typepromotion
{
	void sum(int a,long b)
	{
		System.out.println("Method A");
	}
	void sum(long a,int b)
	{
		System.out.println("Method B");
	}
	public static void main(String args[])
	{
		Typepromotion t=new Typepromotion();
		t.sum(10,20);	
	}
}
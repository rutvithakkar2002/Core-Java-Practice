public class Typepromotion2
{
 	 void sum(int a,int b)
	{
		System.out.println("int invoked");
	}
  	void sum(long a,long b)
	{
		System.out.println("long invoked");
	}

	 public static void main(String args[])
	{
		  Typepromotion2 obj=new Typepromotion2();
  		  obj.sum(20,20);
  	}
}

public class ExecutionFlow1
{
	static 
	{
		System.out.println("1) Static Block");
	}

	{
		System.out.println("4) Instance Block");
	}
	
	public ExecutionFlow1() 
	{
		System.out.println("5) Default Constructor");
	}
	public ExecutionFlow1(int no1) 
	{
		System.out.println("5) PARA Constructor " + no1);
	}
	
	public static void staticTest() 
	{
		System.out.println("3) Static method");
	}
	public void NonStaticTest() 
	{
		System.out.println("6) NonStatic method");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("2) START :: Main Method");
		
		ExecutionFlow1.staticTest();
		
		ExecutionFlow1 obj = new ExecutionFlow1();
		
		obj.NonStaticTest();
		
		System.out.println("7) EXIT :: Main Method");
	}
}
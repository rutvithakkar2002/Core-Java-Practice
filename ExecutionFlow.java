public class ExecutionFlow
{
	static
	{
		System.out.println("1 Static Block");	
	}
	{
		System.out.println("4)Instance Block");
	}
	public ExecutionFlow()
	{
		System.out.println("5) Default Constructor");
	}
	public ExecutionFlow(int no)
	{
		System.out.println("5)Para constructor "+no);
	}
	public static void staticTest()
	{
		System.out.println("3) Static method");
	}
	public void NonstaticTest()
	{
		System.out.println("6) Nonstatic method");
	}
	public static void main(String args[])
	{
		System.out.println("2) Start : MAin method");
		ExecutionFlow.staticTest();
		ExecutionFlow obj=new ExecutionFlow();
		obj.NonstaticTest();
		System.out.println("7) Exit : Main method");		
	}
}

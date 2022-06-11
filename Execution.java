class Execution
{
	static 
	{
		System.out.println("Static Block!");	
	}
	{
		System.out.println("Instance block");
	}
	Execution()
	{
		System.out.println("Default constructor!");
	}
	Execution(int no1)
	{
		System.out.println("Parameterized Constructor!");		
	}
	public static void staticmethod()
	{
		System.out.println("This is Static Method!");
	}
	public void nonstatic()
	{
		System.out.println("This is Non static Method!");
	}
	public static void main(String args[])
	{
		System.out.println("Start:: Main Method");
		Execution.staticmethod();
		Execution obj=new Execution();
		obj.nonstatic();
		System.out.println("Exit::Main Method");
	}
}
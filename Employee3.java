public class Employee3
{
	public static void main(String args[])
	{
		Employee3 e[]=new Employee3[5];
		System.out.println(e);
		for(int i=0;i<e.length;i++)
		{
			e[i]=new Employee3();
			e[i].scan();
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
		}
	}
}
public class Test21
{
	public static void main(String args[])
	{
		int i,sum=0;
		for(i=101;i<200;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum is: "+sum);		
	}
}
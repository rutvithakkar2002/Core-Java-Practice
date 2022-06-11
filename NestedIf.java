class NestedIf
{
	public static void main(String args[])
	{
		int x=3,y=1,z=5;
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("x is greater than y and z");	
			}
			else 
			{
				System.out.println("z is greater than x and y");	
			}
		}			
		else
		{
			if(y>z)
			{
				System.out.println("y is greater than z");	
			}

		}
	}
}


















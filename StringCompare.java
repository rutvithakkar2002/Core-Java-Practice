class StringCompare
{
	public static void main(String args[])
	{
		String x="royal";
		String y=new String("Royal");
		/*if(x==y)
		{
			System.out.println("Strings are same..");
		}
		else
		{
			System.out.println("Strings are not same..");	
		}*/
		if(x.equals(y))
		{	
			System.out.println("Strings are same..");
		}
		else
		{
			System.out.println("Strings are not same..");
		}
	}
}
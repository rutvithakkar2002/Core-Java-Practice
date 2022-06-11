public class Strcharat4
{
	public static void main(String args[])
	{
		String str="Hello, Good Morning Everyone";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='o')
			{
				count++;
			}
		}
		System.out.println("Frequency of o is: "+count);
	}
}
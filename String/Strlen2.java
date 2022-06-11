public class Strlen2
{
	public static void main(String args[])
	{
		String s1="Rutvi Thakkar";
		int n=s1.length();
		System.out.println("Reverse "+s1+" is: " );
		for(int i=0;i<n;i++)
		{
			System.out.print(s1.charAt(s1.length()-i-1));
		}
	}
}
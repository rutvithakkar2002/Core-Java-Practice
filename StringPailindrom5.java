import java.util.Scanner;
public class StringPailindrom5
{
	public static boolean pailindrom(String str)
	{	
		String rev=" ";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
			if(str.equalsIgnoreCase(rev))
			{
				return true;
			}	
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1;
		System.out.println("Enter a String: ");
		str1=sc.nextLine();
		String s1[]=str1.split("\\s");
		for(int i=0;i<s1.length;i++)
		{
			if(pailindrom(s1[i]))
			{
				System.out.println(s1[i]+" is pailindrom");		
			}
		}	
		
	}
}
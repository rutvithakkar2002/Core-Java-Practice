import java.util.Scanner;
public class Stringpailindrom7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int i,j;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		String s1[]=str.split("\\s");
		System.out.println(s1.length);
		for(String s:s1)
		{		
			boolean flag=true;
			for(i=0,j=(s.length()-1);i<s.length();i++,j--)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(s+" is Pail-in-drom");
			}
			else
			{
				System.out.println(s+" is not pail-in-drom");
			}
		}			
	}
}
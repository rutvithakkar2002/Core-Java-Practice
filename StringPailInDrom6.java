import java.util.Scanner;
public class StringPailindrom6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int i,j;
		boolean flag=true;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		String s1[]=str.split("\\s");
		for(String s:s1)
		{	
			for(i=0,j=(s.length()-1);i<s.length();i++,j--)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					flag=false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println(str+" is Pail-in-drom");
		}
		else
		{
			System.out.println(str+" is not pail-in-drom");
		}			
	}
}
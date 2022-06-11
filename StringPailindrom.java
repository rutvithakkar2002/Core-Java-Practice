import java.util.Scanner;
public class StringPailindrom
{
	public static void main(String args[])
	{
		String str="",rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		str=sc.next();
		
		StringBuffer sb=new StringBuffer(str);
		rev=sb.reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("String is pail in drom");
		}
		else
		{
			System.out.println("String is not pail in drom");
		}
		
	}
}
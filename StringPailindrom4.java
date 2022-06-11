import java.util.Scanner;
public class StringPailindrom4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int i,j;
		boolean flag=true;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		for(i=0,j=(str.length()-1);i<str.length();i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=false;
				break;
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
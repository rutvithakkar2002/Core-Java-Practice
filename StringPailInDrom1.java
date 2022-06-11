import java.util.Scanner;
public class StringPailInDrom1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,r=" ";
		System.out.print("Enter a String: ");
		str=sc.next();
		String str1=str.toLowerCase();
		StringBuffer sb=new StringBuffer(str1);
		r=sb.reverse().toString();
		
		if(str1.equals(r))
		{
			System.out.println("above String is pail-in-drom");
		}
		else

		{
			System.out.println("above String is not pail-in-drom");
		}				
	}
}
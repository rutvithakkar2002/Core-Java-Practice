import java.util.Scanner;
public class Stringrev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		str=str.trim();
		String a[]=str.split("\\s");
		String s1="";
		String rev;
		String senrev="";
		for(int i=0;i<a.length;i++)
		{		
			s1=a[i];
			s1=s1.trim();
			rev="";
			for(int j=(s1.length()-1);j>=0;j--)
			{
				rev=rev+s1.charAt(j);
			}
			senrev=senrev+" "+rev;
		}
		System.out.println("Reverse sentence is: "+senrev);	
	}
}
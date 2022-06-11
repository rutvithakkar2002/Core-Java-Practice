/*Hello
H-1
e-1
l-2
o-1*/
import java.util.Scanner;
public class Stringoccurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		int i,j;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		int n=str.length();
		int count[]=new int[n];
		str=str.toLowerCase();
		str=str.trim();
		char a[]=str.toCharArray();
		for(i=0;i<a.length;i++)
		{
			count[i]=1;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count[i]++;
					a[j]='0';
				}	
			}	
			
		}
		String space[]=str.split("\\s");
		System.out.println("Number of spaces are: "+space.length);
		for(i=0;i<count.length;i++)
		{
			if(a[i]!=' '&&a[i]!='0')
			{
				System.out.println(a[i]+" "+count[i]);
			}
		}	
	}
}

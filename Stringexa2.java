import java.util.Scanner;
public class Stringexa2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,word;
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		System.out.println("Enter a word for Searching: ");
		word=sc.nextLine();
		String x[] = str.split(' ');
		for (int i = 0; i < str.length(); i++) {
			System.out.print(x[i]);
		}
		for(int i=0;i<x[i];i++)
		{
			if(str.charAt(i))
			{
				System.out.println("word found!!");
			}
			else
			{
				System.out.println("word not found!");
			}
		}
			
	}
}
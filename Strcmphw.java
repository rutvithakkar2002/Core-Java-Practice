import java.util.Scanner;
class Strcmphw
{
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		String str1,str2;
		System.out.print("Enter a String1: ");
		str1=scr.nextLine();
		System.out.print("Enter a String2: ");
		str2=scr.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.equals(str2))
		{
			System.out.println("Both Strings are same..");
		}
		else
		{
			System.out.println("Both Strings are not same..");
		}
	}
}
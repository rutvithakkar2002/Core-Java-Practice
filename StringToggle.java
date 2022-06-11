import java.util.Scanner;
class StringToggle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		String togglestr="";
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x>='A' && x<='Z')
			{
				x=(char)(x+32);
				togglestr=togglestr+x;
			}
			else if(x>='a' && x<='z')
			{
				x=(char)(x-32);
				togglestr=togglestr+x;	
			}
			else

			{
				togglestr=togglestr+x;
			}
		}
		System.out.println(togglestr);
	}
}
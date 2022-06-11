public class Strtrim2
{
	public static void main(String args[])
	{
		String str=" Good Morning Everyone  ";
		if(str.trim().length()>0)
		{
			System.out.println("String Contains Character");
		}
		else
		{
			System.out.println("The String Contans spaces");
		}
		String str1=" ";
		if(str1.trim().length()>0)
		{
			System.out.println("String Contains Character");
		}
		else
		{
			System.out.println("The String Contans spaces");
		}
		
	}
}
public class Stringequals
{
	public static void main(String args[])
	{
		String str1="royal";
		String str2="royal";
		//String str2=new String("royal");//check reference
		if(str1==str2)
		{
			System.out.println("Both Strings are same!");
		}
		else
		{
			System.out.println("Both Strings are different!!");
		}
	}
}
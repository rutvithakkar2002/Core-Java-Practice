public class Strtochararray1
{
	public static void main(String args[])
	{
		String s1="Rutvi is a Brave Girl!";
		char ch[]=s1.toCharArray();
		int len=ch.length;
		System.out.println(len);
		System.out.println("Array Elements: ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
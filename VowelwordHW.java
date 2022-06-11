import java.util.Scanner;
class Vwhw
{
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		String str1;
		int vowel=0;
		int word=1;
		System.out.println("Enter a String: ");
		str1=scr.nextLine(); 
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				vowel++;
			}
			if(str1.charAt(i)==' ')
			{
				word++;
			}
		}
		System.out.println("Vowels are: "+vowel);
		System.out.println("words are: "+word);
		System.out.println("String is 	: "+str1);
	}
}
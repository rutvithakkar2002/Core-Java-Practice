import java.util.Scanner;
class Vowelword
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		int vowel=0;
		int words=1;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowel=vowel+1;
			}
			if(str.charAt(i)==' ')
			{
				words=words+1;
			}
		}
		System.out.println("Vowels are: "+vowel);
		System.out.println("Words are : "+words);

	}
}
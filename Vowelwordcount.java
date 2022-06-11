class Vowelwordcount
{
	public static void main(String args[])
	{
		String str1="Royal Education private limited";
		int vowel=0;
		int word=1;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)=='a' ||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
			{
				vowel++;
			}
			if(str1.charAt(i)==' ')
			{
				word++;
			}
		}
		System.out.println("String is: "+str1);
		System.out.println("words are: "+word);
		System.out.println("vowels are: "+vowel);
	}
}
public class Strindexof1
{
	public static void main(String args[])
	{
		String s1="Music is the strongest form of magic";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='i')
			{
				count++;
					
			}
		}	
		System.out.println("i comes "+count +" times in the String...");		
	}
}
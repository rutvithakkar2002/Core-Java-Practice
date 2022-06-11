public class Strcharat3
{
	public static void main(String args[])
	{
		String str="Hello, Good Morning Everyone";
		for(int i=0;i<str.length()-1;i++)
		{
			if(i%2==0)
			{
				 System.out.println("Char at "+i+" place "+str.charAt(i));  
			}
		}
		
	}
}
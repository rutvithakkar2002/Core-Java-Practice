import java.util.Scanner;
class Stringexa
{
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);	
		String str1;
		int n=0;
		System.out.print("Enter a String: ");
		str1=scr.nextLine();
		System.out.println("The string is: "+str1);
		System.out.println("Enter word for searching: ");
		String word=scr.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
			if(str1.equalsIgnoreCase(word))
			{
				System.out.println("word found in the String!");
				n++;	
			}
		}
		 if(str1.compareToIgnoreCase(word) == 0 ) 
		{
        			System.out.println("same compareToIG");
        		}
		else 
		{
        			System.out.println("not same compareToIG");
        		}
		System.out.println(word+" found "+n +" times");		
	}
}
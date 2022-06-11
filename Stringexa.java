/*
  jony jony yes papa
find: Jony
jony found 2 times..*/
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
		/*if(str1.equalsIgnoreCase(word))
		{
			System.out.println("word found in the String!");
			n++;	
		}
		else
		{
			System.out.println("The String is not found...");
		}*/
		System.out.println(word+" found "+n +" times");	
		/* if(str1.compareToIgnoreCase(word) == 0 ) 
		{
        			n++;
        		}
		else 
		{
        			System.out.println("the word is not found!!");
        		}*/
		
	}
}
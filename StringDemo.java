//Strings--->Collection of characters----String:class
//Strings are immutable!
import java.util.Scanner;
class StringDemo
{
	public static void main(String args[])
	{
		String str1="Royal";//str1 ref-->Royal is a value
		String str2=new String("royal");//str2 ref-->Royal value-->new is an instance
		Scanner scr = new Scanner(System.in);
        	// str = scr.next();//scan a string without space 
       		// System.out.println(str);

        	// str = scr.nextLine();//scan a string with space 
       	        // System.out.println(str);

		String x="Royal education";
		for(int i=0;i<x.length();i++)
		{
			System.out.println(x.charAt(i));     //read character by character
		}
		

	}
}
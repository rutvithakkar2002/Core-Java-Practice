public class Strgetchar
{  
	public static void main(String args[])
	{  
 		String str = new String("hello Everyone how r u");  
      		char words[] = new char[10];    
         		str.getChars(6, 16, words, 0);  
         		System.out.println(words);  
      	}
}
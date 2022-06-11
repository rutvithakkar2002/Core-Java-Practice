public class Strgetchar2 
{  
	public static void main(String[] args) 
	{  
        		String s1 = new String("Welcome to Javatpoint");  
        		char c[]  = new char[20];  
        	
            			s1.getChars(1, 26, c, 0);  
            			System.out.println(c);  
    	}  
}  
public class Strgetbyte2
{  
	public static void main(String args[])  
	{    
		String str = "Welcome 2022.";  
		System.out.println("The input String is : ");  
		System.out.println(str);  	
		byte b[] = str.getBytes("UTF-17");  
		System.out.println("After converted the String is : ");  
  
		for (int j = 0; j < b.length; j++)   
		{  
			System.out.print(b[j]);  
		}  
	}  
}  
public class Strindexof3 
{
	public static void main(String[] args) 
	{	
		String s1 = "Honesty is the best policyy";  		
		int index = s1.indexOf("method", 10); 
		System.out.println("index of substring "+index);
		index = s1.indexOf("is", 0); 
		System.out.println("index of substring "+index);		
	}
}

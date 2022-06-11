public class Strformat3
{  
	public static void main(String[] args) 
	{          
        		String str1 = String.format("%d", 10000);  
       		String str2 = String.format("|%10d|",00101);  
      		String str3 = String.format("|%-10d|", 11101);  
        		String str4 = String.format("|% d|", 1011);   
        		String str5 = String.format("|%010d|", 1101); 
        		System.out.println(str1);  
        		System.out.println(str2);  
        		System.out.println(str3);  
        		System.out.println(str4);  
        		System.out.println(str5);  
    }  
}  
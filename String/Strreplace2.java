public class Strreplace2  
{  
	public static void main(String argvs[])  
	{ 	 
 		String str = "For learning Java, JavaTpoint is a very good site.";  
		int size = str.length();  
  		System.out.println(str);  
		String target = null;  
		str = str.replace(target, "JavaTpoint ");  
 		System.out.println(str);    
	}  
}  
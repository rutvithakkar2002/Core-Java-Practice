public class Strformat
{  
	public static void main(String args[])
	{  
		String name="Rutvi";  
		String s1=String.format("name is %s",name);  
		String s2=String.format("value is %f",322.33434);  
		String s3=String.format("value is %322.12f",32.33434);
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
	}
}  
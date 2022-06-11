public class Strequals2
{
	public static void main(String args[])	
	{
		String s1="a";
		String s2="3301";
		String s3="12.3";
		String s4="True";
		Character c=new Character('a');
		Integer i=new Integer(3301);
		Float f=new Float(12.3);
		Boolean b=new Boolean(true);
		
		System.out.println(s1.equals(c));
		System.out.println(s2.equals(i));
		System.out.println(s3.equals(f));
		System.out.println(s4.equals(b));
		
		System.out.println(s1.equals(c.toString()));  
		System.out.println(s2.equals(i.toString()));  
		System.out.println(s3.equals(f.toString()));  
		System.out.println(s4.equals(b.toString()));  
		
		
	}
}
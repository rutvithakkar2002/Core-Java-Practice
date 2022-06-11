public class Strintern1
{
	public static void main(String args[])
	{
		String s1="free smile";
		String s2=s1.intern();
		String s3=new String("free smile");
		String s4=s3.intern();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);        
        		System.out.println(s2==s3);   
     		System.out.println(s2==s4);         
        		System.out.println(s3==s4);   
	}
}	
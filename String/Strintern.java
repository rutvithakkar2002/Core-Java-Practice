public class Strintern
{
	public static void main(String args[])
	{
		String s1="Rutvi Thakkar";
		String s2=new String("Rutvi Thakkar");
		String s3=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
	}
}	
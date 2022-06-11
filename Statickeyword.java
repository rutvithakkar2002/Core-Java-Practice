public class Statickeyword
{
	private int roll_no;
	private String name;
	private int std;
	private static String School_name;
	Statickeyword(int r,String n,int s)
	{
		roll_no=r;
		name=n;
		std=s;
	}
	public static String getschoolname()
	{
		return School_name;
	}
	public int getrno(int roll_no)
	{
		return roll_no;
	}
	public static void schoolname(String School_name)
	{
		Statickeyword.School_name=School_name;
	}
	public static void main(String args[])
	{
		Statickeyword s1=new Statickeyword(1,"Rutvi",10);	
		Statickeyword s2=new Statickeyword(1,"Rutvi",10);	
		Statickeyword s3=new Statickeyword(1,"Rutvi",10);	
		Statickeyword s4=new Statickeyword(1,"Rutvi",10);	
		Statickeyword s5=new Statickeyword(1,"Rutvi",10);	
		System.out.println(s1.getrno()+" "+s1.getschoolname());			
	}
}
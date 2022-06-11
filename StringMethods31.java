public class StringMethods31
{
	public static void main(String[] args) 
	{
		String s1 = "    royal education      ahmedabad   india            ";
		String s2 = "         royal,education,ahmedabad,india";
		s1=s1.trim();//it will remove the space from String only at the begining & end. 
		//s2.split("\\s");      

		System.out.println(s1);
		System.out.println(s2);
		String s1Split[] = s1.split(",");
		for(int i=0;i<s1Split.length;i++)
		{
			System.out.println(s1Split[i]);
		}
		System.out.println(s1Split.length);// size
		System.out.println(s1.length());
	}
}
//royal education ahmedabad india
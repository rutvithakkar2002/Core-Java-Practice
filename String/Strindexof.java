public class Strindexof
{
	public static void main(String args[])
	{
		String s1="Music is the strongest form of magic";
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("form");
		System.out.println(index1+" "+index2);
		int index3=s1.indexOf("ic",5);
		System.out.println(index3);
		int index4=s1.indexOf('s');
		System.out.println(index4);	
	}
}
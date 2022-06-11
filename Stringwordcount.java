import java.util.Scanner;
class Stringwordcount
{
	public static void main(String args[])
	{
		String str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		str1=sc.nextLine();
		String[] cntword=str1.split("\\s+");   //it will split with single or multiple spaces.
		System.out.println("String is: "+str1);
		System.out.println("words are: "+cntword.length);
	}
}
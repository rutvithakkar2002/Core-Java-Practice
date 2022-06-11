import java.util.Scanner;
public class Revision
{
	public static void main(String args[])
	{
		int no,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		no=sc.nextInt();
		while(no!=0)
		{	
			no=no/10;
			cnt++;
		}
		System.out.println("The number of digits are: "+cnt);		
	}
}
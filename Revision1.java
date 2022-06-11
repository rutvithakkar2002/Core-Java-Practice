//1234567894
//4851
import java.util.Scanner;
public class Revision1
{
	public static void main(String args[])
	{
		int no=1234567,rev,sum=0,cnt=0;
		Scanner sc=new Scanner(System.in);
		while(no!=0)
		{	
			no=no/10;
			cnt++;
		}
		System.out.println("The number of digits are: "+cnt);		
		while(no>0)
		{	
			rev=no%10;
			sum=sum*10+rev;
			no=no/10;
		}
		System.out.println(sum);
	}
}
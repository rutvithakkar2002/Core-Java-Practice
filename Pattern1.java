import java.util.Scanner;
public class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0,n,j;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
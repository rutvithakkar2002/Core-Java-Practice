import java.util.Scanner;
public class Pattern2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0,n,j;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
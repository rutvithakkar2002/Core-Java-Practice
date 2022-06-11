import java.util.Scanner;
public class Twodarrayduplicate
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		char c[]=new char[9];
		int i,j;
		System.out.println("Enter elements 3*3 array:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=1;j<3-1;j++)
			{	
				System.out.println(a[0][0]);
				if(a[i][j]==a[i+1][j+1])
				{
					a[i][j]=c;
				}
				else
				{
					System.out.println(a[i][j]);
				}
			}
			System.out.println(" ");
		}
		
	}		
}
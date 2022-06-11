import java.util.Scanner;
public class Twodarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,sum=0;
		int a[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter element: ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements are:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				sum=sum+ a[i][j];
			}
			System.out.println("Sum is : "+sum);
			sum=0;
			System.out.println(" ");
		}
	}
}
import java.util.Scanner;
public class Twodarraysort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j,temp,i1,j1;
		System.out.println("Enter elements 3*3 array:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i1=0;i1<3;i1++)
		{
			for(j1=0;j1<3;j1++)
			{
				for(i=0;i<3;i++)
				{
					for(j=1;j<3;j++)
					{	
						if(a[i1][j1]>a[i][j])
						{
							temp=a[i1][j1];
							a[i1][j1]=a[i][j];
							a[i][j]=temp;
						}
					}
				}
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}		
}
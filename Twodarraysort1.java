import java.util.Scanner;
public class Twodarraysort1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[]=new int[9];
		int i,j,temp;
		System.out.println("Enter elements 3*3 array:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("Enter number: ");
				a[i][j]=sc.nextInt();
			}
		}
		//print
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		//convert 2d into 1d
		//copy all elements in 1d array
		int x=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[x]=a[i][j];
				//b[x++]=a[i][j];
				x++;				
			}
		}
		//print 1d array
		System.out.println("1D array is: ");
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		//sorting 1 D

		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length-1;j++)
			{
				if(b[j] > b[j+1])
				{
					temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}	
			}
		}
		System.out.println("Sorted 1D array is: ");
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		//copy all 1d data into 2d
		x=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=b[x];
				x++;
			}
		}
		System.out.println("2D array- sorted");
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
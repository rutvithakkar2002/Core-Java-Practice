/*1 2 3
  4 5 6
  7 8 9*/

/*output
1 4 7
2 5 8 
3 6 9

1 2
3 4

o/p
1 3
2 4*/

import java.util.Scanner;
public class Twodarrayrowtocolmn
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		int i,j;
		System.out.println("Enter2*2 elements: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();			
			}
		}
		System.out.println("Elements are: ");	
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");	
		}
		System.out.println(" After converting Row to column the array is: ");
		for(j=0;j<a.length;j++)
		{
			for(i=0;i<a.length;i++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");	
		}
	}
}
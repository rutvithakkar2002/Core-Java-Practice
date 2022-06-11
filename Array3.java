//find  out the maximum of the 1 d array!!!
import java.util.Scanner;
public class Array3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i,j,temp;
		int max=a[0];
		System.out.println("Enter 5 elements: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}	
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}			
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}		
	}
}
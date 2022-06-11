//bubule sort
/*70 40 50 10
pass1: 70 40 50 10
             |	|
              ___
            swap*/
import java.util.Scanner;
public class Sortarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp;
		int a[]=new int[5];
		System.out.println("Enter 5 elements one by one: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=1;i<a.length;i++)
		{
			for(j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted elememts are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
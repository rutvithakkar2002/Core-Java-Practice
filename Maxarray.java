//find  out the maximum of the 1 d array!!!
import java.util.Scanner;
public class Maxarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int i;
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
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];		
			}
		}	
		System.out.println();
		System.out.println("Maximum number is: "+max);
	}
}
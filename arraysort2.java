import java.util.Scanner;
import java.util.Arrays;
public class arraysort2
{
	public static void main(String args[])
	{
 		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("Sorted Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a.length);
		
	}
}
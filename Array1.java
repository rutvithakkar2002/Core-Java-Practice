import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 elements of an array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter A["+i+"]");
			a[i]=sc.nextInt();
		}
		System.out.println("Elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("A[" +i+ "] is: "+a[i]);
		}	
	}
}
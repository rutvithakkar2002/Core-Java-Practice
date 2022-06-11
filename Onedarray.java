import java.util.Scanner;
public class Onedarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Element"+i+":"+marks[i]);
		}
		 
	}
}
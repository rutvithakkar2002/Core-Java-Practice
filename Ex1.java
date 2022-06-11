import java.util.Scanner;
public class Ex1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sum=0.0;
		int n;
		System.out.println("Enter n value: ");  
		n=sc.nextInt();  
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}		
		System.out.println(sum);		
	}
}
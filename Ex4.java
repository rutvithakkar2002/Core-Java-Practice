import java.util.Scanner;
public class Ex4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase price: ");
		double purchaseprice=sc.nextDouble();
		System.out.println("Enter salvage value: ");
		double salvage=sc.nextDouble();
		System.out.println("Enter years of service: ");
		double years=sc.nextDouble();
		double depriciation=(purchaseprice-salvage)/years;
		System.out.println("Depriciation: "+depriciation);
	}
}
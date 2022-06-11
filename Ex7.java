import java.util.Scanner;
public class Ex7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter demand rate: ");	
		double d_rate=sc.nextFloat();
		System.out.println("Enter setup-cost: ");
		double s_cost=sc.nextFloat();
		System.out.println("Enter holding cost per unit time: ");
		double hold_cost=sc.nextFloat();
		double EOQ=Math.sqrt((2*d_rate*s_cost)/hold_cost);
		double TBO=Math.sqrt((2*s_cost)/(d_rate*hold_cost));
		System.out.println("Economic order quantity is: "+EOQ);
		System.out.println("Time between orders is: "+TBO);
	}
}
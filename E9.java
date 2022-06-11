import java.util.Scanner;
public class Ex9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter resistance: ");	
		double R=sc.nextFloat();
		System.out.println("Enter Inductance: ");
		double L=sc.nextFloat();
		System.out.println("Enter Capacitance: ");
		double C=sc.nextFloat();
		double frequency=Math.sqrt((1/(L*C)-((R*R)/(a*c*c)))
		System.out.println("Frequency is: "+frequency);
	}
}
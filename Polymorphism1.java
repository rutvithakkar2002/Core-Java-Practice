import java.util.Scanner;
public class Polymorphism1
{
	static double add(double no1,double no2)
	{
		return(no1+no2);
	}
	static int add(int no1,int no2)
	{
		return(no1+no2);	
	}
	public static void main(String args[])
	{
		System.out.println("Addition is: "+add(10.202,4.23));	
	}
}
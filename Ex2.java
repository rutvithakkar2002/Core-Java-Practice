import java.util.Scanner;
public class Ex2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float price;
		int paise;
		System.out.println("Enter price of an item: ");
		price=sc.nextFloat();	
            		System.out.println("Price before converting = "+price);
          		paise=(int)price*100;
		System.out.println("converting price to paise = "+paise);	
	}
}
import java.util.Scanner;
public class Test20
{
	public static void main(String args[])
	{
		int ch;
		int price=300;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Gujarati Food");
		System.out.println("2. South Indian Food");
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();

		switch(ch)
		{
			case 1: 
				System.out.println("------------------------Gujarati food Menu....................");
				System.out.println(" 1. Dhokda ");
				System.out.println("2. fix Gujarati thali ");
				System.out.println("3.  Dabeli");
				System.out.println("4. Bhaji-pav ");
				
				System.out.println("Enter your choice: ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						int quantity;
						System.out.println("You selected Dhokda");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;

					case 2:

						System.out.println("You selected Fix gujarati thali");
						System.out.println("enter the quantity: ");		
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;
					case 3:
						System.out.println("You selected Dabeli");
						System.out.println("enter the quantity: ");		
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;
					case 4:
						System.out.println("You selected Bhaji-pav");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;	
					default:
						System.out.println("Invalid choice!");	
						break;
					
				}
			break;
		

			case 2:
				System.out.println("------------------------South_Indian_food....................");
				System.out.println(" 1. Idli sambhar");
				System.out.println(" 2. Dhosa ");
				System.out.println(" 3. Only Idli ");
				System.out.println(" 4. Dhosa with butter ");
				
				System.out.println("Enter your choice: ");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						System.out.println("You seleected Idli sambhar");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;

					case 2:
						System.out.println("You selected Dhosa");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;
					case 3:
						System.out.println("You selected south only Idli");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;
					case 4:
						System.out.println("You selected south Dhosa with buter");
						System.out.println("enter the quantity: ");
						quantity=sc.nextInt();
						price=quantity*price;
						System.out.println("Your bill is: "+price);
						break;	
					default:
						System.out.println("Invalid choice!");	
						break;
					
				}
		default:
		
			System.out.println("Invalid choice!!");	
			break;				
				
		}
	}
}
/*mini-application for a banking system in Java. In this program, we will add some basic functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.

Initially, the program accepts the number of customers we need to add and adds the customer and account details accordingly. Further, it displays the series of menus to operate over the accounts.

The series of menus displayed are as follows:

1) Display all account details
2) Search by account number
3) Deposit the amount
4) Withdraw the amount
5) Exit*/
import java.util.Scanner;
public class BankApp
{
	float balance,withdraw,deposit;		
	int AccountNumber;
	String customerName,AccountType;
	BankApp()
	{
		balance=10000;
	}
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		customerName=sc.nextLine();
		System.out.println("Enter AccountNumber: ");
		AccountNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account type---->current or saving: ");
		AccountType=sc.nextLine();
		System.out.println("Name: "+customerName+" "+"AccountNumber: "+AccountNumber+" "+"AccountType: "+AccountType);
	}
	void deposit()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		deposit=sc.nextFloat();
		if(deposit>0)
		{
			balance=balance+deposit;
		}
		else
		{
			System.out.println("You can not deposit amount less than 0 or 0");
		}
	}
	void search()
	{
		
	}
	void withdraw()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		withdraw=sc.nextFloat();
		if(withdraw>balance)
		{
			System.out.println("Sorry, your balance is less than withdraw amount!!");
		}
		else
		{
			balance=balance-withdraw;
			System.out.println("You have withdraw"+withdraw+" amount Successfully ");
		}
	}
	void checkbalance()
	{
		System.out.println("The balance is: "+balance);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankApp b1=new BankApp();
		System.out.println("1-----------------Display all account number.");
		System.out.println("2-----------------Search by Account number.");
		System.out.println("3-----------------Deposit the amount.");
		System.out.println("4------------------Withdraw the amount.");
		System.out.println("5------------------Exit.");		
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		while(true)
		{
			switch(choice)
			{
				case 1:
					b1.display();
					break;
				/*case 2:
					b1.search();
					break;*/	
				case 3:
					b1.deposit();
					break;
				case 4:
					b1.withdraw();
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}
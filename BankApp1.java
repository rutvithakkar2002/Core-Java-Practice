/*mini-application for a banking system in Java. In this program, we will add some basic functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.

Initially, the program accepts the number of customers we need to add and adds the customer and account details accordingly. Further, it displays the series of menus to operate over the accounts.

The series of menus displayed are as follows:

1) Display all account details
2) Search by account number
3) Deposit the amount
4) Withdraw the amount
5) Exit*/
import java.util.Scanner;
public class BankApp1
{
	float balance,deposit,withdraw;
	String cus_name,uName,password;
	BankApp1()
	{
		balance=10000f;
		uName="rutvi";
		password="rutvi";
		cus_name="Rutvi";
	}
	int login(String user,String pass)
	{
		if(user.equals(uName)&&pass.equals(password))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	void depositAmount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		deposit=sc.nextFloat();
		if(deposit>0)
		{
			balance=balance+deposit;
		}	
		else
		{
			System.out.println("You can not enter amount zero or less than zero");
		}
	}
	void withdrawAmount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount you want to deposit: ");
		withdraw=sc.nextFloat();
		balance=balance-withdraw;	
	}
	void checkbalance()
	{
		System.out.println("The Current balance is: "+balance);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankApp1 b1=new BankApp1();
		while(true)
		{
			System.out.println("1-----------------Display all account number.");
	//		System.out.println("2-----------------Search by Account number.");
			System.out.println("3-----------------Deposit the amount.");
			System.out.println("4------------------Withdraw the amount.");
			System.out.println("5------------------Exit.");		
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					b1.checkbalance();
					break;
				/*case 2:
					b1.search();
					break;*/	
				case 3:
					b1.depositAmount();
					break;
				case 4:
					b1.withdrawAmount();
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}
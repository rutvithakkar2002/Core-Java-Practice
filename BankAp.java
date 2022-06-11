import java.util.Scanner;
public class BankAp
{
	Scanner sc=new Scanner(System.in);
	double balance;
	String uName,password;
	String customerName;
	char AccountType;
	long AccountNumber;

	BankAp()
	{
		balance=10000f;
		uName="Rutvi";
		password="Rutvi";
	}
	int Adminlogin(String user,String pass)
	{
		if(user.equals(uName) && pass.equals(password))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}	
	void CreateAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		customerName=sc.nextLine();
		System.out.println("Enter AccountNumber: ");
		AccountNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Account type---->current or saving: ");
		AccountType=sc.next().charAt(0);
		System.out.println("Initial Balance is :"+balance);
	}
	void deposit()
	{
		double amount;
		System.out.println("Enter the amount:");
		amount=sc.nextDouble();
		if(amount >0)
		{
			balance=balance+amount;
		}
		else
		{
			System.out.println("Sorry, Amount is less than 0 so can not deposit!");

		}
		System.out.println(amount+" Deposited  Successfully in your Account..");
			
	}
	void withdraw()
	{
		double amount;
		System.out.println("Enter the amount:");
		amount=sc.nextDouble();
		if(amount<balance)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("You must keep minimum10000 amount in your Account! ");	
		}
		System.out.println(amount+" Deposited  Successfully in your Account..");
			
	}
	void checkbalance()
	{
		System.out.println("Your Updated balance is: "+balance);
	}
	void display()
	{
		System.out.println("Name: "+customerName+" "+"AccountNumber: "+AccountNumber+" "+"AccountType: "+AccountType);
	}
	public static void main(String args[])
	{
		int choice;
		BankAp b=new BankAp();
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Login As a Admin!?");
		System.out.println("2. Login As a Customer");
		System.out.println("3.Exit");
		while(true){
		System.out.println("Enter Your Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1: 
					System.out.println("Enter Your Username: ");
					String user=sc.next();
					System.out.println("Enter Your Password:");
					String pass=sc.next();
					if(b.Adminlogin(user,pass)==1)
					{
						System.out.println("Your Login is Successful!");					
						int ch;
			
						System.out.println("1.Create An Account.");
						System.out.println("2. Check Details!");
						System.out.println("3. Exit");	
			
						System.out.println("Enter Your Choice:");
						ch=sc.nextInt();
						switch(ch)
						{
							case 1:
								b.CreateAccount();
								break;
							case 2:
								b.display();
								break;
							case 3:
								System.exit(0);
							default:
								System.out.println("Invalid Choice!");
						}
					}
					else
					{
						System.out.println("Invalid user name and password!!!");
					}
					break;
			case 2:
				int ch1;
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3.CheckBalance");
				System.out.println("Enter Your Choice: ");
				ch1=sc.nextInt();
				
				switch(ch1)
				{
					case 1:
						b.deposit();
						break;
					case 2:
						b.withdraw();
						break;
					case 3:
						b.checkbalance();
						break;
					case 4:
						System.exit(0);
					default:
						System.out.println("You are entered invalid Choice!!!!");		
				}
					
				break;
			case 3:
				System.exit(0);
			deafault:
 				System.out.println("Invalid Choice!!");		
								
		}
		}
	}	
}
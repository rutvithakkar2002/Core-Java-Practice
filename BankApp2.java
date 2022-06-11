import java.util.Scanner;
public class BankApp2
{
	public static void main(String args[])
	{
		BankAccount b1=new BankAccount("Rutvi","B0001");
		b1.showmenu();
				
	}
}
class BankAccount
{
	float balance;
	float previoustransaction;
	String cus_name,cus_id;
	char ch;
	BankAccount(String c_name,String c_id)
	{
		cus_name=c_name;
		cus_id=c_id;
		balance=10000f;
	}
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previoustransaction=amount;
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previoustransaction=-amount;
		}
	}
	void getprevioustransaction()
	{
		if(previoustransaction>0)
		{
			System.out.println("Previoustransaction deposited: "+previoustransaction);
		}
		else if(previoustransaction<0)
		{
			System.out.println("Previoustransaction withdraw: "+Math.abs(previoustransaction));
		}
		else
		{
			System.out.println("No transaction occured!!");
		}
	}
	void showmenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome, dear "+cus_name);
		System.out.println("Your id is "+cus_id);
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. check previous transaction");
		System.out.println("E. exit");
		do
		{
			System.out.println("Enter your choice: ");
			char ch=sc.next().charAt(0); 
			switch(ch)
			{
				case 'A': 
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Balance="+balance);
					System.out.println("---------------------------------------------------------------------");
					break;
				case 'B':                     
					System.out.println("Enter the amount for deposit: ");
					int amount=sc.nextInt();	
					deposit(amount);
					break;
				case 'C':            
					System.out.println("Enter the amount for withdraw: ");
					int amount2=sc.nextInt();	
					withdraw(amount2);
					break;
				case 'D':
					getprevioustransaction();
					break;
				case 'E':
					System.exit(0);
				default:
					System.out.println("Invalid choice!! please enter again!!");
					break;
			}
		}while(ch != 'E');
		System.out.println("Thankyou for using our services..");
	}
}
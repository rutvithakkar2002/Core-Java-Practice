import java.util.Scanner;
public class BankApp5
{
	BankApp5()
	{
		float balance=10000;
	}
	void getdata()
	{
		String name;
		int ac_no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Account no: ");
		ac_no=sc.nextInt();		
	}
	void setdata()
	{
		System.out.println("Name: "+name);
		System.out.println("Account no: "+ac_no);
		System.out.println("Current BAlance is: "+balance);
	}
	void withdraw()
	{
		float amt;
		System.out.println("Enter balance for withdraw: ");
		amt=sc.nextFloat();
		balance=balance-amt;
	}
	void deposit()
	{
		float amt;
		System.out.println("Enter balance for Deposit: ");
		amt=sc.nextFloat();
		balance=balance+amt;		
	}
	void display()
	{
		System.out.println("Name: "+name"+" "+ac_no+"\n Your current time balance is: "+balance);
	}
	public stratic void main(String args[])
	{
		int choice;
		BankApp5 b=new BankApp();
		System.out.println("1) For Basic Information");
		System.out.println("2) For Deposit");
		System.out.println("3) For Withdraw");
		System.out.println("4) For Current Balance Details");
		while(true)
		{
			System.out.println("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(ch)
			{
				case 1:
					b.setdata();
					break;
				case 2:
					b.setdata();
					break;
				case 3:
					b.withdraw();
					break;
				case 4:
					b.display();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("You are given Invalid choice!");
			}		
		}
	}	
}
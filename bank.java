import java.util.Scanner;
public class bank {
	String pwd,uname;
	String name,cuspwd;
	char acc_type;
	double balance;
	long acc_no;
	long baccno;
	bank()
	{
		uname="Rutvi@2002";
		pwd="Rutvi@2002";
		balance=10000f;
	}
	int Adminlogin(String user,String pass)
	{	
		if(user.equals(uname) && pass.equals(pwd))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	int searchbyAccountno(long baccno)
	{
		if(baccno==acc_no)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	void transfer()
	{
		
		System.out.println("Transfer Successfully!");
	}
	void createAccount()
	{
		Scanner sc=new Scanner(System.in);
		//Random rand=new Random();
		System.out.println("Enter Your Name: ");
		name=sc.nextLine();
		System.out.println("Please Enter Password for Account: ");
		cuspwd=sc.nextLine();
		System.out.println("Enter the Account type----> Current or Saving:");
		acc_type=sc.nextLine().charAt(0);
		System.out.println("Enter Account number: ");
		acc_no=sc.nextLong();
		if ((acc_no+"").length() == 11)
		{
			System.out.println("Correct account number..");
		}
		else
		{
			System.out.println("Something went wrong!! try again!!");
		}
	}
	void checkbalance()
	{
		System.out.println("Balance is : "+balance);
	}
	void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		long withdrawaccno;
		System.out.println("Enter Your Account number: ");
		dep_accno=sc.nextLong();
		if(acc_no==withdrawaccno_accno)
		{
			float amt;
			System.out.print("Enter balance for Deposit: ");
			amt=sc.nextFloat();	
			if(amt<balance)
			{
				balance=balance-amt;
			}
			else
			{
				System.out.println("You must keep minimum10000 amount in your Account! ");
			}
	}
	
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		long dep_accno;
		System.out.println("Enter Your Account number: ");
		dep_accno=sc.nextLong();
		if(acc_no==dep_accno)
		{
			float amt;
			System.out.print("Enter balance for Deposit: ");
			amt=sc.nextFloat();	
			if(amt>0)
			{
				balance=balance+amt;
			}
			else
			{
				System.out.println("Sorry, Amount is less than 0 so can not deposit!");
			}		
		}
		else
		{
			System.out.println("Can not find your Account");
		}
	}
	void search()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("1---------Search by Accountno.");
		System.out.println("2---------password");
		System.out.println("3---------Exit");
		int choice3;
		System.out.println("Enter Your Choice: ");
		choice3=sc.nextInt();
		switch(choice3)
		{
			case 1:
				System.out.println("Enter your Bank Account Number: ");
				baccno=sc.nextLong();
				if(searchbyAccountno(baccno) == 1)
				{
					System.out.println("Yes, This Account is Exists...");
				}
				else
				{
					System.out.println("Sorry! This Account does not Exist!");
				}
				break;
			case 2:
				System.out.println("Enter Your Bank Account Password: ");
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Please Enter Valid Choice!!");
		}
	}
	void display()
	{
		System.out.println("Name: "+name);	
		System.out.println("Account Number is: "+acc_no);
		System.out.println("Account type is: "+acc_type);
		System.out.println(" Your current time balance is: "+balance);
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		String pass,user;
		int ch1,ch2,ch3;
		bank b=new bank();
		while(true)
		{
		System.out.println("1------Admin");
		System.out.println("2------Customer");
		System.out.println("3------Exit");
		System.out.println("are You Admin or Customer?");
		ch1=sc.nextInt();
		switch(ch1)
		{
			case 1:
				System.out.println("Enter Username: ");
				user=sc.next();	
				System.out.println("Enter Your Password: ");
				pass=sc.next();
				//if(user.equalsIgnoreCase(uname) && pass.equalsIgnoreCase(pwd))
				if(b.Adminlogin(user,pass)==1)
				{
					System.out.println("You are Successfully Login!");
						System.out.println("1-----Create Account");
						System.out.println("2-----Get Details Of all BankCutomers");
						System.out.println("3-----Get Details of particular Customer");
						System.out.println("4-----Search Account");
						System.out.println("5-----Exit");
						System.out.println("what operation you want to do in Bank Account?:");
						ch2=sc.nextInt();
						switch(ch2)
						{
							case 1:
								b.createAccount();
								break;
							case 2: 
								b.display();
								break;
							case 3:
								b.search();
								break;
							case 4:
								System.exit(0);
							default:
								System.out.println("You Entered Invalid Choice! please enter valid Choice");
						}//end switch							
				}//end if	
				else
				{
					System.out.println("please Enter Valid Password for Login");
				}
				break;
			case 2:
				System.out.println("1------Deposit");
				System.out.println("2------withdrawl");
				System.out.println("3------checkbalance");
				System.out.println("4------Transfer");
				System.out.println("5------Exit");	
				System.out.println("What Operation you want to perform in your Bank Account? :");
				ch3=sc.nextInt();
				switch(ch3)
				{
					case 1:
						b.deposit();
						break;
					case 2:
						b.withdrawl();
						break;
					case 3:
						b.checkbalance();
						break;
					case 4:
						b.transfer();
						break;
					case 5:
						System.exit(0);
					default:
						System.out.println("You entered Invalid Choice!");
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice!");
			}//end switch
		}//end switch
	}//end while
	}//end of main
}//end of class

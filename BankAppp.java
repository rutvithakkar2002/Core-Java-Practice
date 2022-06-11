import java.util.Scanner;
public class BankAppp
{
	static float balance=10000;
	int ac_no;
	String uName,password;
	boolean found=false;
	Scanner sc=new Scanner(System.in);
	String uName,password;
	BankAppp()
	{
		uName="rutvi";
		password="rutvi";
	}
	int login(String user,String pass)
	{
		if(user.equals(uName) && pass.equals(password))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	void getdata()
	{
		System.out.print("Enter UserName: ");
		uName=sc.next();
		System.out.print("Enter Password: ");
		password=sc.next();
		System.out.print("Enter Account no: ");
		ac_no=sc.nextInt();
				
	}
	boolean search(String user,String AC)
	{
		if(user.equals(name) && AC.equals(ac_no))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/*void Transfer()
	{
		String user,AC;
		boolean found=false;		
		System.out.print("Enter Account no. : ");  
           		AC = sc.next(); 
		System.out.print("Enter Name: ");  
                        	user = sc.next();
		for(int i=0;i<b.length;i++)
		{
			found=b[i].search(user,AC);  
                       	 	if (found)
	 		{  
                                			b[i].deposit();   
			}
		}
			
	}*/
	void withdraw()
	{
		float amt;
		System.out.print("Enter balance for withdraw: ");
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
	void Adminlogin()
	{
		
	}
	void display()
	{
		System.out.println("Name: "+name);	
		System.out.println("Account Number is: "+ac_no);
		System.out.println(" Your current time balance is: "+balance);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Adminchoice,i;
		BankAppp b[]=new BankAppp[2];
		boolean found=false;  
		String user,AC;
		while(true)
		{
			System.out.println("1.Login as Customer!");
			System.out.println("2.Login as Admin");
	
			System.out.println("Enter Your Choice: ");
			Adminchoice=sc.nextInt();
			Switch(Adminchoice)
			{
				case 1:
			 		System.out.println("Enter Your user name and password: ");
					String user=scr.next();
					String pass=scr.next();
					if(b.login(user, pass)==1)
					{
						System.out.println("Your login is succesful");
					}
					break;
			}
			
			System.out.println("1) For Creating Account");
			System.out.println("2) For Deposit Amount");
			System.out.println("3) For WithdrawAmount");
			System.out.println("4) For Transfer amount");
			System.out.println("5) For Current Balance Details");
			System.out.println("6)Exit");
		}
		/*while(true)
		{
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					for(i=0;i<b.length;i++)
					{
						b[i]=new BankAppp();
						b[i].getdata();
					}
					break;
				case 2:			
					System.out.print("Enter Account no: ");  
                        				AC = sc.next(); 
					System.out.print("Enter Name: ");  
                        				user = sc.next(); 
					for(i=0;i<b.length;i++)
					{
						found=b[i].search(user,AC);  
                           			 		if (found)
				 		{  
                                						b[i].deposit(); 
							break;  
						}
						if(!found)
						{
							System.out.println("Searched Failed Account not Exist!");
						}
					}
					break;
					
				case 3:
					System.out.print("Enter Account no. : ");  
                        				AC = sc.next(); 
					System.out.print("Enter Name: ");  
                        				user = sc.next();
					for(i=0;i<b.length;i++)
					{
						found=b[i].search(user,AC);
						if(found)
						{
							b[i].withdraw();
							break;					
						}
						if(!found)
						{
							System.out.println("Searched Failed Account not Exist!");
						}
					}	
					break;
				case 4:
					for(i=0;i<b.length;i++)
					{
						b[i].display();
					}
					break;	
				case 6:
					System.exit(0);
				default:
					System.out.println("You are given Invalid choice!");
			}		
		}*/
	}	
}
//Scope of the variable -- life -->  visiblity

/*
	instance
	local --> { block , stack } memory --> stack | heap  
	static
*/
//pure --> encapsulation --> pure oop --> class  

import java.util.Scanner;
class MyCalc
{
	int a,b,ans;   //instance variable   5000 objects------->It generates 5000 copies of each class instance variable...
	static int bankcode=1000;	//single copy of an entire class...
	void input()
	{
		Scanner scr=new Scanner(System.in);    // scr is a local..
		System.out.println("Enter two numbers: ");
		a=scr.nextInt();
		b=scr.nextInt();
	}
	void add()
	{
		ans=a+b;
		System.out.println("Addition is: "+ans);
		System.out.println(a+"+"+b+"="+ans);
	}
	void sub()
	{
		ans=a-b;
		System.out.println("Subtraction is: "+ans);
		System.out.println(a+"-"+b+"="+ans);
	}
	void mul()
	{
		ans=a*b;
		System.out.println("multiplication is: "+ans);
		System.out.println(a+"*"+b+"="+ans);
	}
	void div()
	{
		ans=a/b;
		System.out.println("Division is: "+ans);
		System.out.println(a+"/"+b+"="+ans);
	}
	void mod()
	{
		ans=a%b;
		System.out.println("Addition is: "+ans);
		System.out.println(a+"%"+b+"="+ans);
	}
	public static void main(String args[])
	{
		int choice;  //local variable--->bloack or stack variable.....
		MyCalc obj=new MyCalc();
		obj.bankcode=5000;
		System.out.println("bankcode is: "+bankcode);
		
		Scanner scr=new Scanner(System.in);
		while(true)
		{
			obj.input();
			System.out.println("1. For addition \n 2. For Subtraction \n 3. For Multiplication \n 4. For Division \n 5. For Modulo \n 6. Exit");
			System.out.println("Enter Your Choice: ");
			choice=scr.nextInt();
			switch(choice)
			{
				case 1:
					obj.add();
					break;
				case 2: 
					obj.sub();
					break;
				case 2+1:
					obj.mul();
					break;
				case 4:
					obj.div();
					break;
				case 5:
					obj.mod();
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("Invalid Choice!!");

			}//end of switch statement
		}//end of while statement	
	}//end of main
}//end of class
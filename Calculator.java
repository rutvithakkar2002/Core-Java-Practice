import java.util.Scanner;
public class Calculator
{
	int a,b,c,sqa,sqb,ca,cb;
	void input()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		a=scr.nextInt();
		b=scr.nextInt();
	}
	void add()
	{
		c=a+b;
		System.out.println("Addition is: "+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction is: "+c);
	}
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication is: "+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("Division is: "+c);
	}
	void mod()
	{
		c=a%b;
		System.out.println("Modulo is: "+c);
	}
	void sr()
	{
		sqa=a*a;
		sqb=b*b;
		System.out.println("Square of a is: "+sqa);
		System.out.println("Square of b is: "+sqb);
	}
	void power()
	{
		ca=a*a*a;
		cb=b*b*b;
	}
	void srt()
	{
		System.out.println("Square root of a is "+Math.sqrt(a));
		System.out.println("square root of b is "+Math.sqrt(b));
	}

	public static void main(String args[])
	{
		int choice;
		Scanner scr=new Scanner(System.in);
		Calculator obj1=new Calculator();
		obj1.input();
		while(true)
		{
			System.out.println("1---------Addition");
			System.out.println("2---------Subtraction");
			System.out.println("3---------Multiplication");
			System.out.println("4---------Division");
			System.out.println("5---------Modulo");
			System.out.println("6---------Square-root");
			System.out.println("7---------power of numbers");
			System.out.println("8---------Square root of the given numbers");
			System.out.println("9---------Exit");
			System.out.println("Enter Your Choice: ");
			choice=scr.nextInt();
			switch(choice)
			{
				case 1:
					obj1.add();
					break;
				case 2:
					obj1.sub();
					break;		
				case 3:
					obj1.mul();
					break;
				case 4:
					obj1.div();
					break;
				case 5:
					obj1.mod();
					break;
				case 6:
					obj1.sr();
					break;
				case 7:
					obj1.power();
					break;
				case 8:
					obj1.srt();
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("Invalid choice!!!");
			}//endof Switch
		}//end of while
	}//end of main
}//end of class
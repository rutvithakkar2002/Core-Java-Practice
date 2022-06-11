import java.util.Scanner
class YoungerAgeExc extends RuntimeException
{
	YoungerAgeExc(String m)
	{
		super(m);
	}
}
class Vote
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");		
		int age=sc.nextInt();
		if(age<18)
		{
			throw new YoungerAgeExc("You are not Eligible!!!");	
		}
		else
		{
			System.out.println("You are eligible!");
		}
		System.out.println("Last Line!");
	}
}
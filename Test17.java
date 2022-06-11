public class Test17
{
	public static void main(String args[])
	{
		int no1,no2,no3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number: ");
		no1=sc.nextInt();
		System.out.println("Enter Second number: ");
		no2=sc.nextInt();
		System.out.println("Enter third number: ");
		no3=sc.nextInt();
		if((no1==no2)&&(no2==no3)&&(no3==no4))
		{
			System.out.println("All numbers are Same");
		}
		else if((no1==no2)&&(no1<no2)&&(no1<no3))
		{
			System.out.println(no1 is minimum);
		}
		else if((no2==no3)&&(no2<no1)&&(no2<no3))
		{
			System.out.println("no2 is minimum");
		}
		elseif((no3==no1)&&(no3<no1)&&(no3<no2))
		{
			System.out.println("no3 is minimum");
		}
		else
		{
			pass;
		}
	}
	
}
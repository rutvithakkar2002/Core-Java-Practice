public class Runtimeargu2
{
	public static void main(String args[])
	{
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
		int ans=0;
		switch(args[2])
		{
			case "+":
				ans=no1+no2;
				break;
			case "-":	
				ans=no1-no2;
				break;	
			case "*":
				ans=no1*no2;
				break;
			case "/":
				ans=no1/no2;
				break;
			default:
				System.out.println("Invalid choice \n please enter between (+,-,/,*)");
				break;
		}	
		System.out.println("Answer is: "+ans);
	}
}
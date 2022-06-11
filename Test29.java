import java.util.Scanner;
public class Test29
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=3;
		switch(number)
		{
			case 0:
		 		System.out.println("number is 0: ");
				break;
			case 1:
				System.out.println("number is 1: ");
				break;
			case 2:
			//case 3:
			case 3:
				System.out.println("number is 2,3 or 4: ");
				break;
			default:
				System.out.println("number is less than 0 or greater than 4 ");
		}	
	}
}
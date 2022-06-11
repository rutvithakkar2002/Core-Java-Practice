import java.util.Scanner;
public class Student2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in mathematics: ");
		float math=sc.nextFloat();
		System.out.println("Enter marks in physics: ");
		float ph=sc.nextFloat();
		System.out.println("Enter marks in chemestry: ");
		float ch=sc.nextFloat();
		
		if(math>=60)
		{
			if(ph>=50)
			{
				if(ch>=40)
				{
					if(((math+ph+ch)>=200)||((math+ph)>=150))
					{
						System.out.println("Candidate is eligible..");
					}
				}
			}
		}
		else
		{
			System.out.println("candidate is not eligible!!");
		}
	}	
}



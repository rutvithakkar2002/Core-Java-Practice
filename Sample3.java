import java.util.Scanner;
public class Sample3
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. panjabi");
			System.out.println("2. Gujarati");
			System.out.println("3. Bangadi");
			System.out.println("4. Rajasthani");
			System.out.println("5. Fastfood");
			System.out.println("6. non-vegiterian food");
			System.out.println("7. South-Indian");
			System.out.println("8. Bengoli food");
			System.out.println("9. Deseart");
			System.out.println("10. Exit");
			System.out.println("Enter Your Choice: ");
			int ch;
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("You have selected Panjabi food..");
					break;
				case 2:
					System.out.println("You have selected Gujarati food..");
					break;
				case 3: 
					System.out.println("You have selected Bangadi food.. ");
					break;
				case 4:		
					System.out.println("You have selected Rajasthani food..");
					break;
				case 5:		
					System.out.println("You have selected Fast food..");
					break;
				case 6:		
					System.out.println("You have selected Non-vegeterian food..");
					break;
				case 7:		
					System.out.println("You have selected South-Indian food..");
					break;
				case 8:		
					System.out.println("You have selected Bengoli food..");
					break;
				case 9:		
					System.out.println("You have selected Deseart food..");
					break;
				case 10:
					System.exit(0);	
			}//end of switch
		}//end of while
	}
}
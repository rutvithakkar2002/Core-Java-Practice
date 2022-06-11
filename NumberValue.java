 class NumberValue
{
	public static void main(String args[])
	{
		int number=3;
		switch(number)
		{
			case 0:
				System.out.println("The number is 0.");
				break;
			case 1:
				System.out.println("The number is 1.");
				break;
			case 2:
			case 3:
				System.out.println("The number is 2,3 or 4.");
				break;
			default:
				System.out.println("Number is less than 0 or greater than 4");
		}			
	}
}





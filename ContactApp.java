public class ContactApp
{	
	String name,city;
	int no;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.next();
		System.out.println("Enter Your Contact no: ");
		no=sc.nextInt();
		if(no>10 && no<10)
		{
			System.out.println("Invalid no! pls try again!");
		}
		System.out.println("Enter City name: ");
		city=sc.next();	
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Contact No: "+no);
		System.out.println("City name: "+city);
	}
	public static void main(String args[])
	{
		ContactApp c=new ContactApp();	
		c.getdata();
		c.display();
						
	}
}
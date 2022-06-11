import java.util.Scanner;
class Stringpailindrom3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int i,j;
		boolean flag=true;
		System.out.println("Enter Your name: ");
		name=sc.nextLine();
		System.out.println("Length of your name is: "+name.length());
		for(i=0,j=(name.length()-1);i<name.length();i++,j--)
		{
			if(name.charAt(i)!=name.charAt(j))
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(name+" is Pail-in-drom");
		}
		else
		{
			System.out.println(name+" is not Pail-in-drom");
		}
	}
}
import java.util.Scanner;
class Student
{
	String name;
	int maths,sci,eng;
	float total,perc;
	char grade;
	
	void getdata()
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter name and marks of 3 subjects: ");
		name=scr.next();//scan a string single word no space
		maths=scr.nextInt();
		sci=scr.nextInt();
		eng=scr.nextInt();
	}
	void calculateResult()
	{
		total=maths+sci+eng;
		perc=(total)/3.0f;  //need to add "f" or "F" to indecate float value...
		if(perc>90)
		{
			grade='A';
		}
		else if(perc>80)
		{
			grade='B';
		}
		else if(perc>=35)
		{
			grade='C';
		}
		else
		{
			grade='R';  //Reattempt
		}
	}
	void printdata()
	{
		System.out.println("Name: "+name);	
		System.out.println("Maths: "+maths);	
		System.out.println("Science: "+sci);	
		System.out.println("English: "+eng);	
		System.out.println("Total: "+total);	
		System.out.println("Percentage: "+perc);	
		System.out.println("Grade: "+grade);	
	}
	public static void main(String args[])
	{
		Student rutvi=new Student();
		rutvi.getdata();
		rutvi.calculateResult();
		rutvi.printdata();			
	}
}
//Connected with Static1.java program.
public class Static12 
{
	public static void main(String[] args) 
	{
		Static1.setSchoolName("royal");
		Static1 s1 = new Static1(1, "rahul", 12);
		Static1 s2 = new Static1(2, "kunal", 12);
		Static1 s3 = new Static1(3, "jaypal", 12);
		Static1 s4 = new Static1(4, "sagar", 12);
		Static1 s5 = new Static1(5, "rakesh", 12);
		
		
		System.out.println(s1.getRno() + " " + s1.getName()+ " " + s1.getStd() + " " + Static1.getSchoolName());
		System.out.println(s2.getRno() + " " + s2.getName()+ " " + s2.getStd() + " " + Static1.getSchoolName());
		System.out.println(s3.getRno() + " " + s3.getName()+ " " + s3.getStd() + " " + Static1.getSchoolName());
		System.out.println(s4.getRno() + " " + s4.getName()+ " " + s4.getStd() + " " + Static1.getSchoolName());
		System.out.println(s5.getRno() + " " + s5.getName()+ " " + s5.getStd() + " " + Static1.getSchoolName());
		
		s1.setStd(10);
		System.out.println("After SchoolName : ");
		System.out.println(s1.getRno() + " " + s1.getName()+ " " + s1.getStd() + " " + Static1.getSchoolName());
		System.out.println(s2.getRno() + " " + s2.getName()+ " " + s2.getStd() + " " + Static1.getSchoolName());
		System.out.println(s3.getRno() + " " + s3.getName()+ " " + s3.getStd() + " " + Static1.getSchoolName());
		System.out.println(s4.getRno() + " " + s4.getName()+ " " + s4.getStd() + " " + Static1.getSchoolName());
		System.out.println(s5.getRno() + " " + s5.getName()+ " " + s5.getStd() + " " + Static1.getSchoolName());
		
	}
}
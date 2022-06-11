//connected with static12.java
public class Static1
{
	private int rno;
	private String name;
	private int std;
	private static String schoolName;
	public Static1() 
	{
		
	}
	public Static1(int rno, String name, int std) 
	{
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public static void setSchoolName(String schoolName) 
	{
		Static1.schoolName = schoolName;
	}
	public static String getSchoolName() 
		{
		return schoolName;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) 
	{
		schoolName="DPS";
		this.std = std;
	}
}
public class StringMethod2
{
	public static void main(String args[])
	{
		String x = "jony jony yes papa";
		String y = "1,2,3,4,5,6,7,8";

		String xx[] = x.split(" ");
		String yy[] = y.split(",");
		System.out.println("split - x ");
		for (int i = 0; i < 4; i++)
		 {
			System.out.println(xx[i]);
		}
		System.out.println("\nsplit - y ");
		for (int i = 0; i < yy.length; i++) 
		{
			System.out.println(yy[i]);
		}
	}
}
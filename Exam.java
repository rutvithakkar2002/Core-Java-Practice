import java.util.Scanner;
public class Sand
{
	public Sand()
	{
		System.out.println("a");
	}
	public void Sand()
	{
		System.out.println("b");
	}
	public void run()
	{
		new Sand();
		Sand();
	}
	public static void main(String args[])
	{
		new Sand().run();	
	}
}
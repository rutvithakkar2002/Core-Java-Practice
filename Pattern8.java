import java.util.Scanner;
public class Pattern8
{
	public static void main(String args[])
	{
		int[] array={32,87,3,589,12,1076,2000,8,622,127};
		int searchval=12;
		int i=0;
		boolean found=false;
		for(;i<array.length;i++)
		{
			if(array[i]==searchval)
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println("Found "+searchval+" at index "+i);
		}
		else
		{
			System.out.println(searchval+" not in the array");
		}
	}
}
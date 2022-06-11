/*For RoyalBank we need create two method for securing banking.
1) encode 
2) decode 

encode method will help to user for encoding data.   tejas ==>  rwtkjrhsdkf  => tejas
and decode method will help to user for decode data. 

e.g
	expected output:-
	Input String for encode data ?
	1)royaleducation  [ r=>sf o=>ps y=>zf ] roy => sfpszf 
	2)tejas

	encoded string :- 1)scpvzbbdmffgeyvudubiudjtnupo
			  2)ugfhkdbvt 

	Input String for decode data ?
	scpvzbbdmffgeyvudubiudjtnupo
	ugfhkdbvt  | 	ugfgkgbgt


	decoded String :- royaleducation 
	decode  String :- tejas*/



import java.util.Random;
import java.util.Scanner;
public class RoyalBank
{
	
	//StringBuffer sb = new StringBuffer("royaledu");
	String sb="royaledu";
	int i;
	void encode()
	{
		Random rand = new Random();
	//	StringBuffer sb = new StringBuffer("royaledu");
		//String sb="royaledu";
		System.out.println(sb);
		for(i=0;i<sb.length();i++)
		{
			System.out.println((char)(sb.charAt(i)+1));	
		}
				
	}
	/*void decode()
	{
		System.out.println((char)(sb.charAt(i)-1));	
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		RoyalBank b1=new RoyalBank();
		Random rand = new Random();
		System.out.println("1-----------------------Encoding");
		System.out.println("2-----------------------Decoding");
		System.out.println("3-----------------------Exit");
		System.out.println("Enter Your Choice: ");
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				b1.encode();
				break;
			/*case 2:
				b1.decode();
				break;*/
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice!!!!");
		}
	}
}

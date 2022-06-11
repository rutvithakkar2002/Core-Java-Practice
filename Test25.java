public class Test25
{
	public static void main(String args[])
	{
		switch(ch)
		{
			case:'M':
				if(cost>=101 && cost<=200)
				{
					rate:5.0;	
				}
				else if(cost>=201 && cost<=300)
				{
					rate:7.5;
				}
				else if(cost>=400)
				{
					rate:10.0;
				}
				break;
			case:'H':
				if(cost>=0 && cost<=100)
				{
					rate:5.0;
				}
				else if(cost>=101 && cost<=200)
				{
					rate:7.5;	
				}
				else if(cost>=201 && cost<=300)
				{
					rate:10.0;
				}
				else if(cost>=400)
				{
					rate:15.0;
				}
				break;
		}
	}
}
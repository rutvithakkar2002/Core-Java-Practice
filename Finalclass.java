final class Bike
{
	void print()
	{
		System.out.println("This is final class");
	}	

}  
  
class Finalclass extends Bike   //final class can not have childclass inherited 
{  
	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
    
  	public static void main(String args[])
	{  
  		Finalclass honda= new Finalclass();  
  		honda.run();  
  	}  
}  
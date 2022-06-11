class car	
{  
  	final void run()
	{
		System.out.println("running");
	}  
}  
     
class Hondafinal extends car
{  
   	void run()	
	{
		System.out.println("running safely with 100kmph");
	}  
     
   	public static void main(String args[])
	{  
  		 Hondafinal honda= new Hondafinal();  
  		 honda.run();  
  	 }  
}  

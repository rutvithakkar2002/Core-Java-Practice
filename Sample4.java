import java.util.Scanner;
public class Railway
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		int price;
		int tik;
		price=250;
		System.out.println("1. Rajdhani Express(12342)----------->New Delhi to Ahmedabad");
		System.out.println("2. Rajdhani Express(12342)----------->Ahmedabad to New Delhi");
		System.out.println("3. Rajdhani Express(12342)----------->Mumbai to New Delhi");
		System.out.println("4. Rajdhani Express(12342)----------->New delhi to Mumbai");
		System.out.println("5. Rajdhani Express(12342)----------->Ahmedabad to Mumbai");
		System.out.println("6. Rajdhani Express(12342)----------->Zarkhand to Mumbai");
		System.out.println("7. Rajdhani Express(12342)----------->Mumbai to Zarkhand");
		System.out.println("8. Rajdhani Express(12342)----------->Delhi to Jammu-kashmir");
		System.out.println("9. Rajdhani Express(12342)----------->Jammu-kashmir to Delhi");
		System.out.println("10. Rajdhani Express(12342)----------->Zarkhand to new Delhi");
		System.out.println("11. Rajdhani Express(12342)----------->Mumbai to Indore");
		System.out.println("12. Shatabdi Express(13454)----------->Indore to Mumbai");
		System.out.println("13. Rajdhani Express(12342)----------->Chennai to Ahmedabad");
		System.out.println("14. Shatabdi Express(13454)----------->Chennai to Surat");
		System.out.println("15. Shatabdi Express(13454)----------->Ahmedabad to Chennai");
		System.out.println("16. Shatabdi Express(13454)----------->Surat to Chennai");
		System.out.println("17. Shatabdi Express(13454)----------->Ahmedabad to Katch");
		System.out.println("18. Rajdhani Express(12342)----------->Katch to Ahmedabad");
		System.out.println("19. Rajdhani Express(12342)----------->Gandhinagar to Ahmedabad");
		System.out.println("20. Rajdhani Express(12342)----------->Ahmedabad to Gandhinagar");
		System.out.println("21. Rajdhani Express(12342)----------->Kolkata to patna");
		System.out.println("22. Rajdhani Express(12342)----------->Kolkata to surat");
		System.out.println("23. Rajdhani Express(12342)----------->patna to kolkata");
		System.out.println("24. Rajdhani Express(12342)----------->Ahmedabad to Rajasthan");
		System.out.println("25. Rajdhani Express(12342)----------->Rajasthan to Ahmedabad");
		System.out.println("26. Exit");
		System.out.println("Dear Customer,Which train do you want to selected?");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:       	
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected New delhi to Ahmedabad Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
						
					}
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 2:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to new delhi Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
						
					}
					System.out.println("How many Tickets do you want?");
					tik=sc.nextInt();
					System.out.println("You have booked"+" "+tik+" "+"Tikets");
					price=price*tik;
					System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 3:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Mumbai to New Delhi Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 4:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected New delhi to Mumbai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 5:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to Mumbai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
			
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;	
			case 6:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected zarkhand to Mumbai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 7:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Mumbai to Zarkhand Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
			
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 8:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Delhi to Jammu-Kashmir Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 9:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected JAmmu-Kashmir to Delhi Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 10:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Zar-khand to New delhi Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
			
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 11:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Mumbai to Indore Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 12:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Indore to Mumbai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
			
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");		
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 13:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Chennai to Ahmedabad Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 14:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Chennai to Surat Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 15:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to Chennai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 16:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Surat to Chennai Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 17:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to Katch Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 18:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Katch to Ahmedabad Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;	
			case 19:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Gandhinagar to Ahmedabad Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 20:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to Gandhinagar Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 21:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Kolkata to Patna Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 22:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Kolkata to Surat Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 23:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Patna to Kolkata Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 24:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Ahmedabad to Rajasthan Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
			case 25:
				System.out.println("-----------Berth------------");
				System.out.println("1. 1A---Ac First class");
				System.out.println("2. 2A---Ac 2-tier");
				System.out.println("3. 3A---Ac 3-tire");
				System.out.println("4. 4A---Sleeper");
				System.out.println("5. 5A---Second Sitting");
				System.out.println("6. Exit");
				System.out.println("You have selected Rajasthan to Ahmedabad Train. ");
				System.out.println("Enter your choice:");
				ch=sc.nextInt();
					switch(ch)
					{
						case 1: 
							System.out.println("You have selected AC First Class.");
							break;
						case 2: 
							System.out.println("You have selected AC 2-tier.");
							break;
						case 3: 
							System.out.println("You have selected AC 3-tier.");
							break;
						case 4: 
							System.out.println("You have selected Sleeper.");
							break;
						case 5: 
							System.out.println("You have selected Second Sitting.");
							break;
						default:
							System.out.println("Invalid choice!!");
							break;
					}
				
				System.out.println("How many Tickets do you want?");
				tik=sc.nextInt();
				System.out.println("You have booked"+" "+tik+" "+"Tikets");
				price=price*tik;
				System.out.println("You have to pay"+" "+price+" "+"RS/-.");
				break;
				
			default:
				System.out.println("Invalid choice!");
				break;					
			}
	}
					
}
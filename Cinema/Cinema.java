/*
Question 1
Name : Putera Naqib Khusairi Bin Asri
Registration No : 10DDT21F1021
*/
import java.time.LocalDate;																//import the LocalDate class
import java.util.*;																		//import scanner class
class Cinema																			//class name 
{
	public void display()
	{
		Scanner MovieScan = new Scanner(System.in);										//Use scnanner class
		System.out.println("\n--------------- Cinema Online ---------------\n");		//Print
		LocalDate tarikh = LocalDate.now();												//Create a date object
		System.out.println("\t"+tarikh);												//Display the curremt date
		System.out.println("\tTicket Pricing");											//Print
		System.out.println("\n---------------------------------------------");			//Print
		String table [][]=	{															//2D array table 
								{"1","Mechamato Movie\t","RM14"},						//aray [0][1],[2][2],[0][3]
								{"2","Lyle,Lyle,Crocodile","RM12"}						//aray [1][1],[1][2],[1][3]
							};
		for(int row=0; row<table.length;row++)											//for loop to count row for array table
		{
			for(int col=0;col<table[row].length; col++)									//for loop to count column for array table
			{
				System.out.print(table[row][col]+"\t");									//print
			}
			System.out.println("");														//print
		}
		System.out.println("\n---------------------------------------------");			//print
		String s="" , phoneNo = "" , movieName="";										//variable s , phoneNo , movieName
		System.out.print("\n\tName :  ");												//print
		s=MovieScan.nextLine();															//get input s from user
		//Construct program to capitalize all the characters in name
		String name = s.toUpperCase();													//change s to uppercase
		System.out.print("\tPhone Number :  ");											//print
		phoneNo=MovieScan.nextLine();													//get input phoneNo from user
		int ticket = 0,price = 0,totalPrice = 0 , movieNo=0;							//variable ticket,price,totalPrice,movieNo
		System.out.print("\tChoose Movie [1 or 2] = ");									//print
		movieNo=MovieScan.nextInt();													//get input movieNo from user
		if(movieNo==1||movieNo==2)														//if user put movieNo = 1 or 2
		{
			System.out.print("\tHow Many Ticket You Want To Buy? = ");					//print
			ticket=MovieScan.nextInt();													//get input ticket from user
			if(movieNo==1)																//if user put movieNo = 1 
			{
				movieName=table[0][1];													//movieName = item in array for [0][1]
				price=14;																//price = 14
			}
			else if (movieNo==2)														//if user put movieNo = 2
			{
				movieName=table[1][1];													//movieName = item in array for [1][1]
				price=12;																//price = 12
			}
				System.out.println("\n------------------ RECIEPT ------------------\n");//print
				System.out.println("\tYour Booking Details");							//print
				System.out.println("\tName : "+name);									//print
				System.out.println("\tPhone No : "+phoneNo);							//print
				System.out.println("\tMovie : "+movieName);								//print
				System.out.println("\tPrice : RM "+price);								//print
				System.out.println("\tTicket : "+ticket);								//print
				totalPrice=price*ticket;												//formula for count totalPrice
				System.out.println("\tTotal Price : RM "+totalPrice);					//print
				System.out.println("\n---------------------------------------------");	//print
		}
		else																			//if uset put movieName not equal to 1 or 2
		{
			System.out.println("\n---------------------------------------------\n");	//print
			System.out.println("     You just need to fill either 1 or 2 !!!");			//print
			System.out.println("\n---------------------------------------------");		//print
		}
	}
	public static void main(String args[])												//main method
	{
		Cinema test = new Cinema();														//create object
		test.display();																	//calling method
	}
}
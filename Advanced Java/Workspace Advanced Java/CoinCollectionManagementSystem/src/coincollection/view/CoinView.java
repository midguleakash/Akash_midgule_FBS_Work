package coincollection.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import coincollection.model.Coin;
import coincollection.service.CoinService;

public class CoinView {
	public static void showCoinView() {
		Scanner sc =  new Scanner(System.in);
		int choice ;	
		
		CoinService coinService = new CoinService();
		
		do {

		    System.out.println("\n===== COIN COLLECTION MANAGEMENT =====");

		    System.out.println("1. Add New Coin");
		    System.out.println("2. Bulk Upload Coins");
		    System.out.println("3. View All Coins");
		    System.out.println("4. List Coins by Country");
		    System.out.println("5. List Coins by Year of Minting");
		    System.out.println("6. List Coins by Current Value");
		    System.out.println("7. Search by Country + Denomination");
		    System.out.println("8. Search by Country + Year");
		    System.out.println("9. Search by Country + Denomination + Year");
		    System.out.println("10. Search by Acquired Date + Country");		   
		    System.out.println("11. Count Coins");
		    System.out.println("12. Exit");

		    System.out.print("Enter choice: ");
		    choice = sc.nextInt();

		    switch (choice) {

		        case 1:
		            // Add New Coin
		        {
		        	sc.nextLine(); 
		        	System.out.print("Enter country: ");
		            String country = sc.nextLine();

		            
		            System.out.print("Enter denomination: ");
		            String denomination = sc.nextLine();

		            System.out.print("Enter minting year: ");
		            int year = sc.nextInt();

		            System.out.print("Enter current value: ");
		            double currentValue = sc.nextDouble();
		            sc.nextLine();

		            System.out.print("Enter acquired date (yyyy-MM-dd): ");
		            LocalDate acquiredDate =
		                    LocalDate.parse(sc.nextLine());

		            Coin coin = new Coin(
		                    country,
		                    denomination,
		                    year,
		                    currentValue,
		                    acquiredDate
		            );

		            boolean status = coinService.addCoin(coin);

		            if (status) {
		                System.out.println("Coin added successfully!");
		            } else {
		                System.out.println("Failed to add coin.");
		            }
		        	break;
		        }
		            

		        case 2:
		            // Bulk Upload Coins
		        	System.out.println("This feature not working");
		            break;

		        case 3:
		            // View All Coins
		        {
		        	 ArrayList<Coin> coinList = coinService.getAllCoin();
		        	 coinList = coinService.getAllCoin();
		        	 
		        	 if(coinList.size() > 0) {
		        		 for(Coin c : coinList) {
			        		 System.out.println(c);
			        	 } 
		        	 }else {
		        		 System.out.println("No coin in database");
		        	 }
		        	 
		        	 break;
		        }
		            

		        case 4:
		            // List Coins by Country
		        {
		        	sc.nextLine();
		        	String country;
		        	System.out.println("Enter Country Name : ");
		        	country = sc.nextLine();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.getCoinsByCountry(country);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this Country");
				        	 }
				        	 
				        	 break;
		        }
		        	

		        case 5:
		            // List Coins by Year of Minting
		        {
		        	
		        	int year;
		        	System.out.println("Enter year of minting: ");
		        	year = sc.nextInt();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.getCoinsByYear(year);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this year");
				        	 }
				        	 
				        	 break;
		        }

		        case 6:
		            // List Coins by Current Value
{
		        	
					double currentValue;
		        	System.out.println("Enter current Value : ");
		        	currentValue = sc.nextInt();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.getCoinsByCurrentValue(currentValue);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this current Value");
				        	 }
				        	 
				        	 break;
		        }

		        case 7:
		            // Search by Country + Denomination
		        {
		        	sc.nextLine();
		        	String country;
		        	System.out.println("Enter Country Name : ");
		        	country = sc.nextLine();
		        	
		        	
		        	String denomination;
		        	System.out.println("Enter denomination face value : ");
		        	denomination = sc.nextLine();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.searchByCountryAndDenomination(country, denomination);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this Country and denomination");
				        	 }
				        	 
				        	 break;
		        }

		        case 8:
		            // Search by Country + Year
		        {
		        	sc.nextLine();
		        	String country;
		        	System.out.println("Enter Country Name : ");
		        	country = sc.nextLine();
		        	
		        	
		        	int year;
		        	System.out.println("Enter year of minting: ");
		        	year = sc.nextInt();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.searchByCountryAndYear(country, year);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this Country and year");
				        	 }
				        	 
				        	 break;
		        }

		        case 9:
		            // Search by Country + Denomination + Year
		        {
		        	sc.nextLine();
		        	String country;
		        	System.out.println("Enter Country Name : ");
		        	country = sc.nextLine();
		        	
		        	
		        	String denomination;
		        	System.out.println("Enter denomination face value : ");
		        	denomination = sc.nextLine();
		        	
		        	int year;
		        	System.out.println("Enter year of minting: ");
		        	year = sc.nextInt();
		        	
		        	ArrayList<Coin> coinCountryList = coinService.searchByCountryDenominationAndYear(country, denomination, year);
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for this Country and denomination and year");
				        	 }
				        	 
				        	 break;
		        }

		        case 10:
		            // Search by Acquired Date + Country
		        	
		        {
		        	sc.nextLine();
		        	System.out.print("Enter acquired date (yyyy-MM-dd): ");
		            LocalDate acquiredDate =
		                    LocalDate.parse(sc.nextLine());
		            
		        	
		        	String country;
		        	System.out.println("Enter Country Name : ");
		        	country = sc.nextLine();		        	

		        	
		        	ArrayList<Coin> coinCountryList = coinService.searchByAcquiredDateAndCountry(acquiredDate,country );
		        	
		        			if(coinCountryList.size() > 0) {
				        		 for(Coin c : coinCountryList) {
					        		 System.out.println(c);
					        	 } 
				        	 }else {
				        		 System.out.println("No coin in database for acquired Date this Country");
				        	 }
				        	 
				        	 break;
		        }

		        

		        case 11:
		            // Count Coins
		        {
		        	int count  = coinService.getAllCoin().size();
		        	System.out.println("total coin in collection : " + count);
		        	break;
		        }
		        	
		            

		        case 12:
		            System.out.println("Exiting...");
		            break;

		        default:
		            System.out.println("Invalid choice");
		    }

		} while (choice != 12);
	}
}

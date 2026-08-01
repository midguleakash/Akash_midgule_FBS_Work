package ArrayList;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		System.out.print("Enter the size of list : ");
		int size = sc.nextInt();
		
		MyArrayList myList = new MyArrayList(size);
		
		
		do {
			System.out.println("\t1.Add");
			System.out.println("\t2.Insert at Index");
			System.out.println("\t3.Display");
			System.out.println("\t4.Get data");
			System.out.println("\t5.Search data");
			System.out.println("\t6.Update");
			System.out.println("\t7.Delete at Index");
			System.out.println("\t8.Exit");
			System.out.println("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				// add data
				case 1 : {
						int data ;
						System.out.print("Enter the number : ");
						data = sc.nextInt();
						myList.add(data);						
						break ;
				}
				
				// insert data at index
				case 2 : {
					int data, pIndex ;
					System.out.println("Enter index where you insert data : ");
					pIndex = sc.nextInt();
					System.out.println("Enter data for insert at index : ");
					data = sc.nextInt();					
					myList.insertAtIndex(pIndex, data);
					break ;
					
				}
				
				// display data
				case 3 : {
					myList.display();
					break ;
					
				}
				
				// get data using index
				case 4 : {
					int pIndex ;
					System.out.println("Enter index to find data : ");
					pIndex = sc.nextInt();
					System.out.println(myList.get(pIndex));
					break ;
					
				}
				
				//  search data using value
				case 5 : {
					int data ;
					System.out.println("Enter data to search : ");
					data = sc.nextInt();
					myList.search(data);
					break ;
					
				}
				
				// update data using index 
				case 6 : {
					int data, pIndex ;
					System.out.println("Enter data for update : ");
					data = sc.nextInt();
					System.out.println("Enter index where you update data : ");
					pIndex = sc.nextInt();
					myList.update(data, pIndex);
					break ;
				}
				
				
				// remove data using index
				case 7 : {
					int data, pIndex ;
					System.out.println("Enter index where you remove data : ");
					pIndex = sc.nextInt();
										
					myList.deleteAtIndex(pIndex);
					break ;
					
				}
				
				
				// end program
				case 8 : {
					System.out.println("Prgram terminatting......");
					break ;
				}
				
				default : {
					System.out.println("---- Invalid Choice! ----");
				}
			}
			
		} while(choice != 8);
		
		sc.close();
	}
	
	
	
}

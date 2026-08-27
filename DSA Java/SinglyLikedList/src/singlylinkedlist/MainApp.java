package singlylinkedlist;

import java.util.Scanner ;

public class MainApp {
	public static void main(String[] args) {
		MySinglyLinkedList myLL = new MySinglyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		int choice ;
		
		
		do {
			System.out.println("\n\t1.Add at start");
			System.out.println("\t2.Add at end");
			System.out.println("\t3.Add at index");			
			System.out.println("\t4.Delete at start");
			System.out.println("\t5.Delete at end");
			System.out.println("\t6.Delete at index from start");
			System.out.println("\t7.Display a list");
			System.out.println("\t8.Search data in a list");
			System.out.println("\t9.Print the Reverse of list");
			System.out.println("\t10.Make your list in reverse");
			System.out.println("\t11.Print lenth of list");
			System.out.println("\t12.Delete at index from end");
			System.out.println("\t13.Cheack Palindrome or not");
			System.out.println("\t15.Exit");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			
			switch(choice) {
				case 1 : {
					int data ;					
					System.out.print("Enter data : ");
					data = sc.nextInt();
					myLL.insertAtBeg(data);
					break ;
				}
				
				case 2 : {
					int data ;					
					System.out.print("Enter data : ");
					data = sc.nextInt();
					myLL.insertAtEnd(data);
					break ;
				}
				
				case 3 : {
					int index ;					
					System.out.print("Enter index : ");
					index = sc.nextInt();
					int data ;					
					System.out.print("Enter data : ");
					data = sc.nextInt();
					myLL.insertAtPosition(data, index);
					break ;
				}
				
				case 4 : {
					myLL.deleteAtBeg();
					break ;
				}
				
				case 5 : {
					myLL.deleteAtEnd();
					break ;
				}
				
				case 6 : {
					int index ;					
					System.out.print("Enter index : ");
					index = sc.nextInt();
					myLL.deleteAtPosition(index);
					break ;
				}
				
				case 7 : {
					myLL.display();
					break ;
				}
				
				case 8 : {
					int data ;					
					System.out.print("Enter data for search : ");
					data = sc.nextInt();
					if(myLL.search(data) == -1){
						System.out.println("data not found");	
						System.out.println("index of your data : " + -1);
					}
					else {
						System.out.println("Data found");
						System.out.println("index of your data : " + myLL.search(data));
					}
					
					break ;
				}
				
				case 9 : {
					myLL.printReverseLinkedList() ;
					break ;
				}
				
				case 10 : {
					myLL.makeReverse();	
					break ;
				}
				
				case 11 : {
					System.out.print("lenth of list : " + myLL.lenthOfList());
					System.out.println();	
					break ;
				}
				
				case 12 : {
					int index ;					
					System.out.print("Enter index : ");
					index = sc.nextInt();
					myLL.deleteAtPositionFromEnd(index);
					break ;
				}
				
				
				case 13 : {
					if(myLL.checkPalindrome) {
						System.out.print("list is palindrome ");
					}
					else {
						System.out.print("Enter index : ");
					}
					System.out.print("list is not  palindrome ");
					
					break ;
				}
				
				
				case 15 : {
					System.out.println("----- Prgram terminatting -----");	
					break ;
				}
				
				
				
				default : {
					System.out.println("--- Invalid Choice! ---");
					break ;
				}
			}
			
		} while (choice != 15);
		
	}
}

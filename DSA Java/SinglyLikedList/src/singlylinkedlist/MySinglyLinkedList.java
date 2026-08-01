package singlylinkedlist;

public class MySinglyLinkedList {
	Node start ;
	
	public MySinglyLinkedList() {
		
	}
	
	
	public void insertAtBeg(int element) {
		Node newNode = new Node(element);
		
		if(start == null) {
			start = newNode ;
			System.out.print("--- Node inserted at begining ---\n");
			return ;
		}
		
		newNode.next = start ;
		start = newNode ;
		System.out.print("--- Node inserted at begining ---\n");		
	}
	
	
	public void insertAtPosition(int element, int position) {
		Node newNode = new Node(element);
		
		if(position <= 0) {
			System.out.println("Index strat from 1 ");
			System.out.println("--- Invalid Index ----");
			return ;
		}
		
		if(position == 1) {
			insertAtBeg(element);
			return ;
		}
		
		Node itr =start ;
		int i = 1 ;
		
		while(i < position - 1  && itr != null) {
			itr = itr.next ;
			i++ ;
		}
		
		if(itr == null) {
			System.out.println("--- invalid index ---")	;
			return ;
		}
		newNode.next = itr.next ;
		itr.next = newNode ;
		
		System.out.print("--- Node inserted at given index ---\n");
	}
	
	
	public void insertAtEnd(int element) {
		Node newNode = new Node(element);
		
		if(start == null) {
			start = newNode ;
			System.out.print("--- Node inserted at end ---\n");
			return ;
		}
		
		Node itr = start ;
		while(itr.next != null) {
			itr = itr.next ;
		}
		
		itr.next = newNode ;
		System.out.print("--- Node inserted at end ---\n");
	}
	
	
	
	public void deleteAtBeg() {
		if(start == null) {
			System.out.println("--- List is empty ---\n");	
			return ;
		}		
		start = start.next ;
		System.out.println("--- delete start Node ---");
	}
	
	
	public void deleteAtEnd() {
		if(start == null) {
			System.out.println("--- List is empty ---\n");	
			return ;
		}
		
		if(start.next == null) {
			start = null ;
			System.out.println("--- Last node deleted ---");
			return ;
		}
		
		Node itr = start ;
		while(itr.next.next != null ) {
			itr = itr.next ;
		}
		itr.next = itr.next.next ;
		System.out.println("--- delete start Node ---");
	}
	
	
	public void deleteAtPosition(int index) {
		if(start == null) {
			System.out.println("--- List is empty ---\n");	
			return ;
		}
		
		if(index == 1) {
			deleteAtBeg();
			return ;
		}
		
		Node itr = start;
		int i=1 ;
		while(i < index - 1 && itr.next != null){
			itr = itr.next ;
			i++ ;
		}
		
		if(itr.next == null) {
			System.out.println("--- invalid index ---")	;
			return ;
		}
		
		itr.next = itr.next.next ;
		System.out.println("--- delete this index Node ---");
	}
	
	public int search(int data) {
		
		if(start == null) {
			System.out.println("\n--- List is empty ---");	
			return -1;
		}
		
		int index = 1 ;
		Node itr = start ;
		
		while(itr != null) {
			if(data == itr.data) {
				return index ;
			}
			
			itr = itr.next ;
			index ++ ;
		}		
		return -1;
	}
	
	public void display() {
		if(start == null) {
			System.out.println("--- List is empty ---\n");			
		}
		else {
			// iterator
			Node itr = start ;
			System.out.print("list : ");
			while(itr != null) {
				System.out.print(itr.data + " -> ");
				itr = itr.next ;
			}
		}
		
		System.out.print("null");
		
		System.out.println();
		
	}
}

package ArrayList;

public class MyArrayList {
	int size ;
	int arr[];
	int index ;
	
	
	// constructor
	public MyArrayList(int s) {
		this.size = s ;
		this.arr = new int[s];
		this.index = 0 ;
	}
	
	
	// increase size of array
	public void grow() {
		this.size = size * 2 ;
		int[] newArr = new int[size];
		
		for(int i=0 ; i < arr.length ; i++) {
			newArr[i] = arr[i];
		}		
		arr = newArr ;
	}
	
	// add data
	public void add(int data) {
		if(index == size) {			
			grow();			
		}
		
		
		
		arr[index] = data;
		index++ ;
		System.out.println("data added successfully");
		System.out.println("--------------------");
	}
	
	// update data using index
	public void update(int data , int pIndex) {
		if(pIndex < 0 || pIndex >= index) {
			System.out.println("---- Invalid index ----");
			return ;
		}
		arr[pIndex] = data ;
		System.out.println("Data updated Successfully");
		System.out.println("--------------------");
	}
	
	
	// insert data at index
	public void insertAtIndex(int pIndex, int data) {
		
		if(index == size) {			
			grow();			
		}
		
		if(pIndex < 0 || pIndex > index) {
			System.out.println("---- Invalid index ----");
			return ;
		}
		for(int i = index; i > pIndex ; i--) {
			arr[i] = arr[i-1];
		}
		arr[pIndex] = data ;
		index++ ;
	}
	
	// remove data using index
	public void deleteAtIndex(int pIndex) {		
		
		if(pIndex < 0 || pIndex >= index) {
			System.out.println("---- Invalid index ----");
			return ;
		}
		for(int i = pIndex; i < index - 1 ; i++) {
			arr[i] = arr[i+1];
		}
		
		index-- ;
	}
	
	// get data using index
	public int get(int pIndex) {
		if(pIndex < 0 || pIndex >= index) {
			System.out.println("---- Invalid index ----");
			return -1;
		}
		
		return arr[pIndex];
	}
	
//  search data using value

	public void search(int data) {
		for(int i=0 ; i < index ; i++) {
			if(arr[i] == data) {
				System.out.println("--- Data found at index : " + i + "---");
				return ;
			}
		}
		System.out.println("--- Data not found ---");
	}
	
	
	// display data
	public void display() {
		System.out.println("\n\nDisplaying the data");
		System.out.println("--------------------");
		for(int i=0 ; i < index ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
	}
}

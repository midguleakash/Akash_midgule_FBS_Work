package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner ;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int choice ;		

		do {
		    System.out.println("\n===== Employee Management System =====");
		    System.out.println("1. Add Employee");
		    System.out.println("2. Display All Employees");
		    System.out.println("3. Search Employee By ID");
		    System.out.println("4. Delete Employee By ID");
		    System.out.println("5. Count Employees");
		    System.out.println("6. Exit");
		    System.out.print("Enter choice: ");

		    choice = sc.nextInt();

		    switch (choice) {
		        case 1:{		        	
		        	System.out.print("Enter id : ");
		        	int id = sc.nextInt();
		        	sc.nextLine();
		        	System.out.print("Enter first name : ");
		        	String fName = sc.nextLine();
		        	System.out.print("Enter last name : ");
		        	String lName = sc.nextLine();
		        	System.out.print("Enter department name : ");
		        	String dep = sc.nextLine();
		        	System.out.print("Enter salary : ");
		        	double sal = sc.nextDouble();
		        	sc.nextLine();
		        	System.out.print("Enter city : ");
		        	String city = sc.nextLine();
		        	
		        	Employee emp = new Employee(id, fName, lName, dep,sal, city );
		        	EmployeeDao.addEmployee(emp);
		        	
		        	break;
		        }
		            
		            

		        case 2:{
		        	ArrayList<Employee> empList = EmployeeDao.displayAll();
		        	for(Employee e : empList) {
		        		System.out.println(e);
		        	}		        	
		        	break ;		        	
		        }
		           
		           

		        case 3:{
		        	System.out.print("Enter id for search: ");
		        	int id = sc.nextInt();
		        	Employee emp = EmployeeDao.searchEmployee(id);
		        	
		        	if(emp == null) {
		        		System.out.println("--- Employee not found ---");
		        	}
		        	else {
		        		System.out.println("--- Employee found ---");
		        		System.out.println(emp);
		        	}
		        	break;
		        }

		        case 4:{
		        	System.out.print("Enter id for search: ");
		        	int id = sc.nextInt();
		        	int rows = EmployeeDao.deleteEmployee(id);
		        	if (rows > 0) {
			            System.out.println("Employee deleted successfully.");
			        } else {
			            System.out.println("Employee with ID " + id + " not found.");
			        }
		        	break ;
		        }
		            

		        case 5:{
		        	int count = EmployeeDao.countEmployee();
		        	System.out.println(count);
		        	break ;
		        }
		            
		            

		        case 6:
		            System.out.println("--- Program terminate!!! ---");
		            break;

		        default:
		            System.out.println("Invalid choice!");
		    }

		} while (choice != 6);
		 
	}
	
}

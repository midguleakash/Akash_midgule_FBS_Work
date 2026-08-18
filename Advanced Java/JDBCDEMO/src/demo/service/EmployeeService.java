package demo.service;

import java.util.ArrayList;

import demo.model.Employee;
import demo.repository.EmployeeDBDao;
import demo.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository empRepo = new EmployeeDBDao(); 	
	ArrayList<Employee> empList = new ArrayList<>();
	
	// by default load data from sql to reduce load on db
	
	public EmployeeService(){
		empList = empRepo.getAllEmployee();
	}
	
	public boolean addEmployee(Employee emp) {
		boolean found = false ;
		int tempId = emp.getId();
		
		for(Employee e : empList) {
			if(tempId == e.getId() ) {
				found = true ;
				break ;
			}
		}
		
		if(found) {
			System.out.println("Employee exists");
			return false ;
		}
		else {
			if(empRepo.addEmployee(emp)) {
				empList.add(emp);
				return true ;
			}else {
				return false ;
			}			
		}
			
	}
	
	public ArrayList<Employee> getAllEmployee(){
		return empList;
		
	}
	
	public Employee searchEmployee(int id) {
		for(Employee e : empList) {
			if(id == e.getId() ) {
				return e ;				
			}
		}
		
		return null;
	}
	
	public boolean deleteEmployee(int id) {
		boolean found = false ;	
		Employee tempEmp = null ;
		
		for(Employee e : empList) {
			if(id == e.getId() ) {
				found = true ;
				tempEmp = e ;
				break ;
			}
		}
		
		if(found) {
			System.out.println("Employee exists");
			if(empRepo.deleteEmployee(id)) {
				empList.remove(tempEmp);
				return true;
			}else {
				return false;
			}
			
		}
		else {
			System.out.println("Employee Not exists this id for delete");
			return false ;
		}		
		
	}
	
	public int countTotalEmployee() {
		return empList.size();
	}
}

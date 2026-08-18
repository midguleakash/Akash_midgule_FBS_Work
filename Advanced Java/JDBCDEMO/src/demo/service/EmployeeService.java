package demo.service;

import java.util.ArrayList;

import demo.model.Employee;
import demo.repository.EmployeeDBDao;
import demo.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository empRepo = new EmployeeDBDao(); 
	
	public boolean addEmployee(Employee emp) {
		return empRepo.addEmployee(emp);		
	}
	
	public ArrayList<Employee> getAllEmployee(){
		return empRepo.getAllEmployee();
		
	}
	
	public Employee searchEmployee(int id) {
		return empRepo.searchEmployee(id);
	}
	
	public boolean deleteEmployee(int id) {
		return empRepo.deleteEmployee(id);
	}
	
	public int countTotalEmployee() {
		return empRepo.countTotalEmployee();
	}
}

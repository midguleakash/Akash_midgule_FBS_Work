package repository;

import java.util.ArrayList;

import demo.model.Employee;

public interface EmployeeRepository {
	public boolean addEmployee(Employee emp);
	public ArrayList<Employee> getAllEmployee();
//	public Employee searchEmployee(int id);
	public boolean deleteEmployee(int id);
	public int countTotalEmployee();
}

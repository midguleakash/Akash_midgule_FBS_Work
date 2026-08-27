package employee.repository;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import employee.model.Employee;
import employee.util.DBUtil;




public class EmployeeDBDao implements EmployeeRepository {

	@Override
	public boolean addEmployee(Employee emp) {
		try {
			Statement stmt = DBUtil.getConnection().createStatement();
			String query = "insert into employee values("+emp.getId()+", '"+emp.getfName()+"' , '"+emp.getlName()+"' , '"+emp.getDepartment()+"' ,"+emp.getSalary()+", '"+emp.getCity()+"' )";
			stmt.executeUpdate(query);
			
			return true ;
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> empList = new ArrayList<>();
		
		try {
			Statement stmt = DBUtil.getConnection().createStatement();
			ResultSet result = stmt.executeQuery("select * from employee ");
			while(result.next()) {
				Employee emp = new Employee(result.getInt(1) , result.getString(2) , result.getString(3) , result.getString(4) , result.getInt(5) , result.getString(6) ); 
				empList.add(emp);
			}				
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return empList ;
	}

	//@Override
//	public Employee searchEmployee(int id) {
//		Employee emp ;
//		try {
//			Statement stmt = DBUtil.getConnection().createStatement();
//			ResultSet result = stmt.executeQuery("select * from employee where emp_id="+id+  ";");
//			
//			if(result.next()) {
//				emp = new Employee(result.getInt(1) , result.getString(2) , result.getString(3) , result.getString(4) , result.getInt(5) , result.getString(6) );
//				return emp ;
//			}
//			else {
//				return null ;
//			}
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
//		
//		return null ;
//	}

	@Override
	public boolean deleteEmployee(int id) {
		try {
			Statement stmt = DBUtil.getConnection().createStatement();
			int rows = stmt.executeUpdate("delete from employee where emp_id = "+id+ ";");	
			if (rows > 0) {
				return true ;
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false ;
	}

	@Override
	public int countTotalEmployee() {
		try {
			Statement stmt = DBUtil.getConnection().createStatement();
			ResultSet rows = stmt.executeQuery("select count(*) from employee");		
			 if (rows.next()) {
		            return rows.getInt(1);
		        }
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return 0 ;
	}

}

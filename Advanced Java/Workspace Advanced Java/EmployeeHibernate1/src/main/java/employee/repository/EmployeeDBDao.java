package employee.repository;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import employee.model.Employee;
import employee.util.DBUtil;
import employee.util.HibernateUtil;

public class EmployeeDBDao implements EmployeeRepository {

	@Override
	public boolean addEmployee(Employee emp) {
//		try {
//			Statement stmt = DBUtil.getConnection().createStatement();
//			String query = "insert into employee values("+emp.getId()+", '"+emp.getfName()+"' , '"+emp.getlName()+"' , '"+emp.getDepartment()+"' ,"+emp.getSalary()+", '"+emp.getCity()+"' )";
//			stmt.executeUpdate(query);
//			
//			return true ;
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
//		return false;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.persist(emp);
			session.getTransaction().commit();
			session.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
//		ArrayList<Employee> empList = new ArrayList<>();
//		
//		try {
//			Statement stmt = DBUtil.getConnection().createStatement();
//			ResultSet result = stmt.executeQuery("select * from employee ");
//			while(result.next()) {
//				Employee emp = new Employee(result.getInt(1) , result.getString(2) , result.getString(3) , result.getString(4) , result.getInt(5) , result.getString(6) ); 
//				empList.add(emp);
//			}				
//			
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
//		
//		return empList ;
		ArrayList<Employee> empList = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			List<Employee> list = session.createQuery("from Employee", Employee.class).getResultList();
			empList.addAll(list);
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	// @Override
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
//		try {
//			Statement stmt = DBUtil.getConnection().createStatement();
//			int rows = stmt.executeUpdate("delete from employee where emp_id = "+id+ ";");	
//			if (rows > 0) {
//				return true ;
//			}
//			
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
//		return false ;

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Employee emp = session.find(Employee.class, id);
			if (emp != null) {
				session.remove(emp);
				session.getTransaction().commit();
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int countTotalEmployee() {
//		try {
//			Statement stmt = DBUtil.getConnection().createStatement();
//			ResultSet rows = stmt.executeQuery("select count(*) from employee");		
//			 if (rows.next()) {
//		            return rows.getInt(1);
//		        }
//			
//		} catch (SQLException e) {			
//			e.printStackTrace();
//		}
//		return 0 ;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Long count = session.createQuery("select count(e) from Employee e", Long.class).getSingleResult();
			session.close();
			return count.intValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0 ;

	}

}

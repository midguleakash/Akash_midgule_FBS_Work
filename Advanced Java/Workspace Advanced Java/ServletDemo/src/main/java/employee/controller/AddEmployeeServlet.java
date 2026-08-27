package employee.controller;

import java.io.IOException;

import employee.model.Employee;
import employee.service.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	EmployeeService empService = new EmployeeService();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
        String department = req.getParameter("department");

        double salary = Double.parseDouble(
                req.getParameter("salary"));

        String city = req.getParameter("city");
        
        System.out.println("===== ADD EMPLOYEE SERVLET =====");

        System.out.println("ID         : " + req.getParameter("id"));
        System.out.println("First Name : " + req.getParameter("fName"));
        System.out.println("Last Name  : " + req.getParameter("lName"));
        System.out.println("Department : " + req.getParameter("department"));
        System.out.println("Salary     : " + req.getParameter("salary"));
        System.out.println("City       : " + req.getParameter("city"));

        Employee emp = new Employee(
                id,
                fName,
                lName,
                department,
                salary,
                city
        );

        boolean result = empService.addEmployee(emp);

        if (result) {

            // Redirect to employees.html
            resp.sendRedirect("employees.html");

        } else {

            // Redirect back to add employee page
            resp.sendRedirect("add-employee.html?error=failed");
        }
	}
}

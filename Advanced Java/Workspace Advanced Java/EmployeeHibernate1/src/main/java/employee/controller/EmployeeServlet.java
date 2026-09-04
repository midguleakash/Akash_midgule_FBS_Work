package employee.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import employee.model.Employee;
import employee.service.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {
	
	private EmployeeService empService =
            EmployeeService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

    	ArrayList<Employee> employees = empService.getAllEmployee();

        resp.setContentType("application/json");

        Gson gson = new Gson();

        String json = gson.toJson(employees);

        resp.getWriter().print(json);

}
}

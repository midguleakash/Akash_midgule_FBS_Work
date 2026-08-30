package employee.controller;

import java.io.IOException;

import employee.service.EmployeeService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employeeCount")
public class CountEmployeeServlet extends HttpServlet {

    private EmployeeService empService =
            EmployeeService.getInstance();

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        int count = empService.countTotalEmployee();

        resp.setContentType("text/plain");

        resp.getWriter().print(count);
    }
}
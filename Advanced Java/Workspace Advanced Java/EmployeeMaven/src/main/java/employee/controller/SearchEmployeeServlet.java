package employee.controller;

import java.io.IOException;

import com.google.gson.Gson;

import employee.model.Employee;
import employee.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {

    private EmployeeService empService =
            EmployeeService.getInstance();

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(
                req.getParameter("id"));

        System.out.println("Searching Employee ID: " + id);

        Employee employee =
                empService.searchEmployee(id);

        resp.setContentType("application/json");

        Gson gson = new Gson();

        String json = gson.toJson(employee);

        resp.getWriter().print(json);
    }
}
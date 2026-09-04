package employee.controller;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import employee.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

    private EmployeeService empService =
            EmployeeService.getInstance();

    @Override
    protected void doDelete(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        int id = Integer.parseInt(
                req.getParameter("id"));

        System.out.println(
                "Deleting Employee ID: " + id);

        boolean deleted =
                empService.deleteEmployee(id);

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(
                new DeleteResponse(deleted));

        resp.getWriter().print(json);
    }

    class DeleteResponse {

        boolean success;

        DeleteResponse(boolean success) {
            this.success = success;
        }
    }
}
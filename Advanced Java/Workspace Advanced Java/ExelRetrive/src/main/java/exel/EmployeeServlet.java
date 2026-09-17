package exel;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class EmployeeServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        try {

            // Read employees from Excel
            List<Employee> employees =
                    ExcelReader.getEmployees();

            // Convert Java List to JSON
            String json =
                    objectMapper.writeValueAsString(employees);

            // Response settings
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");

            resp.setStatus(HttpServletResponse.SC_OK);

            // Send JSON to frontend
            resp.getWriter().print(json);

        } catch (Exception e) {

            e.printStackTrace();

            resp.setStatus(
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR
            );

            resp.setContentType("application/json");

            resp.getWriter().print(
                    "{\"message\":\"Unable to read employee data\"}"
            );
        }
    }
}
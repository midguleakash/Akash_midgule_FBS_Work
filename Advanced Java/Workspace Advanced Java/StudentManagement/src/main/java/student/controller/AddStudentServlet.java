package student.controller;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import student.model.Address;
import student.model.Batch;
import student.model.Student;
import student.service.StudentService;

@WebServlet("/addstudent")
public class AddStudentServlet extends HttpServlet{
	
	StudentService studentService = new StudentService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentService studentService = new StudentService();
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		
		Address address = new Address(105, 412218, "lane 1", "100", "pune", "maharashtra");
		Batch batch = new Batch("feb2027", "java");
		Student student = new Student("frn14","akash",LocalDate.of(2026,9,9), address , 9284406801L, batch );
		
		studentService.addStudent(student);
	}
	
}

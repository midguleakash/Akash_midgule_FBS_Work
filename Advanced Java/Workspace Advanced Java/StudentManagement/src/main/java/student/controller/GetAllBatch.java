package student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import student.model.Batch;
import student.service.StudentService;

@WebServlet("/getallbatch")
public class GetAllBatch extends HttpServlet{
	
	StudentService studentService = new StudentService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		List<Batch> bacthList = studentService.getAllBatch();
		
		String studentJson = objectMapper.writeValueAsString(bacthList);
		PrintWriter  pw = resp.getWriter();
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		resp.setContentType("application/json");
		pw.write(studentJson);
	}
}

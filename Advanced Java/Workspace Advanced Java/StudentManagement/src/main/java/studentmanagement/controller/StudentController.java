package studentmanagement.controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.model.Student;
import studentmanagement.service.StudentService;


public class StudentController  {
	StudentService studentService = new StudentService();
	ObjectMapper objectMapper = new ObjectMapper();
	
	public StudentController() {
		
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	public void getAllStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		List<Student> studentList = studentService.getAllStundets();
		String studentJson = objectMapper.writeValueAsString(studentList);
		PrintWriter pw = resp.getWriter();

		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		resp.setContentType("application/json");
		pw.write(studentJson);

		System.out.println(studentList);

	}
	
	
	public void addStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		

		StudentService studentService = new StudentService();

		System.out.println("backend tak aya");

		BufferedReader reader = req.getReader();
		String studentString = reader.readLine();

		System.out.println(studentString);
		Student student = objectMapper.readValue(studentString, Student.class);

		System.out.println(student);
		studentService.addStudent(student);

	}

	public void wishBday() {
		studentService.wishBday();
		
	}
}

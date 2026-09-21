package studentmanagement.controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.dto.EntityResponseDTO;
import studentmanagement.dto.StudentCityDTO;
import studentmanagement.model.Student;
import studentmanagement.service.StudentService;

@Component
public class StudentController  {
	private final StudentService studentService;

	//StudentService studentService = new StudentService();
	ObjectMapper objectMapper = new ObjectMapper();
	
	public StudentController(StudentService studentService) {
		 this.studentService = studentService;
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	public void getAllStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		List<Student> studentList = studentService.getAllStundets();
		String studentJson = objectMapper.writeValueAsString(studentList);
		PrintWriter pw = resp.getWriter();

		
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
		
		EntityResponseDTO<Student> entityResponseDTO;
		
		if(studentService.addStudent(student)) {
			 entityResponseDTO = new EntityResponseDTO<Student>(200,"student add successfully",null);
		}else {
			 entityResponseDTO = new EntityResponseDTO<Student>(500,"server error",null);
		}

		String responeJson = objectMapper.writeValueAsString(entityResponseDTO);
		
		resp.getWriter().print(responeJson);
	}

	public void wishBday() {
		studentService.wishBday();
		
	}

	public void getStudentByCity(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String city = req.getParameter("city");
		List<StudentCityDTO> studentByCity = studentService.getStudentByCity(city);
		
		String studentByCityJson = objectMapper.writeValueAsString(studentByCity);
		PrintWriter pw = resp.getWriter();

		
		resp.setContentType("application/json");
		pw.write(studentByCityJson);

		System.out.println(studentByCity);
		
	}
}

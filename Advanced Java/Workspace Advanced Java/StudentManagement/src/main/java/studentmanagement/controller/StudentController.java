package studentmanagement.controller;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.dto.EntityResponseDTO;
import studentmanagement.dto.StudentCityDTO;
import studentmanagement.model.Student;
import studentmanagement.service.StudentService;

@RestController
@RequestMapping("/getall")
public class StudentController  {
	private final StudentService studentService;

	//StudentService studentService = new StudentService();
	ObjectMapper objectMapper = new ObjectMapper();
	
	public StudentController(StudentService studentService) {
		 this.studentService = studentService;
		objectMapper.registerModule(new JavaTimeModule());
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent() throws IOException {

		List<Student> studentList = studentService.getAllStundets();
		System.out.println(studentList);
		return studentList;

		

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

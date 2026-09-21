package studentmanagement.servlet;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.config.SpringConfig;
import studentmanagement.controller.StudentController;
import studentmanagement.model.Student;
import studentmanagement.service.StudentService;

@WebServlet("/student/*")
public class StudentServlet extends HttpServlet {
	private StudentController controller;
	 private ApplicationContext applicationContext;
	//StudentController controller = new StudentController();
	 
	 
	 @Override
	    public void init() throws ServletException {

	        applicationContext =
	                new AnnotationConfigApplicationContext(
	                        SpringConfig.class
	                );

	        controller =
	                applicationContext.getBean(
	                        StudentController.class
	                );

	        System.out.println("Spring Context Started");
	        System.out.println("StudentController Bean Created");
	    }

	 

     

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCors(resp);
		String path = req.getPathInfo();
		if ("/getallstudents".equals(path)) {
			controller.getAllStudent(req, resp);
		}
		else if ("/getstudentsbycity".equals(path)) {
			controller.getStudentByCity(req, resp);
		}
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCors(resp);
		String path = req.getPathInfo();

		if ("/addstudent".equals(path)) {
			controller.addStudent(req, resp);
		}
		else if("/wishbday".equals(path)) {
			controller.wishBday();
		}
	}


	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCors(resp);
	}

	private void setCors(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	}

}

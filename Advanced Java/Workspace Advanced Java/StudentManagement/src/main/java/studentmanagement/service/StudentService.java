package studentmanagement.service;

import java.util.ArrayList;

import java.util.List;

import studentmanagement.dto.BdayDetailsDTO;
import studentmanagement.model.Batch;
import studentmanagement.model.Student;
import studentmanagement.repository.StudenRepository;
import studentmanagement.repository.StudentRepositoryImpl;



public class StudentService {
	
	StudenRepository studenRepository = new StudentRepositoryImpl();

	public void addStudent(Student student) {
		studenRepository.addStudent(student);
			
	}

	public List<Student> getAllStundets() {
		return studenRepository.getAllStundets();
		
	}

	

	public void wishBday() {
		List<BdayDetailsDTO> studentList = studenRepository.wishBday();
		
		System.out.println(studentList);
		
	}

}

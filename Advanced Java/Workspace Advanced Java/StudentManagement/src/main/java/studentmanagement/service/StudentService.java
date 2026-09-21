package studentmanagement.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import studentmanagement.dto.BdayDetailsDTO;
import studentmanagement.dto.StudentCityDTO;
import studentmanagement.model.Batch;
import studentmanagement.model.Student;
import studentmanagement.repository.StudenRepository;
import studentmanagement.repository.StudentRepositoryImpl;


@Service
public class StudentService {
	
	StudenRepository studenRepository = new StudentRepositoryImpl();

	public boolean addStudent(Student student) {
		return  studenRepository.addStudent(student);
			
	}

	public List<Student> getAllStundets() {
		return studenRepository.getAllStundets();
		
	}

	

	public void wishBday() {
		List<BdayDetailsDTO> studentList = studenRepository.wishBday();
		
		System.out.println(studentList);
		
	}

	public List<StudentCityDTO> getStudentByCity(String city) {
		return studenRepository.getStudentByCity(city);
		
	}

}

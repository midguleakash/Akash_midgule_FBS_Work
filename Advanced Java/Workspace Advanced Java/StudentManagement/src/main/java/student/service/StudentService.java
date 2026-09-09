package student.service;

import java.util.List;

import student.model.Batch;
import student.model.Student;
import student.repository.StudenRepository;
import student.repository.StudentRepositoryImpl;

public class StudentService {
	
	StudenRepository studenRepository = new StudentRepositoryImpl();

	public void addStudent(Student student) {
		studenRepository.addStudent(student);
			
	}

	public List<Student> getAllStundets() {
		return studenRepository.getAllStundets();
		
	}

	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return studenRepository.getAllBatch();
	}

}

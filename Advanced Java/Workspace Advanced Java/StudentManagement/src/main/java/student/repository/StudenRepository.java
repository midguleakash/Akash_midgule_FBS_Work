package student.repository;

import java.util.List;

import student.dto.BdayDetailsDTO;
import student.model.Batch;
import student.model.Student;

public  interface StudenRepository {
	public void addStudent(Student student);
	public List<Student> getAllStundets();
	public List<Batch> getAllBatch();
	public List<BdayDetailsDTO> wishBday();

}

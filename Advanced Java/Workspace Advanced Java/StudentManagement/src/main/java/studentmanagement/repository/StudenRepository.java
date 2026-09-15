package studentmanagement.repository;

import java.util.List;



import studentmanagement.dto.BdayDetailsDTO;
import studentmanagement.dto.StudentCityDTO;
import studentmanagement.model.Batch;
import studentmanagement.model.Student;




public  interface StudenRepository {
	public boolean addStudent(Student student);
	public List<Student> getAllStundets();
	
	public List<BdayDetailsDTO> wishBday();
	public List<StudentCityDTO> getStudentByCity(String city);

}

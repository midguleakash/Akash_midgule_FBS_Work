package studentmanagement.repository;

import java.util.List;


import org.hibernate.Hibernate;
import org.hibernate.Session;


import studentmanagement.util.HibernateUtil;
import studentmanagement.dto.BdayDetailsDTO;
import studentmanagement.model.Batch;
import studentmanagement.model.Student;





public class StudentRepositoryImpl implements StudenRepository {

	@Override
	public void addStudent(Student student) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Batch batch = session.get(Batch.class, student.getBatch().getBatchId());
		student.setBatch(batch);
		session.persist(student);
		session.getTransaction().commit();
	}

	@Override
	public List<Student> getAllStundets() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Student> studentList = session.createQuery("from Student", Student.class).getResultList();
		return studentList ;
	}

	

	@Override
	public List<BdayDetailsDTO> wishBday() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<BdayDetailsDTO> studentList = session.createQuery(
			    "select new student.dto.BdayDetailsDTO(s.frn, s.name, s.dob) " +
			    "from Student s " +
			    "where month(s.dob) = month(current_date) " +
			    "and day(s.dob) = day(current_date)",
			    BdayDetailsDTO.class
			).getResultList();
		return studentList ;
		
		
	}

}

package student.repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import student.model.Batch;
import student.model.Student;
import student.util.HibernateUtil;

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
	public List<Batch> getAllBatch() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Batch> batchList = session.createQuery("from Batch", Batch.class).getResultList();
		return batchList ;
		
	}

}

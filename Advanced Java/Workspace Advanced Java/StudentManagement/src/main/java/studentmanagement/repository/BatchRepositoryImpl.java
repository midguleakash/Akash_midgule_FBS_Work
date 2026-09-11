package studentmanagement.repository;

import java.util.List;

import org.hibernate.Session;

import studentmanagement.model.Batch;
import studentmanagement.util.HibernateUtil;

public class BatchRepositoryImpl implements BatchRepository{

	@Override
	public List<Batch> getAllBatch() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Batch> batchList = session.createQuery("from Batch", Batch.class).getResultList();
		return batchList ;
		
	}

}

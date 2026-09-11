package studentmanagement.service;

import java.util.List;

import studentmanagement.model.Batch;
import studentmanagement.repository.BatchRepository;
import studentmanagement.repository.BatchRepositoryImpl;


public class BatchService {
	
	BatchRepository batchRepository = new BatchRepositoryImpl();


	
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return batchRepository.getAllBatch();
	}
}

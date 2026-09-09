package student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
	
	@Id
	String batchId;
    String batchName;
    
    public Batch() {

	}
    
	public Batch(String batchId, String batchName) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchName=" + batchName + "]";
	}
    
    
}

package studentmanagement.dto;

public class EntityResponseDTO <T>{
	int statusCode;
	String message;
	T data;
	
	public EntityResponseDTO() {
		
	}
	
	public EntityResponseDTO(int statusCode, String message, T data) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	

}

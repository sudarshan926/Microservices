package Exception;

public class Error {
	
	 int statuscode;
	String errorMessage;
	public Error(int statuscode, String errorMessage) {
		super();
		this.statuscode = statuscode;
		this.errorMessage = errorMessage;
	}
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "Error [statuscode=" + statuscode + ", errorMessage=" + errorMessage + "]";
	}


}

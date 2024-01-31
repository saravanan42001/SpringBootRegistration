package Register.Login.Response;

public class LoginResponse {
	String messasge;
	boolean status;
	public LoginResponse(String messasge, boolean status) {
		super();
		this.messasge = messasge;
		this.status = status;
	}
	public LoginResponse() {
		super();
	}
	public String getMessasge() {
		return messasge;
	}
	public void setMessasge(String messasge) {
		this.messasge = messasge;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoginResponse [messasge=" + messasge + ", status=" + status + "]";
	}
	
	
	

}

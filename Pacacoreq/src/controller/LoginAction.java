package controller;

public class LoginAction {
	
	
	private String username;
	private String password;
	
	public String execute() {
		
		if(username.equals("marvin") && password.equals("1234")) {
			return "success";
		} else {
			return "failed";
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}

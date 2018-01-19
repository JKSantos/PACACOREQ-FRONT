package controller;

import com.opensymphony.xwork2.Action;

public class LoginAction{
	
	
	private String username;
	private String password;
	private String result;
	
	public String execute() {
		
		try {
			
			result = "failed";
			
			if(username.equals("marvin") && password.equals("1234")) {
				result = "success";
			} 
			
			return Action.SUCCESS;
		}catch(NullPointerException e) {
			result = "failed";
			return result;
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

	public String getResult() {
		return result;
	}
}

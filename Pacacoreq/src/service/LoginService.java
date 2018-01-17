package service;

import model.Account;

public class LoginService {
	
	public String validate(Account accountNaNaglogin) {
		
		Account tamangAccount = new Account();
		
		
		if(accountNaNaglogin.getUsername().equals(tamangAccount)) {
			return "success";
		} else {
			return "failed";
		}

	}

}

package br.com.component;

public class Ultil {
	/*
	 * M�todo respons�vel por realizar a valida��o do login
	 * @param user
	 * @param password
	 * @return boolean
	 */
	
	public boolean validarLogin(String user, String password) {
		boolean isLoginValid = false;
		String userValid = "admin";
		String passwordValid = "123";
		if(user.equals(userValid)&& password.equals(passwordValid)) {
			isLoginValid = true;
		}
		return false;
	}
}

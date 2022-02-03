package br.com.component;

public class Ultil {
	/*
	 * Método responsável por realizar a validação do login
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

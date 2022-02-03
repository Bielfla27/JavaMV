package br.com.aulajavaweb.bean;

public class PessoaBean {
	
	private String Nome;
	private String Sobrenome;
	private String Login;
	private String Senha;

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public boolean validaLogin(String login, String senha) {
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("123")) {
			return true;
		}
		return false; 
	}

}

package br.com.aulaJava;

import java.util.Objects;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String senha;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int id, String nome, String endereco, String cpf, String senha) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cpf, senha);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(senha, other.senha);
	}
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", senha=" + senha + "]";
	}
	
}

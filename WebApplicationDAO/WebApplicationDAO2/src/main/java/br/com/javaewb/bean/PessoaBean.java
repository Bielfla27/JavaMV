package br.com.javaewb.bean;

import java.util.List;

import br.com.javaewb.dao.PessoaDAOmEMemorialmpl;
import br.com.javaewb.entity.Pessoa;

public class PessoaBean {
	private Pessoa pessoa = new Pessoa();
	private PessoaDAOmEMemorialmpl pessoaDaoMemorialmpl = new PessoaDAOmEMemorialmpl();
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public PessoaDAOmEMemorialmpl getPessoaDaoMemorialmpl() {
		return pessoaDaoMemorialmpl;
	}
	public void setPessoaDaoMemorialmpl(PessoaDAOmEMemorialmpl pessoaDaoMemorialmpl) {
		this.pessoaDaoMemorialmpl = pessoaDaoMemorialmpl;
	}
	
	public Pessoa criar(Pessoa pessoa) {
		return pessoaDaoMemorialmpl.create(pessoa);
	}
	
	public List<Pessoa> listarTodos(){
		return pessoaDaoMemorialmpl.findAll();
	}
	
	public Pessoa buscarPorUsuario(String Usuario) {
		return pessoaDaoMemorialmpl.findByUsuario(Usuario);
	}
	
	public boolean deletar(Integer codigo) {
		return pessoaDaoMemorialmpl.delete(codigo);
	}
	
	public Pessoa atualizar(Pessoa pessoa) {
		return pessoaDaoMemorialmpl.edit(pessoa);
	}
	
	public boolean validarLogin(String usuario, String senha) {
		boolean loginValido = false;
		Pessoa pessoa = buscarPorUsuario(usuario);
		if(usuario.equals("root") && senha.equals("123")) {
			loginValido = true; 
		}
		return loginValido;
	}

}

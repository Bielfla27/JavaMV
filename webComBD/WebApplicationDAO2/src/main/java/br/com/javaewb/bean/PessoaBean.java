package br.com.javaewb.bean;

import java.util.List;


import br.com.javaewb.dao.PessoaDAODBImpl;
import br.com.javaewb.dao.PessoaDAOmEMemorialmpl;
import br.com.javaewb.entity.Pessoa;

public class PessoaBean {
	private Pessoa pessoa = new Pessoa();
	private PessoaDAOmEMemorialmpl pessoaDaoMemorialmpl = new PessoaDAOmEMemorialmpl();
	private PessoaDAODBImpl pessoaDaDB = new PessoaDAODBImpl();
	
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
		
	public PessoaDAODBImpl getPessoaDaDB() {
		return pessoaDaDB;
	}
	public void setPessoaDaDB(PessoaDAODBImpl pessoaDaDB) {
		this.pessoaDaDB = pessoaDaDB;
	}
	
	public Pessoa criar(Pessoa pessoa) {
		//return pessoaDaoMemorialmpl.create(pessoa);
		return pessoaDaDB.create(pessoa);
	}
	
	public List<Pessoa> listarTodos(){
		//return pessoaDaoMemorialmpl.findAll();
		return pessoaDaDB.findAll();
	}
	
	public Pessoa buscarPorUsuario(String Usuario) {
		//return pessoaDaoMemorialmpl.findByUsuario(Usuario);
		return pessoaDaDB.findByUsuario(Usuario);
	}
	
	public boolean deletar(Integer codigo) {
		//return pessoaDaoMemorialmpl.delete(codigo);
		return pessoaDaDB.delete(codigo);
	}
	
	public Pessoa atualizar(Pessoa pessoa) {
		//return pessoaDaoMemorialmpl.edit(pessoa);
		return pessoaDaDB.edit(pessoa);
	}
	
	public boolean validarLogin(String usuario, String senha) {
		boolean loginValido = false;
		Pessoa pessoa = buscarPorUsuario(usuario);
		if(usuario.equals("root") && senha.equals("123")) {
			loginValido = true; 
		} else if(pessoa != null && pessoa.getSenha().equals(senha)) {
			loginValido = true;
		}
		return loginValido;
	}

}

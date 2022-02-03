package br.com.javaewb.dao;

import java.util.List;

import br.com.javaewb.entity.Pessoa;

public interface PessoaDAO {
	
	public Pessoa create(Pessoa pessoa);
	
	public Pessoa edit(Pessoa pessoa);

	public boolean delete(int idPessoa);
	
	public Pessoa findByUsuario(String usuario);
	
	public List<Pessoa> findAll();
}

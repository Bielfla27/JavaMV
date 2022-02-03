package br.com.javaewb.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.javaewb.entity.Pessoa;

public class PessoaDAOmEMemorialmpl implements PessoaDAO {

	private List<Pessoa> pessoaList = new ArrayList<Pessoa>();
	private int contId = 0;

	@Override
	public Pessoa create(Pessoa pessoa) {
		contId++;
		pessoa.setId(contId);
		pessoaList.add(pessoa);
		return pessoa;
	}

	@Override
	public Pessoa edit(Pessoa pessoa) {
		for (int i = 0; i < pessoaList.size(); i++) {
			if (pessoaList.get(i).getId() == pessoa.getId()) {
				pessoaList.set(i, pessoa);
			}
		}
		return pessoa;
	}

	@Override
	public boolean delete(int idPessoa) {
		boolean procesSucess = false;

		for (int i = 0; i < pessoaList.size(); i++) {
			if (pessoaList.get(i).getId() == idPessoa) {
				pessoaList.remove(pessoaList.get(i));
				procesSucess = true;
			}
		}
		return procesSucess;
	}

	@Override
	public Pessoa findByUsuario(String usuario) {
		// TODO Auto-generated method stub
		Pessoa pessoaReturn = null;
		for(int i = 0; i < pessoaList.size(); i++) {
			if(pessoaList.get(i).getUsuario().equals(usuario)) {
			pessoaReturn = pessoaList.get(i);
			}
		}
		return pessoaReturn;
		
	}

	@Override
	public List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return pessoaList;
	}

}

package br.com.javaewb.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.javaewb.entity.Pessoa;

public class PessoaDAODBImpl implements PessoaDAO {
	private final ConexaoDB con = new ConexaoDB(); 

	@Override
	public Pessoa create(Pessoa pessoa) {
		String sql = "INSERT INTO pessoa(pes_nome, pes_usuario, pes_senha)"
					 + "VALUES('" + pessoa.getNome()
					 + "', '" + pessoa.getUsuario()
					 + "', '" + pessoa.getSenha() + "')";
		con.executarAtualizacao(sql);
		return null;
	}

	@Override
	public Pessoa edit(Pessoa pessoa) {
		String sql = "UPDATE pessoa SET pes_nome ='" + pessoa.getNome()
					 + "' , " + "pes_usuario ='" + pessoa.getUsuario()
					 + "' , " + "pes_senha = '" + pessoa.getSenha()
					 + "' WHERE pes_id = " + pessoa.getId();
		con.executarAtualizacao(sql);
		return null; 
 	}

	@Override
	public boolean delete(int idPessoa) {
		boolean processSucess = false; 
		String sql = "DELETE FROM pessoa WHERE pes_id = " + idPessoa;
		con.executarAtualizacao(sql);
		processSucess = true;
		return processSucess;
	}
	
	/*
	 * Método responsável por buscar uma pessoa na lista pesquisando por usuario
	 */

	@Override
	public Pessoa findByUsuario(String usuario) {
		Pessoa pessoa = null; 
		try {
			String sql = "SELECT * FROM pessoa WHERE pes_usuario = " + "'" + usuario + "'";
			con.conectar();
			ResultSet rs = con.executarConsulta(sql);
			while(rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setUsuario(rs.getString(3));
				pessoa.setSenha(rs.getString(4));
			}
			rs.close();
			rs = null; 
			con.desconectar();
			System.out.println("---------------------------");
		}catch (Exception e) {
			con.desconectar();
			System.out.println("Error: " + e);
		}
		return pessoa;
	}

	@Override
	public List<Pessoa> findAll() {
		List<Pessoa> pessoaList = new ArrayList<>();
		Pessoa pessoa;
		
		try {
			String sql = "SELECT * FROM pessoa";
			con.conectar();
			ResultSet rs = con.executarConsulta(sql);
			while(rs.next()) {
				pessoa = new Pessoa();
				pessoa.setId(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setUsuario(rs.getString(3));
				pessoa.setSenha(rs.getString(4));
				pessoaList.add(pessoa);
			}
			rs.close();
			rs = null;
			con.desconectar();
			System.out.println("----------------------");
		} catch (Exception e) {
			con.desconectar();
			System.out.println("Error: " + e);
		}
		return pessoaList;
	}

}

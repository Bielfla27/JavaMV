package br.com.projetofinal.dao;

import java.util.List;

import br.com.projetofinal.entity.Veiculo;

public interface VeiculoDAO {
	
	public Veiculo create(Veiculo veiculo);

	public Veiculo edit(Veiculo veiculo);
	
	public boolean delete(int idVeiculo);
	
	public List<Veiculo> findALL();
}

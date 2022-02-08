package br.com.projetofinal.bean;

import java.util.List;

import br.com.projetofinal.dao.VeiculoDAODBlmpl;
import br.com.projetofinal.entity.Veiculo;

public class VeiculoBean {
	
	private Veiculo veiculo = new Veiculo();
	private VeiculoDAODBlmpl veiculoDAODBlmpl = new VeiculoDAODBlmpl();
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public VeiculoDAODBlmpl getVeiculoDAODBlmpl() {
		return veiculoDAODBlmpl;
	}
	public void setVeiculoDAODBlmpl(VeiculoDAODBlmpl veiculoDAODBlmpl) {
		this.veiculoDAODBlmpl = veiculoDAODBlmpl;
	}
	
	
	public Veiculo criar(Veiculo veiculo) {
		return veiculoDAODBlmpl.create(veiculo);
	}
	
	public Veiculo edit(Veiculo veiculo) {
		return veiculoDAODBlmpl.edit(veiculo);
	}
	
	public boolean delete(int idVeiculo) {
		return veiculoDAODBlmpl.delete(idVeiculo);
	}
	/*
	 * Lista os veiculos
	 */
	public List<Veiculo> findALL() {
		return veiculoDAODBlmpl.findALL();
	}
	
}

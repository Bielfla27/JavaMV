package br.com.projetofinal.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.pessoa.dao.ConexaoDB;
import br.com.pessoa.entity.Pessoa;
import br.com.projetofinal.entity.Veiculo;

public class VeiculoDAODBlmpl implements VeiculoDAO{
	private final ConexaoDB con = new ConexaoDB(); 

	@Override
	public Veiculo create(Veiculo veiculo) {
		String sql = "INSERT INTO veiculo(vei_dataregistro, vei_modelo, vei_marca, vei_ano, vei_valor)"
				 + "VALUES('" + veiculo.getDataRegistro()
				 + "', '" + veiculo.getModelo()
				 + "', '" + veiculo.getMarca() 
				 + "', '" + veiculo.getAno() 
				 + "', '" + veiculo.getValor() + "')";
		con.executarAtualizacao(sql);
		return null;
	}

	@Override
	public Veiculo edit(Veiculo veiculo) {
		String sql = "UPDATE veiculo SET vei_modelo ='" + veiculo.getModelo()
		 + "' , " + "vei_marca ='" + veiculo.getMarca()
		 + "' , " + "vei_ano = '" + veiculo.getAno()
		 + "' , " + "vei_valor = '" + veiculo.getValor()
		 + "' WHERE vei_id = " + veiculo.getId();
		con.executarAtualizacao(sql);
		return null; 
	}

	@Override
	public boolean delete(int idVeiculo) {
		boolean processSucess = false; 
		String sql = "DELETE FROM veiculo WHERE vei_id = " + idVeiculo;
		con.executarAtualizacao(sql);
		processSucess = true;
		return processSucess;
	}

	@Override
	public List<Veiculo> findALL() {
		List<Veiculo> veiculoList = new ArrayList<>();
		Veiculo veiculo;
		
		try {
			String sql = "SELECT * FROM veiculo";
			con.conectar();
			ResultSet rs = con.executarConsulta(sql);
			while(rs.next()) {
				veiculo = new Veiculo();
				veiculo.setId(rs.getInt(1));
				veiculo.setDataRegistro(rs.getDate(2));
				veiculo.setModelo(rs.getString(3));
				veiculo.setMarca(rs.getString(4));
				veiculo.setAno(rs.getInt(5));
				veiculo.setValor(rs.getDouble(6));
				veiculoList.add(veiculo);
			}
			rs.close();
			rs = null;
			con.desconectar();
			System.out.println("----------------------");
		} catch (Exception e) {
			con.desconectar();
			System.out.println("Error: " + e);
		}
		return veiculoList;
	}

}

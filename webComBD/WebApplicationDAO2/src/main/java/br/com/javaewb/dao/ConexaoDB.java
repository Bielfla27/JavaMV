package br.com.javaewb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDB {
	
	private Connection con;
	private Statement s;
	
	private final String enderecoFisicoBanco = "jdbc:postgresql://localhost:5432/" ;
	private final String banco = "DB_AULAPROJETOWEB";
	private final String user = "postgres";
	private final String password = "Gabriel";
	private String mensagem; 
	
	public void conectar() {
		try {
			if(con == null || con.isClosed()) {
				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection(enderecoFisicoBanco + banco, user, password);
				System.out.println("Conexão aberta...");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	public void desconectar() {
		if(con != null) {
			try {
				if(s != null) {
					s.close();
					s = null;
				}
				con.close();
				System.out.println("Conexão fechada...");
			}catch (Exception e) {
				System.out.println("Error: " + e);
			}
		}
	}
	
	public int executarAtualizacao(String sql) {
		mensagem = "Sucesso na execução";
		try {
			conectar();
			if(s == null) {
				s = con.createStatement();
			}
			int rs = s.executeUpdate(sql);
			System.out.println(mensagem);
			desconectar();
			return rs;
		}catch (Exception e) {
			desconectar();
			mensagem = "Error: " + e;
			System.out.println(mensagem);
		}
		return (0);
	}
	
	public ResultSet executarConsulta(String sql) {
		mensagem = "Sucesso na execuçao.";
		try {
			if(s == null) {
				s = con.createStatement();
			}
			System.out.println("Executando SQL de consulta...");
			ResultSet rs = s.executeQuery(sql);
			//System.out.println(rs);
			return rs;
		}catch (Exception e) {
			mensagem = "Erro: " + e; 
			System.out.println(mensagem);
		}
		return null;
	}
	

}

package br.com.java.inter;

public class ContaGeradorExtrato {
	
	public void geradorConta( ContaInter conta) {
		System.out.println("Saldo Atual: " + conta.getSaldo());
	}
}

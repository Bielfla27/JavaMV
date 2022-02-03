package br.com.java.inter;

public class ContaInterTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrenteImpl cc = new ContaCorrenteImpl();
		cc.depositar(1200.20);
		cc.sacar(300);
		
		ContaPoupancaImpl cp = new ContaPoupancaImpl();
		cp.depositar(500.20);
		cp.sacar(25);
		
		ContaGeradorExtrato gerar = new ContaGeradorExtrato();
		gerar.geradorConta(cc);
		gerar.geradorConta(cp);
	}

}

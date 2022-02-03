package br.com.aulajavaabstrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("###EXTRATO DA CONTA ###");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/aaaa HH:mm:ss");
		Date date = new Date();
		
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data: " +sdf.format(date));
	}

}

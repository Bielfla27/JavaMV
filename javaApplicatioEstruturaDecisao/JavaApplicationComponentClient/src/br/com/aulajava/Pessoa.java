package br.com.aulajava;

import java.util.Scanner;

import br.com.component.Ultil;
public class Pessoa {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Ultil util = new Ultil();
		String usuario; 
		String senha; 
		boolean repetir = true;
		do {
			System.out.print("Informe o usuario: ");
			usuario = sc.next();
			System.out.print("Informe a senha: ");
			senha = sc.next();
			if(util.validarLogin(usuario, senha)) {
				System.out.println("Parabéns! login realizado com sucesso.");
				repetir = false;
			}else {
				System.out.println("Falha no login!");
			}
			
		}while(repetir);	
	}
}

package br.com.aulaJava;

import java.util.HashSet;
import java.util.Set;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa pessoaSemArgumento = new Pessoa();

		//Pessoa pessoaId = new Pessoa(1);
	
	//	Pessoa pessoaCompleta = new Pessoa(1, "Ivoneide" , "Araci Bahia");
		
		//System.out.println("Conteúdo de Pessoa: " + pessoaCompleta);
		
		//testarHashCode();
		
		testarUsoHeranca();
	}
	
	private static void testarUsoHeranca() {
		System.out.println("PESSOA FÍSICA --");
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Gabriel");
		pessoaFisica.setSenha("112");
		pessoaFisica.setCpf("111111111");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Cpf: " + pessoaFisica.getCpf());
		System.out.println("Senha: " + pessoaFisica.getSenha());
		
		System.out.println("PESSOA JURIDICA --");
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Hospital A");
		pessoaJuridica.setCnpj("00.0575/2225-52");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
	}
	
	private static void testarHashCode() {
		Set<Pessoa> pessoa= recuperarPessoa();
		Pessoa pessoaPesquisa = new Pessoa(1);
		boolean existeEstaPessoa =  pessoa.contains(pessoaPesquisa);
		System.out.println("Pessoas encontradas? " + existeEstaPessoa);
	}
	
	private static Set<Pessoa> recuperarPessoa(){
		Pessoa pessoaCompleta1 = new Pessoa(1, "Ivoneide" , "Araci Bahia");
		Pessoa pessoaCompleta2 = new Pessoa(2, "Antonio" , "Araci Bahia");
		Pessoa pessoaCompleta3 = new Pessoa(3, "Ivo" , "Araci Bahia");
		
		Set<Pessoa> pessoas = new HashSet<Pessoa>();
		pessoas.add(pessoaCompleta1);
		pessoas.add(pessoaCompleta2);
		pessoas.add(pessoaCompleta3);
		return pessoas;
	}

}

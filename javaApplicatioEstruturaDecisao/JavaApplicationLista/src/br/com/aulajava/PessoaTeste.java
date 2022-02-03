package br.com.aulajava;

import java.util.ArrayList;
import java.util.List;

public class PessoaTeste {

	private static List<Pessoa> pessoaList = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		adicionarItensLista();
		listarIntesLista();
		pesquisarItemLista(2);
		excluirItemLista(2);
		listarIntesLista();
	}
	
	private static void adicionarItensLista() {
		System.out.println("");
		Pessoa pessoaA = new Pessoa();
		Pessoa pessoaB = new Pessoa();
		
		pessoaA.setId(1);
		pessoaA.setNome("Pedro");
		pessoaA.setEndereco("Rua das Flores, 100");
		pessoaList.add(pessoaA);
		
		pessoaB.setId(2);
		pessoaB.setNome("Maria");
		pessoaB.setEndereco("Rua dis Andrades, 250");
		pessoaList.add(pessoaB);
		System.out.println("Processo de INSERÇÃO na lista executado com sucesso...");
	}
	
	private static void listarIntesLista() {
		System.out.println("");
		for(int i = 0; i < pessoaList.size(); i++) {
			System.out.println("Id: " + pessoaList.get(i).getId() + " Nome: " + pessoaList.get(i).getNome() + " Endereço: " + pessoaList.get(i).getEndereco() );
		}
		System.out.println("Processo de Leitura na lista executado com sucesso...");
	}
	
	private static Integer pesquisarItemLista(int idPessoa) {
		System.out.println("");
		Integer idReturn = null;
		for(int i = 0; i < pessoaList.size(); i++) {
			if(pessoaList.get(i).getId() == idPessoa) {
			 System.out.println("Id: " + pessoaList.get(i).getId() + " Nome: " + pessoaList.get(i).getNome() + " Endereço: " + pessoaList.get(i).getEndereco() );
			 idReturn = i;
			}
		}
		System.out.println("Processo de Pesquisa na lista executado com sucesso...");
		return idReturn;
	}
	
	private static void excluirItemLista(int idPessoa) {
		Integer idTemList = pesquisarItemLista(idPessoa);
		if(idTemList != null) {
			pessoaList.remove(idTemList.intValue());
			System.out.println("Pessoa excluida com sucesso");
		}
	}
	
}

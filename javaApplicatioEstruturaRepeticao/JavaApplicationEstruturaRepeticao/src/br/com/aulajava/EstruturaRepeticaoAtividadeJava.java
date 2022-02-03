package br.com.aulajava;

import java.util.Scanner;

public class EstruturaRepeticaoAtividadeJava {

	public static void main(String[] args) {
		atividade7();
		//atividade6();	
		//tabuadaAtividade5();
		//somatorioAtividade4();
	}
	
	private static void atividade7() {
		double salario, mediaFilhos = 0, mediaSalario = 0, maiorSalario = 0;
		int cont = 0, filhos, salMenor = 0; 
		String decisao; 
		Scanner sc = new Scanner(System.in);
		
		do {
			cont++;
			System.out.printf("---- HABITANTE %d -----\n" , cont);
			System.out.printf("Qual Salário R$: ");
			salario = sc.nextDouble();
			if(salario > maiorSalario) {
				maiorSalario = salario; 
			}
			if(salario < 1500) {
				salMenor++; 
			}
			System.out.printf("Quantidade de Filhos: ");
			filhos = sc.nextInt();
			System.out.printf("Informe [s] para repetir ou [n] para sair: " );
			decisao = sc.next();	
			mediaFilhos += filhos;
			mediaSalario += salario;
		}while(decisao.equals("s"));
		
		System.out.println("============= RESULTADO DA PESQUISA ==============");
		System.out.println("Quantidade de habitantes: " + (cont));
		System.out.println("Média de filhos por habitantes: " + (mediaFilhos/cont));
		System.out.printf("Média salário: %.2f \n" ,mediaSalario/cont );
		System.out.println("Quantidade de Pessoas com salario menor que 1500: " +salMenor);
		System.out.println("Maior salário informado: " + maiorSalario);
	}
	
	private static void atividade6() {
		double valor, valorAtualizado;
		int quantidadeParcelas = 0; 
		String decisao; 
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("------------INICIO DA OPERAÇÃO------------");
			System.out.printf("Infome o valor da compra R$: ");
			valor = sc.nextDouble();
			do {
				System.out.printf("Informe a quantidade de parcelas: ");
				quantidadeParcelas = sc.nextInt();
				if(quantidadeParcelas <= 5) {
					 valorAtualizado = (0.05 * valor) + valor;
				}else {
					 valorAtualizado = (0.1 * valor) + valor;
				}
			}while( quantidadeParcelas > 12 || quantidadeParcelas < 2);
			
			System.out.println("----------RESULTADO--------------");
			System.out.printf("Valor da compra R$: %.2f \n" , valor);
			System.out.println("--------------PARCELAS----------------");
			System.out.printf("Numero de parcelas: %d \n" ,quantidadeParcelas);
			System.out.printf("Valor das parcelas: %.2f \n" ,valorAtualizado/quantidadeParcelas);
			if(quantidadeParcelas <= 5) {
				System.out.println("Taxa de juros aplicado: 5%");
				System.out.printf("Valor do Juros R$ %.2f \n" , (0.05 * valor) );
				System.out.printf("Valor total R$ %.2f \n" , (0.05 * valor) + valor );
			}else {
				System.out.println("Taxa de juros aplicado: 10%");
				System.out.printf("Valor do Juros R$ %.2f \n" , (0.1 * valor) );
				System.out.printf("Valor total R$ %.2f \n" , (0.1 * valor) + valor );
			}
			System.out.println("--------- FIM DA OPERAÇÃO -----------");
			System.out.printf("Informe [s] para repetir ou [n] para sair: " );
			decisao = sc.next();
		}while(decisao.equals("s"));
	}
	
	
	private static void tabuadaAtividade5() {
		int numero ;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Qual tabuada deseja imprimir: ");
		numero = sc.nextInt();
 		for(int i = 0; i <= 10; i++) {
 			System.out.printf("%d x %d = %d \n" ,numero, i, numero*i);
 		}
	}
	
	private static void somatorioAtividade4() {
		double valor = 0 , contador = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Digite um valor, ou [-1] para sair : " );
			valor = sc.nextDouble();
			if(valor != -1) {
				contador += valor;
			}
		}while(valor != -1);
		
		System.out.println("Soma dos valores informados: "  + contador);
	}

}

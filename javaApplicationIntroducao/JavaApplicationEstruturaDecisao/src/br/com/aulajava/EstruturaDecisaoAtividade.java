package br.com.aulajava;

import java.util.Scanner;

public class EstruturaDecisaoAtividade {

	public static void main(String[] args) {
		
		calssificaNadador();
		
		//qualMaior();
		
		
		/* Atividade 6 
		 * 
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digiti um numero inteiro: ");
		numero = sc.nextInt();
		imparOuPar(numero);
		*/
	}
	
	private static void calssificaNadador() {
		int idade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		switch (idade) {
		case 5,6,7: {
			System.out.println("infantil A");
			break;
		}
		case 8,9,10: {
			System.out.println("infantil B");
			break;
		}
		case 11,12,13: {
			System.out.println("juvenil A");
			break;
		}
		case 14,15,16,17: {
			System.out.println("juvenil B");
			break;
		} 
		case 18,19,20,21,22,23,24,25: {
			System.out.println("adulto");
			break;
		}
		default:
			System.out.println("idade fora da faixa et�ria");
		}
		sc.close();
	}
	
	private static void qualMaior() {
		int num1, num2; 
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um n�mero inteiro A: ");
		num1 = sc.nextInt();
		System.out.printf("Digite um n�mero inteiro B: ");
		num2 = sc.nextInt();
		if(num1 > num2) {
			System.out.printf("A � o maior n�mero");
		}else if(num1 < num2) {
			System.out.printf("B � o maior n�mero");
		}else {
			System.out.println("Os n�meros s�o iguais");
		}
	}
	
	private static void imparOuPar(int numero) {
		if(numero % 2 == 0) {
			System.out.println("O n�mero � Par ");
		}else {
			System.out.println("O n�mero � impar ");
		}
	}
	
}

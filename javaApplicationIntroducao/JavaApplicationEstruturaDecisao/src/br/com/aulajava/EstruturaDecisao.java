package br.com.aulajava;

import java.util.Scanner;

public class EstruturaDecisao {

	public static void main(String[] args) {
		testeSwintchCase();
		// processarNotaAninhamento();
		// processarNotaComposta2();
		// processarNotaComposta();
		// processarNotaSimples();
	}

	private static void testeSwintchCase() {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 4 ");
		numero = sc.nextInt();
		switch (numero) {
		case 1: {
			System.out.println("Voce digitou numero 1");
			break;
		}
		case 2: {
			System.out.println("Voce digitou numero 2");
			break;
		}
		case 3: {
			System.out.println("Voce digitou numero 3");
			break;
		}
		case 4: {
			System.out.println("Voce digitou numero 4");
			break;
		}
		default:
			System.out.println("Numero invalido");
		}
		sc.close();
	}

	private static void processarNotaAninhamento() {
		double a, b, media;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a nota A: ");
		a = sc.nextDouble();
		System.out.printf("Digite a nota B: ");
		b = sc.nextDouble();
		media = (a + b) / 2;
		System.out.printf("A média do aluno foi: %.1f ", media);
		if (media >= 7) {
			System.out.println();
			System.out.println("Parabéns! Você foi APROVADO");
			if (media == 10) {
				System.out.println("Parabéns voce tirou nota máxima");
			}
		} else if (media <= 4) {
			System.out.println();
			System.out.println("Atenção! Você foi reprovado");
		} else {
			System.out.println();
			System.out.println("Atenção! Você ficou em recuperação");
		}
		sc.close();
	}

	private static void processarNotaComposta2() {
		double a, b, media;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a nota A: ");
		a = sc.nextDouble();
		System.out.printf("Digite a nota B: ");
		b = sc.nextDouble();
		media = (a + b) / 2;
		System.out.printf("A média do aluno foi: %.1f ", media);
		if (media >= 7) {
			System.out.println();
			System.out.println("Parabéns! Você foi APROVADO");
		} else if (media <= 4) {
			System.out.println();
			System.out.println("Atenção! Você foi reprovado");
		} else {
			System.out.println();
			System.out.println("Atenção! Você ficou em recuperação");
		}
		sc.close();
	}

	private static void processarNotaComposta() {
		double a, b, media;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a nota A: ");
		a = sc.nextDouble();
		System.out.printf("Digite a nota B: ");
		b = sc.nextDouble();
		media = (a + b) / 2;
		System.out.printf("A média do aluno foi: %.1f ", media);
		if (media >= 7) {
			System.out.println();
			System.out.println("Parabéns! Você foi APROVADO");
		} else {
			System.out.println();
			System.out.println("Atenção! Você foi reprovado");
		}
		sc.close();
	}

	private static void processarNotaSimples() { // Simples
		double a, b, media;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a nota A: ");
		a = sc.nextDouble();
		System.out.printf("Digite a nota B: ");
		b = sc.nextDouble();
		media = (a + b) / 2;
		System.out.printf("A média do aluno foi: %.1f ", media);
		if (media >= 7) {
			System.out.println();
			System.out.println("Parabéns! Você foi APROVADO");
		}
		sc.close();
	}
}

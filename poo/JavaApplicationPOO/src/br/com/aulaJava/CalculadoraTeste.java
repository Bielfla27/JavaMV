package br.com.aulaJava;

public class CalculadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executarAtividade3();

	}
	
	private static void executarAtividade3() {
		Calculadora calcSoma = new Calculadora();
		double x = 1.5;
		double y = 2.5;
		System.out.println("Resultado double: " + calcSoma.soma(x, y));
		int a = 1;
		int b = 2;
		System.out.println("Resultado int : " + calcSoma.soma(a, b));
	}
}

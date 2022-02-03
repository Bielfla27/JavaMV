package br.com.aulajava;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		forAtividade(); 
		//doWhileAtividade();
		//whileAtividadeUm();
		
	}
	
	private static void forAtividade() {
		for(int i = 0; i < 5; i++) {
			System.out.println("O valor de x é = " + i);
		}
	}

	private static void doWhileAtividade() {
		int i = 0;
		do{
			System.out.println("O valor de x é = " + i);
			i++; 
		}while(i < 5);
	}
	
	private static void whileAtividadeUm() {
		int i = 0;
		while(i < 5) {
			System.out.println("O valor de x é = " + i);
			i++; 
		}
	}
}

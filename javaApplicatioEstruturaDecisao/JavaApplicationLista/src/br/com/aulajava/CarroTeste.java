package br.com.aulajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarroTeste {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Carro> Carrolist = new ArrayList<Carro>();
	private static String decisao;
	private static int idParametro;
	
	public static void main(String[] args) {
		menu();
	}
	
	private static void listarCarros() {
		Carro car = new Carro();
		System.out.println("");
		System.out.println("INICIALIZANDO PROCESSO DE LEITURA DA LISTA ");
		for(int i = 0; i < Carrolist.size(); i++) {
			System.out.println("Id: " + Carrolist.get(i).getId() + " Marca: " + Carrolist.get(i).getMarca() + " Modelo: " + Carrolist.get(i).getModelo() );
		}
		System.out.println("FIM DA LEITURA ------- ");
		System.out.printf("Retornar ao menu principal ? Informe [s] para sim ou [n] para não: ");
		decisao = sc.next();
		if(decisao.equals("s")) {
			menu();
		}
		decisao = null; 
	}
	
	private static void inserirCarro() {
		
		String  marca, modelo;
		int id;
		
		do {
			Carro car = new Carro();
			System.out.println("");
			System.out.printf("ID: ");
			id = sc.nextInt();
			car.setId(id);
			System.out.printf("Marca: ");
			marca = sc.next();
			car.setMarca(marca);
			System.out.printf("Modelo: ");
			modelo = sc.next();
			car.setModelo(modelo);
			System.out.printf("Continuar inserindo ? Informe [s] para sim ou [n] para não: ");
			decisao= sc.next();
			Carrolist.add(car);
		}while(decisao.equals("s"));
		decisao = null; 
		System.out.printf("Retornar ao menu principal ? Informe [s] para sim ou [n] para não: ");
		decisao= sc.next();
		if(decisao.equals("s")) {
			decisao = null; 
			menu();			
		}else {
			System.out.println("Programa finalizado com sucesso.");
		}
	}
	
	private static int pesquisarCarro(int idCar) {
		int idReturn = -999; 
		for(int i = 0; i < Carrolist.size(); i++) {
			if(Carrolist.get(i).getId() == idCar) {
				System.out.println("Id: " + Carrolist.get(i).getId() + " Marca: " + Carrolist.get(i).getMarca() + " Modelo: " + Carrolist.get(i).getModelo() );
				idReturn = idCar;
			}
		}
		return idReturn;
	}
	
	private static void excluirCarro(int idCar) {
		int idList = pesquisarCarro(idCar);
		if(idList != -999) {
			Carrolist.remove(idCar-1);
			System.out.println("Pessoa excluida com sucesso");
		}
		System.out.printf("Retornar ao menu principal ? Informe [s] para sim ou [n] para não: ");
		decisao = sc.next();
		if(decisao.equals("s")) {
			decisao = null; 
			menu();			
		}else {
			System.out.println("Programa finalizado com sucesso.");
		}
	}
	
	private static void menu() {
		
		int opc;
		System.out.println("");
		System.out.println("1: Inserir");
		System.out.println("2: Listar");
		System.out.println("3: Pesquisar");
		System.out.println("4: Excluir");
		System.out.printf("Escolha uma opcão: ");
		opc = sc.nextInt();
		
		switch (opc) {
		case 1: {
			inserirCarro();
			break;
		}case 2: {
			listarCarros();
			break;
		}case 3: {
			System.out.println("");
			System.out.printf("Informe um id do Carro: ");
			idParametro = sc.nextInt();
			pesquisarCarro(idParametro);
			System.out.printf("Retornar ao menu principal ? Informe [s] para sim ou [n] para não: ");
			decisao = sc.next();
			if(decisao.equals("s")) {
				decisao = null; 
				menu();			
			}else {
				System.out.println("Programa finalizado com sucesso.");
			}
			break;
		}case 4: {
			System.out.println("");
			System.out.printf("Informe um id do Carro: ");
			idParametro = sc.nextInt();
			excluirCarro(idParametro);
			break;
		}default:
			System.out.println("Opcão invalida !!");
		}
	}
}

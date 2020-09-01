package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		double dinheiroemconta = 500;
		double dinheirosolicitado;
				
		System.out.println("Bem vindo ao Banco");
		
		do {
		
		System.out.println("");	
		System.out.println("");
		System.out.println("Escolha uma opção: ");
		System.out.println("1---Saque");
		System.out.println("2---Saldo");
		System.out.println("3---Sair");

		opcao = entrada.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Saque selecionado");
			
			System.out.println("Quanto você deseja sacar? ");
			dinheirosolicitado = entrada.nextDouble();
			
			if(dinheirosolicitado<=dinheiroemconta) {
				
				if(dinheirosolicitado>=10) {
					
				System.out.println("Saque aprovado");
				dinheiroemconta = dinheiroemconta - dinheirosolicitado;
			
			} else {
				System.out.println("Saque não aprovado. Valor mínimo de R$ 10,00");
			}
			} else {
				System.out.println("Saque não aprovado. Saldo insuficiente.");
			}
			System.out.printf("Saldo disponível: %.2f", dinheiroemconta);
			break;
		case 2:
			System.out.println("Saldo selecionado");
			System.out.printf("Saldo disponível: %.2f", dinheiroemconta);
			break;
		case 3:
			System.out.println("Saindo...");
			
		}	
		}while(opcao<3);
	}

}

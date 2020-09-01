package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {
	
	
	double valordisponivel;
	Scanner entrada = new Scanner(System.in);

	void recebeSaldo(double saldoinicial) {
	valordisponivel = saldoinicial;
	}
	
	
	void login() {
		String login, logincadastrado, senha, senhacadastrada;
		logincadastrado = "rafael";
		senhacadastrada = "abc123";
		
		System.out.println("Entre com seu Login: ");
		login  = entrada.nextLine();
		System.out.println("Entre com sua senha: ");
		senha = entrada.nextLine();
		
		while(! logincadastrado.equals(login) || ! senhacadastrada.equals(senha)) {
			System.out.println("Entre com seu Login: ");
			login  = entrada.nextLine();
			System.out.println("Entre com sua senha: ");
			senha = entrada.nextLine();
		
	}
	iniciar();
	}

	
	void iniciar() {
		int opcao;
		do {
			exibeMenu();
			opcao = entrada.nextInt();
			escolheOpcao(opcao);
		}while(opcao!=4);
	}
	
	void exibeMenu() {
		System.out.println("Olá, seja bem-vindo!");
		System.out.println("Escolha uma opção: ");
		System.out.println("1---Saque");
		System.out.println("2---Saldo");
		System.out.println("3---Depósito");
		System.out.println("4---Sair");
		
	}
	
	void saque() {
		double valordesejado;
		
		System.out.println("Quanto você deseja sacar: ");
		valordesejado = entrada.nextDouble();
		
		if(valordesejado<=valordisponivel) {
		System.out.println("Saque autorizado");
		valordisponivel = valordisponivel - valordesejado;
		}else {
		System.out.println("Saque não autorizado");
	}
	}
	
	void saldo() {
		System.out.println("Saldo: "+valordisponivel);
	}
	
	void deposito() {
		System.out.println("Qual o valor do depósito: ");
		double valordepositado = entrada.nextDouble();
		valordisponivel = valordisponivel + valordepositado;
	}
	
	void escolheOpcao(int opcao) {
		switch(opcao) {
		case 1:
			saque();
			break;
			
		case 2:
			saldo();
			break;
			
		case 3:
			deposito();
			break;
			
		case 4:
			System.out.println("Sair");
		}
	}
	
}

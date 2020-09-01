package segundoexemploswitch;

import java.util.Scanner;

public class SegundoExemploSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int emconta = 500;
		int saque;
		
		System.out.println("Olá! Seja bem-vindo!");
		System.out.println("Qual serviço você deseja? Digite 1 para saque e 2 para saldo: ");
		
		int escolha = entrada.nextInt();
		
		switch (escolha) {
		
		case 1:
			System.out.printf("Digite o valor do saque: R$ ");
			saque = entrada.nextInt();
			
			if (saque<=emconta) {
				if(saque>10) {
					emconta = emconta-saque;
					System.out.printf("Saque autorizado. Seu saldo é de %d.",emconta);
					}else {
					System.out.print("Valor inválido. Saque mínimo de R$ 10,00.");
				}
				
			}
			break;
		case 2:
			System.out.printf("Seu saldo é de %d.",emconta);
		}
		
	}
}

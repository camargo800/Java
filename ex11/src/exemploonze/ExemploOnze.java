package exemploonze;

import java.util.Scanner;

public class ExemploOnze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		int anoatual;
		int anonasc;
		int idade;
		
		System.out.print("Digite seu nome:");
		nome = entrada.nextLine();
		
		System.out.print("Digite o seu ano de nascimento: ");
		anonasc = entrada.nextInt();
		
		System.out.print("Qual o ano atual: ");
		anoatual = entrada.nextInt();
		
		idade = anoatual-anonasc;
		
		System.out.printf("%s, você tem %d.",nome,idade);
	}

}

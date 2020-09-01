package lista1;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int idade = entrada.nextInt();
		
		//classificação entre vogal e consoante
		
		switch (idade) {
		
		case 0,1,2:
			System.out.println("Sala 1");
		break;
		
		case 3,4,5:
			System.out.println("Sala 2");
		break;
		
		case 6,7,8:
			System.out.println("Sala 3");
		break;
		
		case 9,10:
			System.out.println("Sala 4");
		break;
		
		default:
			System.out.println("Opção inválida!");
		}
	}

	}



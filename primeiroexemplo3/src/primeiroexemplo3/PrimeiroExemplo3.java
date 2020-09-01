package primeiroexemplo3;

import java.util.Scanner;

public class PrimeiroExemplo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um número de 1 a 7: ");
		
		int dia_da_semana = entrada.nextInt();
		
		switch(dia_da_semana) {
		
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		case 4:
			System.out.print("Quarta");
			break;
		case 5:
			System.out.print("Quinta");
			break;
		case 6:
			System.out.print("Sexta");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		default:
			System.out.print("Opção inválida");
		}

	}

}

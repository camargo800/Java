package primeiroexemplo3;

import java.util.Scanner;

public class PrimeiroExemplo3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero de 1 a 7: ");
		
		int dia_da_semana = entrada.nextInt();
		
		switch(dia_da_semana) {
		
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Ter�a");
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
			System.out.print("S�bado");
			break;
		default:
			System.out.print("Op��o inv�lida");
		}

	}

}

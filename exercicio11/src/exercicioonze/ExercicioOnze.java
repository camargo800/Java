package exercicioonze;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double valor;
		
		System.out.println("Positivo, Negativo ou Igual a Zero?");
		
		System.out.printf("Digite um valor: ");
		valor = entrada.nextDouble();
		
		if (valor<0) {
			System.out.print("NEGATIVO");
		} else if (valor>0){
			System.out.print("POSITIVO");
		} else {
			System.out.print("IGUAL A ZERO");
		}

	}

}

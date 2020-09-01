package exerciciodez;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		double blusa1;
		double blusa2;
		
		System.out.printf("Qual o valor da primeira blusa? R$ ");
		blusa1 = entrada.nextDouble();
		System.out.printf("Qual o valor da segunda blusa? R$ ");
		blusa2 = entrada.nextDouble();
		
		if (blusa1<blusa2) {
			System.out.print("A primeira blusa é mais barata.");
		} else {
			System.out.print("A segunda blusa é mais barata.");
		}

	}

}

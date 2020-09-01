package lista1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int n = 1;
				
		System.out.println("Digite um número: ");
		n = entrada.nextInt();
		
		while (n != 0) {
			System.out.println("Digite outro numero: ");
			n = entrada.nextInt();
		}
	}
	

}

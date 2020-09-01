package exemplodez;

import java.util.Scanner; // importa a biblioteca Scanner (entrada de dados)

public class ExemploDez {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in); // criar a variável que recebe todas as entradas
		int numero1; // declaro primeiro tipo da variável e nome dela
		int numero2;
		int soma;
		System.out.println("Digite o primeiro número: "); // input para perguntar para o usuário
		numero1 = entrada.nextInt(); //recebe os dados do usuário e grava na variável
		
		System.out.println("Digite o segundo número: "); // input para perguntar para o usuário
		numero2 = entrada.nextInt(); // recebe os dados do usuário e grava na variável
		
		soma = numero1+numero2; // manipulação matemática das variáveis
		
		System.out.printf("A soma de %d mais %d é igual a %d",numero1,numero2,soma);
		
	}

}

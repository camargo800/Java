package exemplodez;

import java.util.Scanner; // importa a biblioteca Scanner (entrada de dados)

public class ExemploDez {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in); // criar a vari�vel que recebe todas as entradas
		int numero1; // declaro primeiro tipo da vari�vel e nome dela
		int numero2;
		int soma;
		System.out.println("Digite o primeiro n�mero: "); // input para perguntar para o usu�rio
		numero1 = entrada.nextInt(); //recebe os dados do usu�rio e grava na vari�vel
		
		System.out.println("Digite o segundo n�mero: "); // input para perguntar para o usu�rio
		numero2 = entrada.nextInt(); // recebe os dados do usu�rio e grava na vari�vel
		
		soma = numero1+numero2; // manipula��o matem�tica das vari�veis
		
		System.out.printf("A soma de %d mais %d � igual a %d",numero1,numero2,soma);
		
	}

}

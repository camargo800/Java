package exercícionove;

import java.util.Scanner;

public class ExercícioNove {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome = "";
		double nota1;
		double nota2;
		double media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1+nota2) / 2;
		
		if (media >= 7) {
			System.out.printf("%s, você obteve media igual a %.1f e está APROVADO!",nome,media);
		} else {
			System.out.printf("%s, você obteve media igual a %.1f e está REPROVADO.",nome,media);
		}
	}

}

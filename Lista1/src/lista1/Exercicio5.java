package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4, media;
		String sexo;
		
		System.out.println("Digite M para masculino e F para feminino: ");
		sexo = entrada.nextLine();
		System.out.println("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = entrada.nextDouble();
		System.out.println("Nota 3: ");
		nota3 = entrada.nextDouble();
		System.out.println("Nota 4: ");
		nota4 = entrada.nextDouble();
		
			
		media = (nota1+nota2+nota3+nota4) / 4;
		
		switch (sexo) {
		
		case "M","m":
			System.out.println("Masculino");
			if (media>=6) {
				System.out.println("Caro aluno, voc� est� aprovado!");
			}else if (media>=4.5 && media <6) {
				System.out.println("Caro aluno, voc� est� de recupera��o!");
			}else {
				System.out.println("Caro aluno, voc� est� reprovado.");
			}
				
			break;
			
		case "F","f":
			System.out.println("Feminino");
			if (media>=6) {
				System.out.println("Cara aluna, voc� est� aprovada!");
			}else if (media>=4.5 && media <6) {
				System.out.println("Cara aluna, voc� est� de recupera��o!");
			}else {
				System.out.println("Cara aluna, voc� est� reprovada.");
		}
			break;
			
		default:
			System.out.println("Op��o inv�lida");
		}
		
	}

}

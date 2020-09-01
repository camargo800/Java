package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		
		String letra = entrada.nextLine();
		
		//classificação entre vogal e consoante
		
		switch (letra) {
		
		case "a","e","i","o","u","A","E","I","O","U":
			System.out.println("Vogal");
		break;
		
		case "b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","w","x","y","z","B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z":
			System.out.println("Consoante");
		}
	}

}

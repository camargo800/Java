package primeiroexemploswitch;

import java.util.Scanner;

public class PrimeiroExemploSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Vogal ou Consoante? Digite a letra: ");
		
		String vogcon = entrada.nextLine();
		
		switch (vogcon) {
		
		case "A","a","E","e","I","i","O","o","U","u":
			System.out.print("Vogal");
			break;
		case "B","b","C","c","D","d","F","f","G","g","H","h","J","j","K","k","L","l","M","m","N","n","P","p","Q","q","R","r","S","s","T","t","W","w","X","x","Y","y","Z","z":
			System.out.print("Consoante");
			break;
		default:
			System.out.print("Opção inválida.");
		}
	}

}

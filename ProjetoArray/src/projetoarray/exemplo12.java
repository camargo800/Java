package projetoarray;

import java.util.Scanner;
import java.util.Arrays;

public class exemplo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o tamanho do array desejado? ");
		numero = entrada.nextInt();
		
		int[] meusnumeros = new int [numero];
		
		System.out.println("Entre com os valores do array: ");
		
		
		for(int i = 0; i<meusnumeros.length;i++) {
			meusnumeros[i] = entrada.nextInt();
		}
		
		Arrays.sort(meusnumeros);
		System.out.println("Valores do vetor: "+Arrays.toString(meusnumeros));
		
	}

}

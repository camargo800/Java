package projetoarray;

import java.util.Scanner;
import java.util.Arrays;

public class exemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nomes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos nomes? ");
		nomes = entrada.nextInt();
		
		String[] meusnomes = new String[nomes];
		
		System.out.println("Quais os nomes desejados? ");
		
		for(int i = 0; i<meusnomes.length;i++) {
			meusnomes[i] = entrada.nextLine();
		}
		
		Arrays.sort(meusnomes);
		System.out.println("Valores do vetor: "+Arrays.toString(meusnomes));
		
	}

}

package projetoarray;

import java.util.Arrays;

public class exemplo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] meuarray = {25,14,16,74,26,37,51,80,9,11};
		int[] novoarray = new int[10]; //uma das manieras de definir um array
		
		for (int i = 0; i<meuarray.length; i++) { //faz a cópia de um vetor para outro
			novoarray[i] = meuarray[i];
		}
		System.out.println("Novo array: "+Arrays.toString(novoarray));
	}

}

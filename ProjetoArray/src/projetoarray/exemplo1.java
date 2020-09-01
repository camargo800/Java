package projetoarray;

import java.util.Arrays;

public class exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] carros = {"Volvo","BMW","Ford","Tesla"};
		//carros[0] = "Ferrari";
		//System.out.println(carros[0]);
		
		//for (int i = 0; i<carros.length; i++) {
			//System.out.println(carros[i]);
		//for (String elemento: carros) {
			//System.out.println(elemento);
		//}
		String[] diassemana = {"Segunda","Terça","Quarta","Quinta","Sexta"};
		//for (String elemento: diassemana) {
			//System.out.println(elemento);
		//}
		
		//organizar em ordem alfabética ou organizar
				// números em ordem crescente
		Arrays.sort(diassemana);
		
		System.out.println("Dias da semana: "+Arrays.toString(diassemana));
		
	}

}

package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite uma idade: ");
        int idade = entrada.nextInt();
        
        if(idade<18) {
            
            System.out.println("Menor de idade");
            
        } else if(idade>=18 && idade<65) {
            
            
            System.out.println("Maior de idade");
            
        }else {
            
            System.out.println("Idoso");
        }
    }
}
 
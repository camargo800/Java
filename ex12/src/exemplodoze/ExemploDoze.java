package exemplodoze;

import java.util.Scanner;

public class ExemploDoze {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = entrada.nextInt();
		
		
		if (n1>n2) {
		System.out.printf("O primeiro n�mero %d � maior que o segundo n�mero %d",n1,n2);
		}else {
		System.out.printf("O segundo n�mero %d � maior que o primeiro n�mero %d",n2,n1);
		}

	}

}

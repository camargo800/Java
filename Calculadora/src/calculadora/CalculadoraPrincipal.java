package calculadora;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		Calculadora calc = new Calculadora();
		
		int n1;
		int n2;
		
		System.out.println("entre com o primeiro numero: ");
		n1 = entrada.nextInt();
		System.out.println("entre com o segundo numero: ");
		n2 = entrada.nextInt();
		calc.soma(n1, n2);
		
		calc.subtração(6, 2);
		calc.divisão(3, 7);
		calc.multiplicação(4, 9);
		
	}

}

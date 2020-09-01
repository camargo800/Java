package calculadora;

import java.util.Scanner;

public class CalculadoraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		Calculadora calc = new Calculadora();
		
		int oper = 0;
		while(oper != 5) {
		
		System.out.println("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		
		System.out.println("1+, 2-, 3*, 4/");
		oper = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		
		switch(oper) {
		case 1:
			int valorsoma = calc.soma(n1, n2);
			System.out.println("Soma: "+valorsoma);
			break;
			
		case 2:
			int valorsubtracao = calc.subtracao(n1, n2);
			System.out.println("Subtração: "+valorsubtracao);
			break;
			
		case 3:	
			int valormultiplicacao = calc.multiplicacao(n1, n2);
			System.out.println("Multiplicação: "+valormultiplicacao);
			break;
		
		case 4:
			int valordivisao = calc.divisao(n1,n2);
			System.out.println("Divisão: "+valordivisao);
		
		}
	
	}

}
}

package orienta��oaulaseis;

import java.util.Scanner; //importa a biblioteca Scanner

public class AnimalPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Animal gato1 = new Animal();
		Animal cachorro1 = new Animal();
		//cria��o do objeto
		//Animal animal1 = new Animal();
		//1-nome da classe onde os atributos est�o
		//2-nome do objeto
		//3-permite a manipula��o do objeto / instanciar o objeto
		//4-constru��o da classe
		
		System.out.println("Nome do gato: ");
		gato1.nome = entrada.nextLine();
		//System.out.println("Nome do animal: ");
		//animal1.nome = entrada.nextLine();
		
		System.out.println("Ra�a do gato: ");
		gato1.ra�a = entrada.nextLine();
		//System.out.println("Ra�a do animal: ");
		//animal1.ra�a = entrada.nextLine();
		
		System.out.println("Cor do gato: ");
		gato1.color = entrada.nextLine();
		//System.out.println("Cor do animal: ");
		//animal1.color = entrada.nextLine();
		
		System.out.println("Valor do gato: R$ ");
		gato1.valor = entrada.nextInt();
		//System.out.println("Valor do animal: ");
		//animal1.valor = entrada.nextInt();
		
		gato1.dadosGato();
		//animal1.dadosAnimal(); // chamar o m�todo dadosAnimal
	}

}

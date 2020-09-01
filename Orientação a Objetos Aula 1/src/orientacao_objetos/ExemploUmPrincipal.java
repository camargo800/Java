package orientacao_objetos;

public class ExemploUmPrincipal {

	public static void main(String[] args) {
		
		ExemploUm carro = new ExemploUm();
		//ExemploUm - nome da classe
		//carro - nome do objeto
		// new - criar o objeto
		//ExemploUm(); - construir a classe
		
		carro.marca = "Chevrolet"; //características dos atributos
		carro.color = "preto";
		carro.ano = 2017;
		carro.modelo = "Ônix";
				
		System.out.printf("Marca do carro: %s, modelo %s, cor %s, ano %d",carro.marca,carro.modelo,carro.color,carro.ano);
	}

}

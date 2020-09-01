package orientacao_objetos;

public class CanetaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta caneta1 = new Caneta();
		Caneta caneta2 = new Caneta();
		
		caneta1.marca = "bic";
		caneta1.preco = 1.50;
		caneta1.color = "vermelha";
		
		caneta2.marca = "bic";
		caneta2.preco = 1.00;
		caneta2.color = "azul";
		
		caneta1.canetaDados();
		caneta2.canetaDados();
	}

}

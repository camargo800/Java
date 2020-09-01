package orientacao_objetos;

public class Casa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casa Casa1 = new Casa();
		
		Casa1.cor = "amarela";
		Casa1.metroq = 110;
		Casa1.endereco = "Rua Tupiniquim";
				
		System.out.printf("Cor da casa: %s, Metros quadrados: %d e Endereço: %s",Casa1.cor,Casa1.metroq,Casa1.endereco);
		
	}

}

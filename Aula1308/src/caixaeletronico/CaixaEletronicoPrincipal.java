package caixaeletronico;

public class CaixaEletronicoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double saldoinicial = 500;
		
		CaixaEletronico minhaConta = new CaixaEletronico();
		
		minhaConta.recebeSaldo(saldoinicial);
		minhaConta.login();
		
	}

}

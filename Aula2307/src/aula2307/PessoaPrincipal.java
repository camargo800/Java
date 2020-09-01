package aula2307;

public class PessoaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//criação do objeto pessoa1
		Pessoa pessoa1 = new Pessoa();
		Mulher mulher1 = new Mulher();
		Homem homem1 = new Homem();
		
		pessoa1.nome = "Rafael";
		pessoa1.sexo = "Masculino";
		pessoa1.altura = 1.75;
		pessoa1.peso = 100;
		mulher1.mulher = "Rosane";
		homem1.homem = "Rafael";
		
		pessoa1.dadosPessoa();
		mulher1.dadosMulher();
		homem1.dadosHomem();
		
	}

}

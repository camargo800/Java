package orientacao_objetos;

public class LivroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro1 = new Livro(); //criação do objeto
		Livro livro2 = new Livro();
		
		livro1.nome = "Algorítimos";
		livro1.descricao = "Livro de Programação";
		livro1.dataPub = "16/07/20";
		livro1.autor = "desconhecido";
		livro1.isbn = 514515;
		livro1.preco = 54.50;
		
		System.out.printf("Nome do livro: %s, descrição: %s, data de publicação: %s, autor: %s, isbn: %d, preço: %.2f",livro1.nome,livro1.descricao,livro1.dataPub,livro1.autor,livro1.isbn,livro1.preco);
		System.out.println("");
		
		livro2.nome = "Algorítimos";
		livro2.descricao = "Programação para iniciantes";
		livro2.dataPub = "16/12/13";
		livro2.autor = "desconhecido";
		livro2.isbn = 514912;
		livro2.preco = 20.50;
		
		System.out.printf("Nome do livro: %s, descrição: %s, data de publicação: %s, autor: %s, isbn: %d, preço: %.2f",livro2.nome,livro2.descricao,livro2.dataPub,livro2.autor,livro2.isbn,livro2.preco);
	}

}

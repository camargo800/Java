package orientacao_objetos;

public class UsuarioPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		usuario1.nome = "Rafael";
		usuario1.cpf = 02235410233;
		usuario1.endereco = "Rua Tupiniquim";
		usuario1.idade = 26;
			
		usuario2.nome = "Rosane";
		usuario2.cpf = 02235410544;
		usuario2.endereco = "Rua Brasil";
		usuario2.idade = 72;
		
		usuario1.usuarioDados();
		usuario2.usuarioDados();
		
		System.out.printf("Usuario 1 = %s e Usuario 2 = %s",usuario1.nome,usuario2.nome);

	}

}

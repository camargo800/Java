package projetoarray;

public class exemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] meusnumeros = {1,2,3,4,5};
		int procurado = 2;
		boolean encontrado = false;
		
		for (int n: meusnumeros) {
			if (n == procurado) {
				encontrado = true;
				break;
			}
		}
		if (encontrado) 
			System.out.println(procurado+" foi encontrado");
		else
			System.out.println(procurado+" não foi encontrado");
			
	}

}

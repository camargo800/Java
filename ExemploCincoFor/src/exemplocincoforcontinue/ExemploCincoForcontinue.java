package exemplocincoforcontinue;

public class ExemploCincoForcontinue {

	public static void main(String[] args) {
		int numero = 100;
        int i;
       
        for(i=0;i<=numero;i++) {
           
        if(i == 50){
        continue;
        }
        System.out.println("Número: "+i);
        }
       
        System.out.print("Fim do programa");


	}

}

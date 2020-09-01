package lista1;

import java.util.Scanner;

public class Exercicio4 {
 
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    String nome;
    int anoatual, anodenascimento, idade;
    
    System.out.println("Qual o seu nome? ");
    nome = entrada.nextLine();
    System.out.println("Ano atual: ");
    anoatual = entrada.nextInt();
    System.out.println("Ano de nascimento: ");
    anodenascimento = entrada.nextInt();
    
    idade = anoatual - anodenascimento;
    
    if (idade<16) {
        System.out.println("Não pode votar");
    } else if (idade>=16 && idade<18){
        System.out.println("Voto facultativo");
    } else if (idade>=18 && idade<65) {
        System.out.println("Voto obrigatório");
    } else {
        System.out.println("Voto facultativo");
    }
        
 
    }
 
}
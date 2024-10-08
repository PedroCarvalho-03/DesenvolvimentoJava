/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class Palavra {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        // Digite a palavra
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();
       
        // Digitos da palavra
        int tamanho = palavra.length();
       
        // Primeira letra
        char primeiraLetra = palavra.charAt(0);

        // Letra central
        char letraCentral;
        if(tamanho % 2 == 0){
            letraCentral = palavra.charAt(tamanho / 2 - 1); // Palavra com tamanho par
        } else {
            letraCentral = palavra.charAt(tamanho / 2); // Palavra com tamanho ímpar
        }

        // Última letra
        char ultimaLetra = palavra.charAt(tamanho - 1);

        // Palavra reversa
        String palavraReversa = new StringBuilder(palavra).reverse().toString();

        // Maiúscula e minúscula
        String palavraMaiuscula = palavra.toUpperCase();
        String palavraMinuscula = palavra.toLowerCase();

        // Resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + tamanho + " dígitos.");
        System.out.println("A primeira letra é: " + primeiraLetra);
        System.out.println("A letra central é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraReversa);
        System.out.println("A palavra toda em maiúscula: " + palavraMaiuscula);
        System.out.println("A palavra toda em minúscula: " + palavraMinuscula);
        
        scanner.close();
    }
}

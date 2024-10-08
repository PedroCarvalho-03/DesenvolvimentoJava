/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100.");

        // Palpite
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("MAIOR");
            } else if (palpite > numeroAleatorio) {
                System.out.println("MENOR");
            }
       //Laço de repetição
        } while (palpite != numeroAleatorio); 

        System.out.println("ACERTOU!");

        scanner.close(); 
    }
}

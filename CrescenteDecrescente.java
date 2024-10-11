/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Random;
import java.util.Arrays;

public class CrescenteDecrescente {
    // Números aleatórios
    public static void main(String args[]) {
        int[] vetor1 = new int[10];
        Random rnd = new Random();

        // Preenche o vetor com números aleatórios 
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = rnd.nextInt(10);    
        }

        // Ordem crescente
        Arrays.sort(vetor1);

        System.out.println("Ordem crescente: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i]);
        }

        // Ordem decrescente
        System.out.println("Ordem decrescente: ");
        for (int i = vetor1.length - 1; i >= 0; i--) {
            System.out.println(vetor1[i]);
        }
    }
}

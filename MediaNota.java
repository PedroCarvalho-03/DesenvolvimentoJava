/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class MediaNota {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0, maiorNota = 0, menorNota = 10;

        // Notas do aluno
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i]; 

            // Maior e menor nota
            if (notas[i] > maiorNota) maiorNota = notas[i];
            if (notas[i] < menorNota) menorNota = notas[i];
        }

        // Cálculo da média
        double media = soma / 5;

        // Resultados
        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média da turma: " + media);

        sc.close();
    }
}

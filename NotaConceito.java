/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Informação da nota
        System.out.print("Informe uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        // Conceito da nota
        String conceito;
        if (nota > 90) {
            conceito = "A";
        } else if (nota > 80) {
            conceito = "B";
        } else if (nota > 70) {
            conceito = "C";
        } else if (nota > 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        // Conceito
        System.out.println("O conceito é: " + conceito);

        sc.close();
    }
}
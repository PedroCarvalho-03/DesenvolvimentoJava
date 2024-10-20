/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;  

public class RegraDeTresSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;

        // Loop principal do programa
        do {
            System.out.println("Cálculo de Regra de Três Simples");

            // Entrada dos valores
            System.out.print("Informe o valor de A : ");
            double a = scanner.nextDouble();

            System.out.print("Informe o valor de B : ");
            double b = scanner.nextDouble();

            System.out.print("Informe o valor de C (exemplo: assim como C está para X): ");
            double c = scanner.nextDouble();

            // Cálculo da regra de três simples: X = (B * C) / A
            double x = (b * c) / a;

            // Exibição do resultado
            System.out.println("Resultado: " + a + " está para " + b + " assim como " + c + " está para " + x);

            // Pergunta se o usuário deseja continuar ou sair
            System.out.print("Deseja fazer outro cálculo? Digite 'S' para continuar ou 'SAIR' para encerrar: ");
            opcao = scanner.next();

        } while (!opcao.equalsIgnoreCase("SAIR")); // Verifica se o usuário digitou 'SAIR'

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

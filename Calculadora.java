/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double V1, V2, Resultado;
        int operacao;

        // Solicitação dos valores
        System.out.println("Digite o primeiro valor: ");
        V1 = scanner.nextDouble();
        System.out.println("Digite o segundo valor: ");
        V2 = scanner.nextDouble();

        // Solicitação da operação
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = scanner.nextInt();

        // Operações com switch
        switch (operacao) {
            case 1:
                Resultado = V1 + V2;
                System.out.println("Resultado da adição: " + Resultado);
                break;
            case 2:
                Resultado = V1 - V2;
                System.out.println("Resultado da subtração: " + Resultado);
                break;
            case 3:
                Resultado = V1 * V2;
                System.out.println("Resultado da multiplicação: " + Resultado);
                break;
            case 4:
                if (V2 != 0) { 
                    Resultado = V1 / V2;
                    System.out.println("Resultado da divisão: " + Resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida. Por favor, escolha entre 1 e 4.");
                break;
        }

        scanner.close();
    }
}

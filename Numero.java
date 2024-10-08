/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class Numero {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
       
        // Verificando se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
       
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        //Verificar se o número é negativo
        if (numero < 0) {
            System.out.println("O número é negativo");
        }
        //Verificar se o número é primo
        if (numero <=1){
            System.out.println("O número" + numero + " não é primo.");
        } else {
            int contadorDivisores = 0 ;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contadorDivisores++;
                }
            }

            if (contadorDivisores ==2) {
                System.out.println("O número" + numero + " é primo.");  
            } else {
                System.out.println("O número" + numero + " não é primo");
            }

        }
        //Calculo da raiz quadrada
           if (numero >= 0) {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
        }
        scanner.close();
    }
}
  
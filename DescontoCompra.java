/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
import java.util.Scanner;

public class DescontoCompra {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
       
        //Valor da compra
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        //porcentagem do desconto
        System.out.println("Informe a procentagem do desconto:");
        double porcentagemDesconto = scanner.nextDouble();

        //Calculo do desconto
        double valorDesconto = valorCompra * (porcentagemDesconto / 100);

        //Valor final
        double valorFinal = valorCompra - valorDesconto;

        //Resultados
        System.out.println("Valor da compra: R$ " +valorCompra);
        System.out.println("Desconto: " + valorDesconto);
        System.out.println("Valor final a pagar: R$ " +valorFinal);

        scanner.close();
    }
}

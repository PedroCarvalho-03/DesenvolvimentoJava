/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
public class DivisaoPor11 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 e 1000 que quando divididos por 11 deixam resto 5:");
        
        for (int i = 1; i <= 1000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}

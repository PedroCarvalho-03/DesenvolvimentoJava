/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/
public class Fibonacci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int aux;

        for(int i = 0; i< 30; i++){
            System.out.println (a); // 1 1 2
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
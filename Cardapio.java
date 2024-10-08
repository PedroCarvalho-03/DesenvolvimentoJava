import java.util.Scanner;

public class Cardapio {
    public static void main (String args[]) {
        
        String pratoA = "Prato A 20R$";
        String pratoB = "Prato B 25R$";
        String pratoC = "Prato C 35R$";
        
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seu prato: A, B ou C");
        String escolha = scanner.nextLine();
        

        if (escolha.equalsIgnoreCase("A")) {
            System.out.println("O cliente escolheu o " + pratoA);
        } else if (escolha.equalsIgnoreCase("B")) {
            System.out.println("O cliente escolheu o " + pratoB);
        } else if (escolha.equalsIgnoreCase("C")) {
            System.out.println("O cliente escolheu o " + pratoC);
        } else {
            System.out.println("Escolha inválida.");
        }
    }
}

import java.util.Scanner;

public class CadastroPessoas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matriz para armazenar pessoas, cada pessoa tem ID, Nome e Data de Nascimento
        String[][] cadastro = new String[10][3];
        int totalPessoas = 0;

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1 - Inserir uma pessoa");
            System.out.println("2 - Alterar dados de uma pessoa");
            System.out.println("3 - Consultar dados de uma pessoa");
            System.out.println("4 - Excluir dados de uma pessoa");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Inserir pessoa
                    if (totalPessoas < 10) {
                        System.out.print("Digite o ID da pessoa: ");
                        String id = scanner.nextLine();

                        System.out.print("Digite o nome da pessoa: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite a data de nascimento da pessoa (dd/mm/yyyy): ");
                        String dataNascimento = scanner.nextLine();

                        cadastro[totalPessoas][0] = id;
                        cadastro[totalPessoas][1] = nome;
                        cadastro[totalPessoas][2] = dataNascimento;
                        totalPessoas++;

                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de cadastros atingido (10 pessoas).");
                    }
                    break;

                case 2:
                    // Alterar dados de uma pessoa
                    System.out.print("Digite o ID da pessoa que deseja alterar: ");
                    String idAlterar = scanner.nextLine();

                    boolean pessoaEncontrada = false;
                    for (int i = 0; i < totalPessoas; i++) {
                        if (cadastro[i][0].equals(idAlterar)) {
                            System.out.print("Digite o novo nome da pessoa: ");
                            String novoNome = scanner.nextLine();

                            System.out.print("Digite a nova data de nascimento (dd/mm/yyyy): ");
                            String novaDataNascimento = scanner.nextLine();

                            cadastro[i][1] = novoNome;
                            cadastro[i][2] = novaDataNascimento;
                            System.out.println("Dados alterados com sucesso!");
                            pessoaEncontrada = true;
                            break;
                        }
                    }
                    if (!pessoaEncontrada) {
                        System.out.println("Pessoa com ID " + idAlterar + " não encontrada.");
                    }
                    break;

                case 3:
                    // Consultar dados de uma pessoa
                    System.out.print("Digite o ID da pessoa que deseja consultar: ");
                    String idConsultar = scanner.nextLine();

                    pessoaEncontrada = false;
                    for (int i = 0; i < totalPessoas; i++) {
                        if (cadastro[i][0].equals(idConsultar)) {
                            System.out.println("ID: " + cadastro[i][0]);
                            System.out.println("Nome: " + cadastro[i][1]);
                            System.out.println("Data de Nascimento: " + cadastro[i][2]);
                            pessoaEncontrada = true;
                            break;
                        }
                    }
                    if (!pessoaEncontrada) {
                        System.out.println("Pessoa com ID " + idConsultar + " não encontrada.");
                    }
                    break;

                case 4:
                    // Excluir dados de uma pessoa
                    System.out.print("Digite o ID da pessoa que deseja excluir: ");
                    String idExcluir = scanner.nextLine();

                    pessoaEncontrada = false;
                    for (int i = 0; i < totalPessoas; i++) {
                        if (cadastro[i][0].equals(idExcluir)) {
                            for (int j = i; j < totalPessoas - 1; j++) {
                                cadastro[j][0] = cadastro[j + 1][0];
                                cadastro[j][1] = cadastro[j + 1][1];
                                cadastro[j][2] = cadastro[j + 1][2];
                            }
                            totalPessoas--;
                            System.out.println("Dados da pessoa excluídos com sucesso!");
                            pessoaEncontrada = true;
                            break;
                        }
                    }
                    if (!pessoaEncontrada) {
                        System.out.println("Pessoa com ID " + idExcluir + " não encontrada.");
                    }
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

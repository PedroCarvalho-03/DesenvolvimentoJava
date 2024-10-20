import java.util.Scanner;
import java.util.Random;

public class JogoDaVelha {
    private static char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static final char JOGADOR = 'X';
    private static final char COMPUTADOR = 'O';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        String opcao;
        do {
            System.out.println("Escolha o nível de dificuldade: 1 - Normal | 2 - Difícil");
            int dificuldade = scanner.nextInt();

            iniciarNovoJogo();

            while (true) {
                imprimirTabuleiro();
                jogadorFazJogada();
                if (verificarVencedor(JOGADOR)) {
                    System.out.println("Você venceu!");
                    break;
                }
                if (verificarEmpate()) {
                    System.out.println("Empate!");
                    break;
                }

                if (dificuldade == 1) {
                    computadorFazJogadaNormal();
                } else {
                    computadorFazJogadaDificil();
                }

                if (verificarVencedor(COMPUTADOR)) {
                    System.out.println("Computador venceu!");
                    break;
                }
                if (verificarEmpate()) {
                    System.out.println("Empate!");
                    break;
                }
            }

            System.out.print("Deseja jogar novamente? (S/N): ");
            opcao = scanner.next();
        } while (opcao.equalsIgnoreCase("S"));
        System.out.println("Fim do jogo.");
    }

    private static void iniciarNovoJogo() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    private static void jogadorFazJogada() {
        int linha, coluna;
        while (true) {
            System.out.print("Digite a linha (1-3): ");
            linha = scanner.nextInt() - 1;
            System.out.print("Digite a coluna (1-3): ");
            coluna = scanner.nextInt() - 1;

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = JOGADOR;
                break;
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }
    }

    private static void computadorFazJogadaNormal() {
        int linha, coluna;
        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (tabuleiro[linha][coluna] != ' ');

        tabuleiro[linha][coluna] = COMPUTADOR;
        System.out.println("Computador jogou.");
    }

    private static void computadorFazJogadaDificil() {
        // Simples lógica de bloqueio ou jogada aleatória
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    tabuleiro[i][j] = COMPUTADOR;
                    if (verificarVencedor(COMPUTADOR)) return;
                    tabuleiro[i][j] = ' ';
                }
            }
        }
        computadorFazJogadaNormal();
    }

    private static boolean verificarVencedor(char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
               (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    private static boolean verificarEmpate() {
        for (char[] linha : tabuleiro) {
            for (char celula : linha) {
                if (celula == ' ') return false;
            }
        }
        return true;
    }
}

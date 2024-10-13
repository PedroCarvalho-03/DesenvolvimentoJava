/*
NOME COMPLETO: PEDRO HENRIQUE CARVALHO DA SILVA
DISCIPLINA: Desenvolvimento de Aplicações
TURMA: TCTG241CNTDEV
*/

class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos para recuperar os valores
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Métodos para alterar os valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para retornar o conceito da nota
    public String getConceito() {
        if (nota >= 90) {
            return "A";
        } else if (nota >= 80) {
            return "B";
        } else if (nota >= 70) {
            return "C";
        } else if (nota >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    // Método para exibir dados do aluno
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Nota: " + nota + ", Conceito: " + getConceito());
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Testando a classe
        Aluno aluno1 = new Aluno("João", 85);
        aluno1.exibirDados();

        Aluno aluno2 = new Aluno("Maria", 92);
        aluno2.exibirDados();

        // Alterando dados de um aluno
        aluno1.setNota(75);
        aluno1.exibirDados();
    }
}

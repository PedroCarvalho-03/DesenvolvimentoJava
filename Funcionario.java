class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos para recuperar os valores
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Métodos para alterar os valores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aplicar reajuste percentual e atualizar o salário
    public double aplicarReajuste(double percentual) {
        double novoSalario = salario + (salario * percentual / 100);
        return novoSalario;
    }

    // Método para exibir dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario);
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos", "Desenvolvedor", 5000);
        funcionario1.exibirDados();

        // Aplicando reajuste de 10%
        double novoSalario = funcionario1.aplicarReajuste(10);
        funcionario1.setSalario(novoSalario);
        funcionario1.exibirDados();
    }
}

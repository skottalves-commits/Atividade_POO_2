// Classe abstrata Funcionario
public abstract class Funcionario {
    private String nome;
    private double salario;
    private int  idade;

    public Funcionario(String nome, double salario, int idade) throws SalarioInvalidoException {
        if (salario >10000) {
            throw new SalarioInvalidoException("Salario nao pode ser maior que 10000.");
        }
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;

    }

    // Métodos getters e setters
    public String getNome() {return nome;}
    public double getsalario  () {return salario;}
    public int getIdade() {return idade;}

    public abstract void imprimirDados();

}
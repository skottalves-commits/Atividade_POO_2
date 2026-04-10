// Classe Técnico que herda de Funcionario
public class Tecnico extends Funcionario {  
  private final String departamento;  
  private final String especialidade;

    public Tecnico(String nome, double salario, int idade, String departamento, String especialidade) throws SalarioInvalidoException {
        super(nome, salario, idade);
        this.departamento = departamento;
        this.especialidade = especialidade;
    }

    @Override
    public void imprimirDados() {
        System.out.println("[Tecnico] Nome: " + getNome() + ", Salario: " + getsalario() + ", Idade: " + getIdade() + ", Departamento: " + departamento + ", Especialidade: " + especialidade);
    }
}
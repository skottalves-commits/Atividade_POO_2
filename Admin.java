// Classe Admin que herda de Funcionario
public class Admin extends Funcionario {
      private final String departamento;

        public Admin(String nome, double salario, int idade, String departamento) throws SalarioInvalidoException {
            super(nome, salario, idade);
            this.departamento = departamento;
        }

        @Override
    public void imprimirDados() {
        System.out.println("[Admin] Nome: " + getNome() + ", Salario: " + getsalario() + ", Idade: " + getIdade() + ", Departamento: " + departamento);
    } 
}

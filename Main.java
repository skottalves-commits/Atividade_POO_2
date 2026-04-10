// Classe principal para testar as classes e a exceção personalizada
public class Main {
    public static void main(String[] args) {
        try {
            Admin admin1 = new Admin("Joao", 900, 30, "Recursos Humanos");
            Tecnico tecnico1 = new Tecnico("Maria", 800, 25, "TI", "Suporte");

            admin1.imprimirDados();
            tecnico1.imprimirDados();

            //teste da exceção personalizada
            System.out.println("\nTeste da excecao personalizada:");
            Funcionario funcionarioInvalido = new Admin("Carlos", 11000, 40, "Financeiro"); // Salário inválido
            funcionarioInvalido.imprimirDados();

        } catch (SalarioInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: ");
        }
    }
}
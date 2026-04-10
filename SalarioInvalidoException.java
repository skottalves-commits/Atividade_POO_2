// Classe de exceção personalizada para salário inválido
public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String message) {
        super(message);
    }
}
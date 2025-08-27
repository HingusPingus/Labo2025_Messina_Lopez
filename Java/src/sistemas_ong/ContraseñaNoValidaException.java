package sistemas_ong;

public class ContraseñaNoValidaException extends RuntimeException {
    public ContraseñaNoValidaException(String message) {
        super(message);
    }
}

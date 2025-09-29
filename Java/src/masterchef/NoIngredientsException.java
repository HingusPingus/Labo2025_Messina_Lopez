package masterchef;

public class NoIngredientsException extends RuntimeException {
  public NoIngredientsException(String message) {
    super(message);
  }
}

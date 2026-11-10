package exception;

// runtime exception

public class MinimumBalance extends RuntimeException {
	public MinimumBalance(String message) {
		super(message);
	}
}

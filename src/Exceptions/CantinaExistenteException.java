package Exceptions;

@SuppressWarnings("serial")
public class CantinaExistenteException extends Exception {

	public CantinaExistenteException() {
		super("Cantina j� existente. N�o � poss�vel inser�-la no reposit�rio.");
	}
}

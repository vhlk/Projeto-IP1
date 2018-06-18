package Exceptions;

@SuppressWarnings("serial")
public class CursoSemRemoverException extends Exception{

	public CursoSemRemoverException() {
		super("Impossível remover curso.");
	}
}

package Exceptions;

public class PessoaJaExistenteException extends Exception{
	
	public PessoaJaExistenteException() {
		super("Esta pessoa j� existe no sistema");
	}
}

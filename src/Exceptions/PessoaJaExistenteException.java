package Exceptions;

public class PessoaJaExistenteException extends Exception{
	
	public PessoaJaExistenteException() {
		super("Esta pessoa já existe no sistema");
	}
}

package Exceptions;

@SuppressWarnings("serial")
public class CantinaNaoExistenteException extends Exception {
	
	public CantinaNaoExistenteException() {
		super("N�o existe essa cantina, sendo imposs�vel remov�-la. ");
	}

}

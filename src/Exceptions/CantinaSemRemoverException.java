package Exceptions;

@SuppressWarnings("serial")
public class CantinaSemRemoverException extends Exception {
	
	public CantinaSemRemoverException() {
		super("N�o existe essa cantina, sendo imposs�vel remov�-la. ");
	}

}

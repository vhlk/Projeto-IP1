package Exceptions;

@SuppressWarnings("serial")
public class CantinaSemRemoverException extends Exception {
	
	public CantinaSemRemoverException() {
		super("Nâo existe essa cantina, sendo impossível removê-la. ");
	}

}

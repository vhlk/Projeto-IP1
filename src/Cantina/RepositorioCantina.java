package Cantina;

import Exceptions.*;

public interface RepositorioCantina {
	
	public void inserir(Cantina cantina) throws CantinaExistenteException;
	
	public boolean procurar(Cantina cantina);
	
	public void atualizar(Cantina antiga, Cantina atual);
	
	public void remover(Cantina cantina) throws CantinaNaoExistenteException;
	
	public String alarmeInicio (Cantina cantina);
	
	public String alarmeFim (Cantina cantina);

}

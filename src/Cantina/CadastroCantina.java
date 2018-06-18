package Cantina;

import Exceptions.*;

public class CadastroCantina {
	private RepositorioCantina repositorioCantina; 
	
	CadastroCantina(RepositorioCantinaLista repositorioCantina){
		this.repositorioCantina = repositorioCantina; 
	}

	CadastroCantina(RepositorioCantinaArray repositorioCantina){
		this.repositorioCantina = repositorioCantina;
	}
	
	public void inserirCantina(Cantina cant) throws CantinaExistenteException{
		if (repositorioCantina.procurar(cant) == false) {
			repositorioCantina.inserir(cant);
		}
		else {
			throw new CantinaExistenteException();
		}
	}
	
	public boolean procurarCantina(Cantina cant) {
		return repositorioCantina.procurar(cant);
	}
	
	public void atualizarCantina(Cantina antiga, Cantina atual) throws CantinaNaoExistenteException{
		if (repositorioCantina.procurar(antiga) == true) {
			repositorioCantina.atualizar(antiga, atual);
		}
		else {
			throw new CantinaNaoExistenteException();
		}
	}
	
	public void removerCantina(Cantina cant) throws CantinaNaoExistenteException{
		if (repositorioCantina.procurar(cant) == true) {
			repositorioCantina.remover(cant);
		}
		else {
			throw new CantinaNaoExistenteException();
		}
	}
	
	public String alarmeInicioCantina(Cantina cant) {
		return repositorioCantina.alarmeInicio(cant);
	}
	
	public String alarmeFimCantina(Cantina cant) {
		return repositorioCantina.alarmeFim(cant);
	}
}


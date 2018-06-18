package Curso;

import Exceptions.*;

public class CadastroCurso {
	
	private RepositorioCurso repositorioCurso; 
	
	CadastroCurso(RepositorioCursoLista repositorioCurso){
		this.repositorioCurso = repositorioCurso; 
	}

	CadastroCurso(RepositorioCursoArray repositorioCurso){
		this.repositorioCurso = repositorioCurso;
	}
	
	public void inserirCurso(Curso curso) throws CursoExistenteException{
		if (repositorioCurso.procurar(curso) == false) {
			repositorioCurso.inserir(curso);
		}
		else {
			throw new CursoExistenteException();
		}
	}
	
	public boolean procurarCantina(Curso curso) {
		return repositorioCurso.procurar(curso);
	}
	
	public void atualizarCantina(Curso antigo, Curso atual) throws CursoNaoExistenteException{
		if (repositorioCurso.procurar(antigo) == true) {
			repositorioCurso.atualizar(antigo, atual);
		}
		else {
			throw new CursoNaoExistenteException();
		}
	}
	
	public void removerCantina(Curso curso) throws CursoNaoExistenteException, CursoNaoExistenteException{
		if (repositorioCurso.procurar(curso) == true) {
			repositorioCurso.remover(curso);
		}
		else {
			throw new CursoNaoExistenteException();
		}
	}
	
	public String alarmeInicioCurso(Curso curso) {
		return repositorioCurso.alarmeInicio(curso);
	}
	
	public String alarmeFimCurso(Curso curso) {
		return repositorioCurso.alarmeFim(curso);
	}
}

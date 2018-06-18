package curCIn;

import Cantina.*;
import Curso.*;
import Disciplina.*;
import Material.*;
import Pessoa.*;
import Exceptions.*;

public class CadastroCurCIn {
	private CadastroCantina cadastroCantina;
	private CadastroCurso cadastroCurso;
	private CadastroDisciplina cadastroDisciplina;
	private CadastroMaterial cadastroMaterial;
	private CadastroPessoa cadastroPessoa;

	CadastroCurCIn(CadastroCantina cadastroCantina, CadastroCurso cadastroCurso, CadastroDisciplina cadastroDisciplina, CadastroMaterial cadastroMaterial, CadastroPessoa cadastroPessoa)){
		this.cadastroCantina = cadastroCantina;
		this.cadastroCurso = cadastroCurso;
		this.cadastroDisciplina = cadastroDisciplina;
		this.cadastroMaterial = cadastroMaterial;
		this.cadastroPessoa = cadastroPessoa;
		
	}
	
	public void inserirCantina(Cantina cant) throws CantinaExistenteException{
		cadastroCantina.inserirCantina(cant);
	}
	
	public boolean procurarCantina(Cantina cant) {
		cadastroCantina.procurarCantina(cant);
	}
	
	public void atualizarCantina(Cantina antiga, Cantina atual) throws CantinaNaoExistenteException{
		cadastroCantina.atualizarCantina(antiga, atual);
	}
	
	public void removerCantina(Cantina cant) throws CantinaNaoExistenteException{
		cadastroCantina.removerCantina(cant);
	}
	
	public String alarmeInicioCantina(Cantina cant) {
		cadastroCantina.alarmeInicioCantina(cant);
	}
	
	public String alarmeFimCantina(Cantina cant) {
		cadastroCantina.alarmeFimCantina(cant);
	}


}

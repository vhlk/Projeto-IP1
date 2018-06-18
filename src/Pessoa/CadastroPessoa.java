package Pessoa;
import Exceptions.*;

public class CadastroPessoa {

private RepositorioPessoa repositorioPessoa; 
	
	public CadastroPessoa(RepositorioPessoaLista repositorioPessoa){
		this.repositorioPessoa = repositorioPessoa; 
	}

	public CadastroPessoa(RepositorioPessoaArray repositorioPessoa){
		this.repositorioPessoa = repositorioPessoa;
	}
	
	public void inserirPessoa(Pessoa pessoa) throws PessoaJaExistenteException{
		if (repositorioPessoa.procurar(pessoa) == false) {
			repositorioPessoa.inserir(pessoa);
		}
		else {
			throw new PessoaJaExistenteException();
		}
	}
	
	public boolean procurarPessoa(Pessoa pessoa) {
		return repositorioPessoa.procurar(pessoa);
	}
	
	public void atualizarPessoa(Pessoa novo) throws PessoaNaoEncontradaException{
		if (repositorioPessoa.procurar(novo) == true) {
			repositorioPessoa.atualizar(novo);
		}
		else {
			throw new PessoaNaoEncontradaException();
		}
	}
	
	public void removerPessoa(Pessoa pessoa) throws PessoaNaoEncontradaException{
		if (repositorioPessoa.procurar(pessoa) == true) {
			repositorioPessoa.remover(pessoa);
		}
		else {
			throw new PessoaNaoEncontradaException();
		}
	}
}

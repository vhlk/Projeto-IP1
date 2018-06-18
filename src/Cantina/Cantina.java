package Cantina;

import Pessoa.*;

public class Cantina {
	private String nome;
	private Prato[] pratos;
	private Pessoa[] funcionarios;

	public Cantina(String nome, Prato[] prato, Pessoa[] pessoa) {
		this.nome = nome;
		this.pratos = prato;
		this.funcionarios = pessoa;
	}

	public boolean comparador(Cantina cant) {
		if (this.getNome().equals(cant.getNome())) {
			return true;
		}else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public Prato[] getPratos() {
		return pratos;
	}

	public Pessoa[] getFuncionarios() {
		return funcionarios;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}

	public void setFuncionarios(Pessoa[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}

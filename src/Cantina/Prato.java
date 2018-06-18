package Cantina;

public class Prato{
	private String nome;
	private double preco;
	
	public Prato(String nomeP, double precoP) {
		this.nome = nomeP;
		this.preco = precoP;
	}

	public void atualizarPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
package Material;

class Material {
	private String titulo;
	private String tipo;
	private int nivel;

	public Material(String ttl, String tip, int nvl) {
		this.titulo = ttl;
		this.tipo = tip;
		this.nivel = nvl;
	}

	public String getTipo() {
		return tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNivel() {
		return nivel;
	}

}
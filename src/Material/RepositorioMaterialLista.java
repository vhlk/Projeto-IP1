package Material;

public class RepositorioMaterialLista {
	private Material mat;
	private RepositorioMaterialLista proximo;

	public RepositorioMaterialLista() {
		this.mat = null;
		this.proximo = null;
	}

	public void inserirMaterial(Material mat) {
		if (this.mat == null) {
			this.mat = mat;
			this.proximo = new RepositorioMaterialLista();
		} else {
			this.proximo.inserirMaterial(mat);
		}
	}

	public boolean procurarMaterial(Material mat) {
		if (this.mat == mat) {
			return true;
		}
		if (this.proximo != null) {
			return this.proximo.procurarMaterial(mat);
		} else {
			return false;
		}
	}

	public void removerMaterial(Material mat) {
		if (this.mat != null) {
			if (this.mat == mat) {
				this.mat = this.proximo.mat;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.removerMaterial(mat);
			}
		}
	}

	public void atualizarMaterial(Material antigo, Material novo) {
		if (this.mat != null) {
			if (this.mat == antigo) {
				this.mat = novo;
			}
		}
	}
}

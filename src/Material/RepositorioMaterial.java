package Material;

public interface RepositorioMaterial {
	
	public void inserirMaterial(Material mat);
	public boolean procurarMaterial(Material mat);
	public void removerMaterial(Material mat);
	public void atualizarMaterial(Material antigo, Material novo);

}

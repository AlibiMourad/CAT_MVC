package metier;

import java.util.List;

public interface ICatalogueMetier {
	public void addProduit(Produit produit);

	public List<Produit> listProduits();

	public List<Produit> produitParMC(String mc);

	public Produit getProduit(String ref);

	public void updateProduit(Produit p);

	public void deleteProuit(String ref);
}

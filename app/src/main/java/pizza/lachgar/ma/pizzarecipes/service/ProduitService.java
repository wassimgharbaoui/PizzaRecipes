package pizza.lachgar.ma.pizzarecipes.service;

import java.util.ArrayList;
import java.util.List;

import pizza.lachgar.ma.pizzarecipes.beans.Produit;
import pizza.lachgar.ma.pizzarecipes.dao.IDao;

public class ProduitService implements IDao<Produit> {

    // Liste qui stocke les pizzas
    private List<Produit> produits = new ArrayList<>();

    // Instance unique (Singleton)
    private static ProduitService instance;

    // Constructeur privé
    private ProduitService() {}

    // Méthode pour obtenir l'instance unique
    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit p = findById(o.getId());
        if (p != null) {
            p.setNom(o.getNom());
            p.setDuree(o.getDuree());
            p.setDescription(o.getDescription());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : produits) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
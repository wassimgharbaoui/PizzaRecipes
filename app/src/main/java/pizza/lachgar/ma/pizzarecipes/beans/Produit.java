package pizza.lachgar.ma.pizzarecipes.beans;

public class Produit {

    // Attributs
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailsIngred;
    private String description;
    private String preparation;

    // Compteur pour l'auto-incrément
    private static int compteur = 1;

    // ✅ Constructeur SANS paramètres
    public Produit() {
    }

    // ✅ Constructeur AVEC paramètres (id auto-incrémenté)
    public Produit(String nom, int nbrIngredients, int photo, String duree,
                   String detailsIngred, String description, String preparation) {
        this.id = compteur++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    // ✅ Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getNbrIngredients() { return nbrIngredients; }
    public void setNbrIngredients(int nbrIngredients) { this.nbrIngredients = nbrIngredients; }

    public int getPhoto() { return photo; }
    public void setPhoto(int photo) { this.photo = photo; }

    public String getDuree() { return duree; }
    public void setDuree(String duree) { this.duree = duree; }

    public String getDetailsIngred() { return detailsIngred; }
    public void setDetailsIngred(String detailsIngred) { this.detailsIngred = detailsIngred; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getPreparation() { return preparation; }
    public void setPreparation(String preparation) { this.preparation = preparation; }

    // ✅ toString
    @Override
    public String toString() {
        return "Produit{id=" + id + ", nom='" + nom + "'}";
    }
}
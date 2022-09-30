package be.ifapme.lpw.pooexample;

public class Livre {
    private String titre;
    private String auteur;
    private float prix;

    public Livre(String titre, String auteur, float prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void afficher(){
        System.out.println("Titre: "+ this.titre);
        System.out.println("Auteur: "+ this.auteur);
        System.out.println("Prix: "+ this.prix);
    }
}

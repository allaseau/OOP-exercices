package be.ifapme.lpw.pooexample;

import java.util.Date;

public class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private Date naissance;
    private Date embauche;
    private float salaire;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public Date getEmbauche() {
        return embauche;
    }

    public void setEmbauche(Date embauche) {
        this.embauche = embauche;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public Employe(String matricule, String nom, String prenom, Date naissance, Date embauche, float salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.embauche = embauche;
        this.salaire = salaire;
    }

    public int age(){
        int currentDate = new Date().getYear();
        return currentDate - this.naissance.getYear();
    }

    public int anciennete(){
        int currentDate = new Date().getYear();
        return currentDate - this.embauche.getYear();
    }

    public void augmentationSalaire(){
        int pourcentage = 10;
        if(anciennete() < 5){
            pourcentage = 2;
        } else if (anciennete() < 10) {
            pourcentage = 5;
        }
    }

    public void afficher(){
        System.out.println("Matricule: " + this.matricule);
        System.out.println("Nom complet: " + this.nom.toUpperCase() + " " + this.prenom);
        System.out.println("Age: " + age());
        System.out.println("Ancienneté: " + anciennete());
        System.out.println("Salaire: " + this.salaire);
    }

}

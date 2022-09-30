package be.ifapme.lpw.pooexample;

import java.util.Date;

/* Une class par fichier , mais un fichier n'est pas forcément une class
    class peut etre un objet exemple Person person = new Person();
    trois notions:
    --------------
        Propriété : c'est une variable qui aura pour portée la class ( on peut l'appeller de partout
                    dans la classe grâce au mot clé this)
                    Exemple : String myProp --> this.myProp

        Constructor: Une méthode spéciale qui permet de construire une instance dans un objet
                        voir le fichier PooExampleApplication.java de la ligne de 14 à 16
 */

public class Person {
    // Définition de propriété
    private int person_id;
    private String firstname; // String correspond à varchar ou char en sql
    private String lastname; // String correspond à varchar ou char en sql
    private boolean actif; // boolean correspond a boolean (true ou false) en sql
    private int nbChild; // correspond à int en sql;
    private Date birth; // correspond à Date en sql;
    private float salary; // correspond un float en sql ex: 12,5

    // constructor est une méthode qui permettra de construire un objet.
    // on peut avoir autant de constructor qu'on veut.
    // un constructor porte comme nom de méthode le nom de la classe.
    // une méthode est une fonction dans un objet
    public Person() {
        // Constructeur par défaut donc on définit des valeurs par défaut.
        this.person_id = 0;
        this.firstname = "Doe";
        this.lastname = "John";
        this.actif = true;
        this.nbChild = 0;
        this.birth = new Date();
        this.salary = 0.0F;
    }

    // clique droit -> generate -> constructor -> select all properties
    public Person(int person_id, String firstname, String lastname, boolean actif, int nbChild, Date birth, float salary) {
        this.person_id = person_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.actif = actif;
        this.nbChild = nbChild;
        this.birth = birth;
        this.salary = salary;
    }

    public Person(String firstname, String lastname) {
        this.person_id = 0;
        this.firstname = firstname;
        this.lastname = lastname;
        this.actif = true;
        this.nbChild = 0;
        this.birth = new Date();
        this.salary = 0.0F;
    }

    // Méthode publique qui ne fait rien mais osef --> void == ne retourne rien
    public void setNbChild(int nbChild) {
        this.nbChild = nbChild;
    }

    private int somme(int a, int b) {
        return a + b;
    }

    // comment écrire une methode
    /*
     1. la visibilité : {public, private, protected} --> ca définit la visibilité de la méthode
                        c'est donner la possibilité d'appeler la méthode depuis n'importe où ou non
                        public : on peut appeller depuis n'importe oà exemple depuis main j'appelle la méthode
                        private; on peut appeller uniquement depuis la classe ou depuis les classes enfants
                        protected: on peut appeller uniquement depuis la classe
     */

    //
    public int getPerson_id() {
        return person_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public int getNbChild() {
        return nbChild;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

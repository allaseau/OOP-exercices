package be.ifapme.lpw.pooexample;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PooExampleApplication {
    // Methode de démarrage de l'application
    public static void main(String[] args) {
        // j'affiche une phrase dans la console
        System.out.println("Ceci est une phrase....");
        // ca va référence au constructeur par défaut de la classe Person
        Person dylan = new Person();
        Person serena = new Person(1, "doe", "jane", true, 5, new Date(), 1500.0F);
        Person aurore = new Person("Doe", "Joe");
        Person alice = new Person();
        aurore.setNbChild(5);
        System.out.println("Aurore possede " + aurore.getNbChild() +" enfants");

        Article article = new Article("Hello","Cool",125.57F,6);
        article.printArticle();
        System.out.println(article.calculateCostTTC());

    }

}

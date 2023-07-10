import javax.swing.*;

public class Thèmes {
    private String themes;
    String tm[] = {"Physique et chimie", "Sport", "Musique", "Pays et Villes",
            "Cuisines", "Mathematiques", "Histoire & Géographie", "Gaming & séries",
            "Santé et alimentations", "Orthographe et Grammaire"};
    // CONSTRUCTEUR
    public Thèmes(String themes) {
        this.themes = themes;

    }

    // Méthode de sélection des thèmes
    public void SélectionThème() {
        char them[] = {'p', 's', 'm', 'p', 'c', 'M', 'h', 'g', 's', 'o'};
        int indice = 0;
        char thème = JOptionPane.showInputDialog("Choisissez un thème NB: Choisissez la première lettre du thème par exemple h pour histoire").charAt(0);

        for (int i = 0; i < them.length; i++) {

            if (thème == them[i]) {
                indice = i;

            }
        }

        System.out.println("l'indice du thème est:" + indice);
    }

    // Méthode de sélection des thèmes
    public void SélectionThèmes() {
        String tm[] = {"Physique et chimie", "Sport", "Musique", "Pays et Villes",
                "Cuisines", "Mathematiques", "Histoire & Géographie", "Gaming & séries",
                "Santé et alimentations", "Orthographe et Grammaire"};
        int nbA = (int) (Math.random() * tm.length);
        System.out.println(nbA+ " " + tm[nbA]);
    }
    // Représentation textuelle

    @Override
    public String toString() {
        for (int i = 0; i < tm.length; i++) {
            System.out.println(tm[i] + " " +i);
        }
        return null;
    }
}

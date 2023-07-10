import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Joueurs
{
    private Joueur joueurs;

    //CONSTRUCTEUR
    public Joueurs ()
    {
        this.joueurs = null;
    }

    //GETTERS

    public Joueur getJoueurs() {
        return joueurs;
    }
    //SETTERS

    public void setJoueurs(Joueur joueurs) {
        this.joueurs = joueurs;
    }


    //Une méthode de sélection aléatoire d’un joueur du tableau

    public void sélectionAléatoire(Joueur[] tableauDeJoueur)
    {

        Random rn = new Random();
        ArrayList p = new ArrayList();
        int a = rn.nextInt(tableauDeJoueur.length);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez le nombre de participants :");
        int participant = scanner.nextInt() ;


        while(participant < 4)
        {
            System.out.println("Donnez au moins 4 joueurs :");
            participant = scanner.nextInt() ;
        }

        System.out.println("Les participants du jeu sont :");
        for (int i = 0; i < participant; i++)
        {
            if(p.contains(a))
            {
                while((p.contains(a)))
                {
                    a = rn.nextInt(tableauDeJoueur.length);
                }
            }
            if(!p.contains(a))
            {
                p.add(a);
                System.out.println(tableauDeJoueur[a]);
            }

            }
        }

    //Une méthode générant aléatoirement l’ensemble des joueurs participant au jeu
    public void sélectionTotale(Joueur[] tableauDeJoueur)
    {
        Random rn = new Random();
        ArrayList p = new ArrayList();
        int a = rn.nextInt(tableauDeJoueur.length);
        while (p.size() < 20)
        {

            if (p.contains(a))
            {
                a = rn.nextInt(tableauDeJoueur.length);
            }
            if(!p.contains(a))
            {
                p.add(a);
                System.out.println(tableauDeJoueur[a]);
            }

        }

    }

    //représentation textuelle de l’ensemble des joueurs participant au jeu
    public void toString(Joueur[] tableauDeJoueur) {
        for (int i = 0; i < tableauDeJoueur.length; i++)
        {
            System.out.println(tableauDeJoueur[i]);
        }
    }
}

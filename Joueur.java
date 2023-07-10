public class Joueur
{
    //attributs
    private int numéro;
    private String nom;
    private int score;
    private String etat;

    //constructeur
    public Joueur(int numéro, String nom, int score, String etat )
    {
        this.etat = etat;
        this.nom = nom;
        this.numéro = numéro;
        this.score = score;
    }

    public Joueur()
    {
        this(0,"",0,"");
    }

    // GETTERS

    public int getNuméro() {
        return numéro;
    }

    public int getScore() {
        return score;
    }

    public String getEtat() {
        return etat;
    }

    public String getNom() {
        return nom;
    }

    // SETTERS
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //méthode de saisie
    public Joueur saisirUnJoueur (String name, int numéro)
    {
        Joueur player = new Joueur() ;

        player.setNom(name);

        player.setEtat("EN ATTENTE");

        player.setScore(0);

        player.setNuméro(numéro);

        return player;
    }

    //méthode de mise à jour du score
    public void MiseAjour(int score)
    {
        setScore(score);
    }

    // méthode de changement d'état
    public void ChangementEtat(String Etat)
    {
        setEtat(Etat);
    }

    // String : méthode qui retourne une représentation textuelle
    @Override
    public String toString() {
        return "[" + "numéro=" + numéro + "| nom='" + nom + '\'' + "| score=" + score + "| etat='" + etat + '\'' + ']';
    }
}

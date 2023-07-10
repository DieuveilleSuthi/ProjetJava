import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Questions
{

    private ArrayList <Typesquestions> Sport;
    private ArrayList <Typesquestions> Physiqueetchimie;
    private ArrayList <Typesquestions> Musique;
    private ArrayList <Typesquestions> PaysetVille;
    private ArrayList <Typesquestions> Mathématiques;
    private ArrayList <Typesquestions> HistoireetGeopgraphie;
    private ArrayList <Typesquestions> GamingsetSéries;
    private ArrayList <Typesquestions> Cuisine;
    private ArrayList <Typesquestions> Santéetalimentation;
    private ArrayList <Typesquestions> OrthographeetGrammaire;

    //CONSTRUCTEUR
    public Questions (Typesquestions Sport, Typesquestions Physiqueetchimie, Typesquestions Musique, Typesquestions PaysetVille, Typesquestions Mathématiques, Typesquestions HistoireetGeopgraphie )
    {

    }
    public ArrayList<Typesquestions> getCuisine() {
        return Cuisine;
    }

    public ArrayList<Typesquestions> getGamingsetSéries() {
        return GamingsetSéries;
    }

    public ArrayList<Typesquestions> getHistoireetGeopgraphie() {
        return HistoireetGeopgraphie;
    }

    public ArrayList<Typesquestions> getMathématiques() {
        return Mathématiques;
    }

    public ArrayList<Typesquestions> getMusique() {
        return Musique;
    }

    public ArrayList<Typesquestions> getOrthographeetGrammaire() {
        return OrthographeetGrammaire;
    }

    public ArrayList<Typesquestions> getPaysetVille() {
        return PaysetVille;
    }

    public ArrayList<Typesquestions> getPhysiqueetchimie() {
        return Physiqueetchimie;
    }

    public ArrayList<Typesquestions> getSantéetalimentation() {
        return Santéetalimentation;
    }

    public ArrayList<Typesquestions> getSport() {
        return Sport;
    }



    //Méthode d'ajout d'une question
    public void ajouterUneQuestion(Typesquestions Question)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList question = new ArrayList();
        if (Question.getThemeQuestion() == "Sport")
        {
            Sport.add(Question);
        }

        if (Question.getThemeQuestion() == "Physiqueetchimie")
        {
            Physiqueetchimie.add(Question);
        }

        if (Question.getThemeQuestion() == "Musique")
        {
            Musique.add(Question);
        }

        if (Question.getThemeQuestion() == "OrthographeetGrammaire")
        {
            OrthographeetGrammaire.add(Question);
        }

        if (Question.getThemeQuestion() == "PaysetVille")
        {
            PaysetVille.add(Question);
        }

        if (Question.getThemeQuestion() == "OrthographeetGrammaire")
        {
            OrthographeetGrammaire.add(Question);
        }

        if (Question.getThemeQuestion() == "Mathématiques")
        {
            Mathématiques.add(Question);
        }

        if (Question.getThemeQuestion() == "GamingsEtSéries")
        {
            GamingsetSéries.add(Question);
        }


        if (Question.getThemeQuestion() == "Santéetalimentation")
        {
            Santéetalimentation.add(Question);
        }

        if (Question.getThemeQuestion() == "Cuisine")
        {
            Cuisine.add(Question);
        }

    }

    //Méthode de supression d'une question
    public void supression(Typesquestions Choisi, int position)
    {
        Scanner scanner = new Scanner(System.in);


        if (Choisi.getThemeQuestion() == "Sport")
        {
            Sport.remove(position);
        }

        if (Choisi.getThemeQuestion() == "Physiqueetchimie")
        {
            Physiqueetchimie.remove(position);
        }

        if (Choisi.getThemeQuestion() == "Musique")
        {
            Musique.remove(position);
        }

        if (Choisi.getThemeQuestion() == "OrthographeetGrammaire")
        {
            OrthographeetGrammaire.remove(position);
        }

        if (Choisi.getThemeQuestion() == "PaysetVille")
        {
            PaysetVille.remove(position);
        }

        if (Choisi.getThemeQuestion() == "OrthographeetGrammaire")
        {
            OrthographeetGrammaire.remove(position);
        }

        if (Choisi.getThemeQuestion() == "Mathématiques")
        {
            Mathématiques.remove(position);
        }

        if (Choisi.getThemeQuestion() == "GamingsEtSéries")
        {
            GamingsetSéries.remove(position);
        }


        if (Choisi.getThemeQuestion() == "Santéetalimentation")
        {
            Santéetalimentation.remove(position);
        }

        if (Choisi.getThemeQuestion() == "Cuisine")
        {
            Cuisine.remove(position);
        }



    }

    //Méthode de sélection
    public void sélection (Typesquestions Question)
    {
        Random rn = new Random();

        if (Question.getThemeQuestion() == "Sport")
        {
            System.out.println(Sport.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "Physiqueetchimie")
        {
            System.out.println(Physiqueetchimie.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "Musique")
        {
            System.out.println(Musique.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "OrthographeetGrammaire")
        {
            System.out.println(OrthographeetGrammaire.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "PaysetVille")
        {
            System.out.println(PaysetVille.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "OrthographeetGrammaire")
        {
            System.out.println(OrthographeetGrammaire.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "Mathématiques")
        {
            System.out.println(Mathématiques.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "GamingsEtSéries")
        {
            System.out.println(GamingsetSéries.get(rn.nextInt()));
        }


        if (Question.getThemeQuestion() == "Santéetalimentation")
        {
            System.out.println(Santéetalimentation.get(rn.nextInt()));
        }

        if (Question.getThemeQuestion() == "Cuisine")
        {
            System.out.println(Cuisine.get(rn.nextInt()));
        }


    }

    //Méthode de Représentation textuelle
    public String afficheEnsembleQuestions() {
        return toString();
    }

    @Override
    public String toString() {
        return( "L'ensemble des questions classées par thèmes : " +
                "Sport : "+Sport+"\n"+
                "Physique et Chimie : "+Physiqueetchimie+"\n"+
                "Musique : "+Musique+"\n"+
                "Pays et Villes : "+PaysetVille+"\n"+
                "Cuisines : "+ Cuisine+"\n"+
                "Mathematiques : "+Mathématiques+"\n"+
                "Histoire & Géographie : "+HistoireetGeopgraphie+"\n"+
                "Gaming & séries : "+GamingsetSéries+"\n"+
                "Santé et alimentations : "+Santéetalimentation+"\n"+
                "Orthographe et Grammaire : "+OrthographeetGrammaire);
    }
}


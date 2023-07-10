public class Questionrc extends Typesquestions {

    private String typeQuestion="Question type R.C. : ";

    private String bonneReponse;


    public Questionrc(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,String bonneReponse) {
        super(numeroQuestion,themeQuestion,enonce,niveauQuestion);
        this.bonneReponse=bonneReponse;
    }

    public Questionrc() {
        this(0,"","",0,"");
    }

    @Override
    public void setEnonce(String enonce) {
        this.enonce=enonce;
    }

    @Override
    public void setNiveauQuestion(int niveauQuestion) {
        this.niveauQuestion=niveauQuestion;
    }

    @Override
    public void setNumeroQuestion(int numeroQuestion) {
        this.numeroQuestion=numeroQuestion;
    }

    @Override
    public void setThemeQuestion(String themeQuestion) {
        this.themeQuestion=themeQuestion;
    }

    public void setBonneReponse(String bonneReponse) {
        this.bonneReponse=bonneReponse;
    }

    @Override
    public String toString() {
        return ( typeQuestion +"{ "+ super.toString()+" ; "+
                " Saisir la Réponse .....  . : ") ;
    }

    public  String afficheQuestion() {
        return toString();
    }

    public Questionrc saisirQuestion(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,String bonneReponse) {
        Questionrc question = new Questionrc();

        question.setNumeroQuestion(numeroQuestion);
        question.setThemeQuestion(themeQuestion);
        question.setEnonce(enonce);
        question.setNiveauQuestion(niveauQuestion);

        question.setBonneReponse(bonneReponse);

        return question;

    }

}

public class Questionvf extends Typesquestions {

    private String typeQuestion ="Question type V/F : ";

    private boolean bonneReponse ;

    public Questionvf(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,boolean bonneReponse) {
        super(numeroQuestion,themeQuestion,enonce,niveauQuestion);
        this.bonneReponse=bonneReponse;
    }

    public Questionvf() {
        this(0,"","",0,false);
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

    public void setBonneReponse(boolean bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

    @Override
    public String toString() {
        return ( typeQuestion +"{ "+ super.toString()+" ; "+
                " VRAI ou FAUX ?");
    }

    public  String afficheQuestion() {
        return toString();
    }


    public  Questionvf saisirQuestion(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,boolean bonneReponse) {

        Questionvf question = new Questionvf();

        question.setNumeroQuestion(numeroQuestion);
        question.setThemeQuestion(themeQuestion);
        question.setEnonce(enonce);
        question.setNiveauQuestion(niveauQuestion);

        question.setBonneReponse(bonneReponse);

        return question;
    }


}

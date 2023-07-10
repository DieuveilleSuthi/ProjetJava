public class Questionqcm extends Typesquestions {

    private String typeQuestion = "Question type QCM : ";

    private String premierchoix ;
    private String secondchoix ;
    private String troisiemechoix ;
    private String bonneReponse ;

    public Questionqcm(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,String un, String deux, String trois, String bonneReponse) {
        super(numeroQuestion,themeQuestion,enonce,niveauQuestion);
        premierchoix=un ;
        secondchoix=deux ;
        troisiemechoix=trois;
        this.bonneReponse=bonneReponse;
    }
    public Questionqcm() {
        this(0,"","",0,"","","","");
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

    public void setPremierchoix(String premierchoix) {
        this.premierchoix = premierchoix;
    }

    public void setSecondchoix(String secondchoix) {
        this.secondchoix = secondchoix;
    }

    public void setTroisiemechoix(String troisiemechoix) {
        this.troisiemechoix = troisiemechoix;
    }

    public void setBonneReponse(String bonneReponse) {
        this.bonneReponse=bonneReponse;
    }

    @Override
    public String toString() {
        return (
                 typeQuestion +"{ "+ super.toString()+" ; "+
                " Premierchoix = " + premierchoix +" ; "+
                " Secondchoix = " + secondchoix + " ; "+
                " Troisiemechoix = " + troisiemechoix +" ."+
                '}' ) ;
    }

    public  String afficheQuestion() {
        return toString();
    }

    public Typesquestions saisirQuestion(int numeroQuestion,String themeQuestion,String enonce,int niveauQuestion,String un, String deux, String trois, String bonneRep){
        Questionqcm question = new Questionqcm();

        question.setNumeroQuestion(numeroQuestion);
        question.setThemeQuestion(themeQuestion);
        question.setEnonce(enonce);
        question.setNiveauQuestion(niveauQuestion);

        question.setPremierchoix(un);
        question.setSecondchoix(deux);
        question.setTroisiemechoix(trois);
        question.setBonneReponse(bonneReponse);

        return question;

    }

}

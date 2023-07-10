public abstract  class Typesquestions {


    protected int numeroQuestion;
    protected String themeQuestion;
    protected int niveauQuestion;
    protected String enonce;

    public Typesquestions(int numeroQuestion, String themeQuestion, String enonce, int niveauQuestion) {
        this.numeroQuestion = numeroQuestion;
        this.enonce = enonce;
        this.themeQuestion = themeQuestion;
        this.niveauQuestion = niveauQuestion;

    }

    public int getNumeroQuestion() {
        return numeroQuestion;
    }

    public int getNiveauQuestion() {
        return niveauQuestion;
    }

    public String getThemeQuestion() {
        return themeQuestion;
    }

    public String getEnonce() {
        return enonce;
    }

    public  abstract void setEnonce(String enonce);
    public abstract void setNiveauQuestion(int niveauQuestion) ;
    public abstract void setNumeroQuestion(int numeroQuestion);
    public abstract void setThemeQuestion(String themeQuestion);
    public abstract String afficheQuestion();


    @Override
    public String toString() {
        return (
                " Numero question : " +getNumeroQuestion()+" ; "+
                " Theme : " + getThemeQuestion() +" ; "+
                " Niveau Question " + getNiveauQuestion() +" ; "+
                " Enoncé :" + getEnonce()+"");
    }

}
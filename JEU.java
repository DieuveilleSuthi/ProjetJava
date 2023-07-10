public class JEU {
    public static void main(String[] args) {
        Phase1 phase1 = new Phase1();
        phase1.DéroulerUnePhase();
        phase1.sélectionDesJoueurs();

        Phase2 phase2 = new Phase2();
        phase2.DéroulerUnePhase();
        phase2.sélectionDesJoueurs();

        Phase3 phase3= new Phase3();
        phase3.DéroulerUnePhase();
        phase3.sélectionDesJoueurs();
    }
}

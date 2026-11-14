public interface Nourrissable {

    void manger(String nourriture);
    double getRationJournaliere();      // en kg

    default void afficherRegime() {
        System.out.println("Ration journalière : "
                + getRationJournaliere() + " kg");
    }
}

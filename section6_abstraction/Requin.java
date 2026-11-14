public class Requin extends Animal implements Nourrissable {

    private String variete;
    private double longueur;

    public Requin(String nom, int age, double poids, String variete, double longueur) {
        super(nom, age, poids, "Poisson");
        this.variete = variete;
        this.longueur = longueur;
    }

    public void nager() {
        System.out.println(getNom() + " nage silencieusement...");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " ... (silence) ...");
    }

    @Override
    public void manger(String nourriture) {
        System.out.println(getNom() + " avale : " + nourriture);
    }

    @Override
    public double getRationJournaliere() {
        return getPoids() * 3 / 100;      // 3 % du poids corporel
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Variété : " + variete
                + " | Longueur : " + longueur + " m";
    }
}

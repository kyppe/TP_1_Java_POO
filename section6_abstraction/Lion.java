public class Lion extends Animal implements Nourrissable {

    private String race;

    public Lion(String nom, int age, double poids, String race) {
        super(nom, age, poids, "Félin");
        this.race = race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " RUGIT ! ROARRR !");
    }

    @Override
    public void manger(String nourriture) {
        System.out.println(getNom() + " dévore : " + nourriture);
    }

    @Override
    public double getRationJournaliere() {
        return getPoids() * 4 / 100;      // 4 % du poids corporel
    }

    public void rugir() { faireDuBruit(); }

    public String getRace() { return race; }

    @Override
    public String toString() {
        return super.toString() + " | Race : " + race;
    }
}

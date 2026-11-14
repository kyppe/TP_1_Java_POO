public class Lion extends Animal {

    private String race;

    public Lion(String nom, int age, double poids, String race) {
        super(nom, age, poids, "Félin");
        this.race = race;
    }

    public void rugir() {
        System.out.println(getNom() + " rugit : ROARRR !");
    }

    public String getRace() { return race; }

    @Override
    public String toString() {
        return super.toString() + " | Race : " + race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " RUGIT ! ROARRR !");
    }
}

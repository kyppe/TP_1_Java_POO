public class Perroquet extends Animal {

    private String couleurPlumage;
    private String motAppris;

    public Perroquet(String nom, int age, double poids, String couleur, String mot) {
        super(nom, age, poids, "Oiseau");
        this.couleurPlumage = couleur;
        this.motAppris = mot;
    }

    public void parler() {
        System.out.println(getNom() + " dit : " + motAppris + " !");
    }

    @Override
    public String toString() {
        return super.toString() + " | Plumage : " + couleurPlumage;
    }

    @Override
    public void faireDuBruit() {
        System.out.println(getNom() + " crie : " + motAppris + " !");
    }
}

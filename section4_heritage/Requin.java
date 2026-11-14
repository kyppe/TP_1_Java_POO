public class Requin extends Animal {

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
    public String toString() {
        return super.toString()
                + " | Variété : " + variete
                + " | Longueur : " + longueur + " m";
    }
}

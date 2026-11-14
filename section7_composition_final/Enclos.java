import java.util.ArrayList;
import java.util.List;

public class Enclos {

    private String nom;
    private String type;
    private int capaciteMax;
    private List<Animal> animaux = new ArrayList<>();

    public Enclos(String nom, String type, int capaciteMax) {
        this.nom = nom;
        this.type = type;
        this.capaciteMax = capaciteMax;
    }

    public boolean ajouterAnimal(Animal a) {
        if (animaux.size() < capaciteMax) {
            animaux.add(a);
            System.out.println(a.getNom() + " ajouté à " + nom);
            return true;
        }
        System.out.println("Enclos " + nom + " est plein !");
        return false;
    }

    public void reveillerAnimaux() {
        System.out.println("\n=== Réveil de " + nom + " ===");
        for (Animal a : animaux) {
            a.faireDuBruit();
        }
    }

    public void afficherAnimaux() {
        System.out.println("Enclos [" + type + "] " + nom
                + " (" + animaux.size() + "/" + capaciteMax + ") :");
        for (Animal a : animaux) {
            System.out.println(" - " + a);
        }
    }
}

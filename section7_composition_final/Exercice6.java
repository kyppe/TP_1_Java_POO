// Exercice 6 : enclos plein  ->  java Exercice6
public class Exercice6 {
    public static void main(String[] args) {

        Enclos bassin = new Enclos("Petit bassin", "Poissons", 1);

        bassin.ajouterAnimal(new Requin("Bruce", 8, 520.0, "Blanc", 4.8));
        bassin.ajouterAnimal(new Requin("Hammer", 6, 300.0, "Marteau", 3.9));

        bassin.afficherAnimaux();
    }
}

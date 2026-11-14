public class Main {
    public static void main(String[] args) {

        Animal[] zoo = {
            new Lion("Simba", 5, 190.0, "Africain"),
            new Perroquet("Coco", 3, 0.4, "Vert", "Coucou"),
            new Requin("Jaws", 10, 680.0, "Grand Blanc", 5.5),
            new Lion("Nala", 4, 140.0, "Berbère")
        };

        // Animal x = new Animal("Test", 1, 1.0, "Inconnu");   // erreur : Animal est abstraite

        for (Animal a : zoo) {
            if (a instanceof Nourrissable n) {
                n.manger("sa nourriture habituelle");
                n.afficherRegime();
            }
        }
    }
}

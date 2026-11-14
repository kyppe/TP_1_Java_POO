public class Main {

    // Exercice 4 : méthode polymorphe
    static void nourrirAnimal(Animal a) {
        System.out.println("\n>>> Nourrissage de " + a.getNom());
        a.faireDuBruit();
    }

    public static void main(String[] args) {
        Animal[] zoo = {
            new Lion("Simba", 5, 190.0, "Africain"),
            new Perroquet("Coco", 3, 0.4, "Vert", "Coucou"),
            new Requin("Jaws", 10, 680.0, "Grand Blanc", 5.5),
            new Lion("Nala", 4, 140.0, "Berbère")
        };

        System.out.println("=== Le zoo s'anime ! ===");
        for (Animal a : zoo) {
            System.out.print("- ");
            a.faireDuBruit();
        }

        System.out.println("=== Les lions rugissent ===");
        for (Animal a : zoo) {
            if (a instanceof Lion) {
                Lion l = (Lion) a;
                l.rugir();
            }
        }

        // Exercice 4
        for (Animal a : zoo) {
            nourrirAnimal(a);
        }
    }
}

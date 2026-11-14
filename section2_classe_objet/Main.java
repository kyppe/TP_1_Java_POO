public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Simba", 5, 190.5, "Félin");
        Animal a2 = new Animal("Coco", 3, 0.4, "Oiseau");
        Animal a3 = new Animal("Jaws", 10, 680.0, "Poisson");

        a1.afficherInfos();
        a2.afficherInfos();
        a3.afficherInfos();
    }
}

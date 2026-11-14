public class Main {
    public static void main(String[] args) {

        Lion simba = new Lion("Simba", 5, 190.0, "Africain");
        Perroquet coco = new Perroquet("Coco", 3, 0.4, "Vert", "Bonjour");
        Requin jaws = new Requin("Jaws", 10, 680.0, "Grand Blanc", 5.5);

        System.out.println(simba);
        System.out.println(coco);
        System.out.println(jaws);

        simba.rugir();
        coco.parler();
        jaws.nager();
    }
}

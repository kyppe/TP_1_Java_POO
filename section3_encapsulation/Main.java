public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Simba", 5, 190.5, "Félin");

        // Accès direct à un attribut privé -> ERREUR de compilation
        // System.out.println(a1.nom);

        a1.setNom("Nala");
        System.out.println("Nouveau nom : " + a1.getNom());

        a1.setAge(-5);
        System.out.println(a1);
    }
}

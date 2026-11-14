public class Animal {
    String nom;
    int age;
    double poids;
    String espece;

    public Animal(String nom, int age, double poids, String espece) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.espece = espece;
    }

    public void afficherInfos() {
        System.out.println("[" + espece + "] " + nom
                + " | Age : " + age + " ans"
                + " | Poids : " + poids + " kg");
    }
}

public class Animal {

    private String nom;
    private int age;
    private double poids;
    private String espece;

    public Animal(String nom, int age, double poids, String espece) {
        setNom(nom);
        setAge(age);
        setPoids(poids);
        this.espece = espece;
    }

    public String getNom()     { return nom; }
    public int getAge()        { return age; }
    public double getPoids()   { return poids; }
    public String getEspece()  { return espece; }

    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Erreur : age invalide (" + age + ")");
        }
    }

    public void setPoids(double poids) {
        if (poids > 0) {
            this.poids = poids;
        }
    }

    @Override
    public String toString() {
        return "[" + espece + "] " + nom
                + " | Age : " + age + " ans"
                + " | Poids : " + poids + " kg";
    }
}

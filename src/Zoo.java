public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré (instruction 6)
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];  // Tableau de 25 animaux max
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Méthode pour afficher les informations du zoo (instruction 8)
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages;
    }

}

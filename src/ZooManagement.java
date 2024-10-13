public class ZooManagement {
    public static void main(String[] args) {
        // Création de plusieurs animaux avec le constructeur paramétré
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("My Zoo", "Paris", 25);

        // Ajouter des animaux au zoo
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;


        myZoo.displayZoo();
        System.out.println(lion);
        System.out.println(myZoo);

    }
}

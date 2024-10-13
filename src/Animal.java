public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré (instruction 6)
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    @Override
    public String toString() {
        return "Animal: " + name + ", Famille: " + family + ", Âge: " + age + ", Mammifère: " + isMammal;
    }

}

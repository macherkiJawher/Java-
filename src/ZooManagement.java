import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;


    public static void main(String[] args) {
        // ZooManagement zoo = new ZooManagement();
        // System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        scanner.close();
    }

}

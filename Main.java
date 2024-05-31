package herds;

public class Main {
    public static void main(String[] args) {
//        Organism organism = new Organism(5,6);
//        System.out.println(organism);
//        organism.move(10,20);
//        System.out.println(organism);

        Herd herd = new Herd();
        herd.addToHerd(new Organism(40,50));
        herd.addToHerd(new Organism(10,15));
        herd.addToHerd(new Organism(20,30));
        herd.addToHerd(new Organism(15,20));

        System.out.println(herd);
        herd.move(10,10);
        System.out.println(herd);

    }
}

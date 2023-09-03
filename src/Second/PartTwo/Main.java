package Second.PartTwo;

import java.util.ArrayList;
import java.util.List;

import Second.PartTwo.Toys.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Solder frenchSolder = new Solder("Maslina", 300, "Plastic");
        Car hammer = new Car("Hammer", 1200, "Metal", 120);
        Doll barbie = new Doll("Barbie", 200, "Plastic");

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(frenchSolder);
        toys.add(hammer);
        toys.add(barbie);

        ToyStore store = new ToyStore(toys);
        System.out.println("===== All Toys =====");
        store.showStock();
        System.out.println();

        System.out.println("===== Play with Toys =====");
        store.playWithStock();
        System.out.println();

        System.out.println("===== Speakable Toys =====");
        store.showSpeakableToys();
        System.out.println();

        var newStock = store.getStock();

        var lastElement = newStock.size() - 1;
        System.out.println(newStock.get(lastElement).hashCode());
        System.out.println(newStock.get(lastElement).equals(hammer));
    }
}

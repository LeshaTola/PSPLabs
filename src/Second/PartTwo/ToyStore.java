package Second.PartTwo;

import java.util.List;
import Second.PartTwo.Toys.Toy;
import Second.PartTwo.Toys.Interfaces.ISeakable;

public class ToyStore {
    private List<Toy> stock;

    public ToyStore(List<Toy> stock) {
        this.stock = stock;
    }

    public void AddToy(Toy toy) {
        stock.add(toy);
    }

    public void showStock() {
        for (Toy toy : stock) {
            System.out.println(toy.toString() + "\n");
        }
    }

    public void playWithStock() {
        for (Toy toy : stock) {
            toy.play();
        }
    }

    public void showSpeakableToys() {
        for (Toy toy : stock) {
            if (toy instanceof ISeakable)
                ((ISeakable) toy).speak();
        }
    }

    public List<Toy> getStock() {
        return stock;
    }
}

package Third.PartTwo;

import Third.PartTwo.Furniture.Table;
import Third.PartTwo.Furniture.Wardrobe;
import Third.PartTwo.Furniture.BarStool;
import Third.PartTwo.Furniture.Stool;

public class Main {
    public static void main(String[] args) throws Exception {
        Wardrobe wardrobe = new Wardrobe(1, 2, 0.5f);
        Table table = new Table(4, 20);
        BarStool barStool = new BarStool(false, 1, 0.75f);
        Stool stool = new Stool(true, "Yellow", true);

        System.out.println("Prints: ");
        wardrobe.print();
        table.print();
        barStool.print();
        stool.print();

        System.out.println("Manufature: ");
        wardrobe.manufacturerInformation();
        table.manufacturerInformation();
        barStool.manufacturerInformation();
        stool.manufacturerInformation();
    }
}
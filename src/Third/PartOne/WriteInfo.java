package Third.PartOne;

import Third.PartOne.Furniture.*;

public class WriteInfo {
    public static void main(String[] args) {
        // Furniture classicFurniture = new Furniture();
        Chair modernChair = new Chair("Ikea", 120, "Metal and Plastic", true);
        Chair classChair = new Chair("OAO ISGOVNALIK", 60, "Wood", false);
        Wardrobe wardrobe = new Wardrobe(2, 3, 0.5f);
        Table electricTable = new Table("Tesla", 450, "Metal and Wood", 4, 120);

        // classicFurniture.manufacturerInformation();
        modernChair.manufacturerInformation();
        classChair.manufacturerInformation();
        wardrobe.manufacturerInformation();
        electricTable.manufacturerInformation();
    }
}

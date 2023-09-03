package Third.PartTwo.Furniture;

public class Stool extends Chair {

    private String color;
    private boolean isHasArmrests;

    public Stool(boolean isAlignable, String color, boolean isHasArmrests) {
        super(isAlignable);
        this.color = color;
        this.isHasArmrests = isHasArmrests;
    }

    @Override
    public void print() {
        System.out.println("Is alignable: " + isAlignable);
        System.out.println("Color: " + color);
        System.out.println("Has armrests: " + isHasArmrests);
        System.out.println();
    }

    @Override
    public void manufacturerInformation() {
        if (isAlignable) {
            System.out.println("This chair has ability to align");
        } else {
            System.out.println("This chair has classic design");
        }

        if (isHasArmrests) {
            System.out.println("Comfortable armrests.");
        }

        System.out.println("And its pleasant" + color + " color will suit your interior.");
        System.out.println();
    }

}

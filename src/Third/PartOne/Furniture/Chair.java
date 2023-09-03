package Third.PartOne.Furniture;

public class Chair extends Furniture {
    private boolean isAlignable;

    public Chair(String manufacturer, double price, String material, boolean isAlignable) {
        super(manufacturer, price, material);
        this.isAlignable = isAlignable;
    }

    public Chair(boolean isAlignable) {
        this.isAlignable = isAlignable;
    }

    public boolean isAlignable() {
        return isAlignable;
    }

    @Override
    public void manufacturerInformation() {
        super.manufacturerInformation();
        if (isAlignable) {
            System.out.println("This chair has ability to align");
        } else {
            System.out.println("This chair has classic design");
        }
        System.out.println();
    }
}

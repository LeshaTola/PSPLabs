package Third.PartTwo.Furniture;

public class BarStool extends Chair {

    private int legsCount;
    private float height;

    public BarStool(boolean isAlignable, int legsCount, float height) {
        super(isAlignable);
        this.legsCount = legsCount;
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("Is alignable: " + isAlignable);
        System.out.println("Legs Count: " + legsCount);
        System.out.println("Height: " + height);
        System.out.println();
    }

    @Override
    public void manufacturerInformation() {
        if (isAlignable) {
            System.out.println("This chair has ability to align");
        } else {
            System.out.println("This chair has classic design");
        }

        System.out.println("It has incredible stability with only" + legsCount
                + "legs, which is incredible for its height in " + height);
        System.out.println();
    }

}

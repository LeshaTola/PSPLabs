package Third.PartOne.Furniture;

public class Table extends Furniture {
    private int crateCount;
    private float workingArea;

    public Table(String manufacturer, double price, String material, int crateCount, float square) {
        super(manufacturer, price, material);
        this.crateCount = crateCount;
        this.workingArea = square;
    }

    public Table(double price, int crateCount, float workingArea) {
        super(price);
        this.crateCount = crateCount;
        this.workingArea = workingArea;
    }

    public int getCrateCount() {
        return crateCount;
    }

    public float getWorkingArea() {
        return workingArea;
    }

    @Override
    public void manufacturerInformation() {
        super.manufacturerInformation();
        System.out.println("The number of crates in this table is: " + crateCount
                + ", so you will always have a place to put things. And the working area of the table at: "
                + workingArea + " m^2 will allow you not to be distracted from work ");
        System.out.println();
    }
}

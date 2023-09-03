package Third.PartTwo.Furniture;

import Third.PartTwo.Interfaces.IFurniture;
import Third.PartTwo.Interfaces.IObject;

public class Table implements IFurniture, IObject {
    private int crateCount;
    private float workingArea;

    public Table(int crateCount, float workingArea) {
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
        System.out.println("The number of crates in this table is: " + crateCount
                + ", so you will always have a place to put things. And the working area of the table at: "
                + workingArea + " m^2 will allow you not to be distracted from work ");
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("Crate count: " + crateCount);
        System.out.println("Working Area: " + workingArea);
        System.out.println();
    }
}

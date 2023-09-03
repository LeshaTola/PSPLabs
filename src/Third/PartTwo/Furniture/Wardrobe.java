package Third.PartTwo.Furniture;

import Third.PartTwo.Interfaces.IFurniture;
import Third.PartTwo.Interfaces.IObject;

public class Wardrobe implements IFurniture, IObject {
    private float width;
    private float height;
    private float depth;

    public Wardrobe(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private float GetVolume() {
        return height * width * depth;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getDepth() {
        return depth;
    }

    @Override
    public void manufacturerInformation() {
        System.out.println("The volume of this wardrobe is: " + GetVolume() + " m^3, because there is it properties:");
        System.out.println(" Height: " + height);
        System.out.println(" Width: " + width);
        System.out.println(" Depth: " + depth);
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println(" Height: " + height);
        System.out.println(" Width: " + width);
        System.out.println(" Depth: " + depth);
        System.out.println();
    }
}

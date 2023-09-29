package Second.PartOne.Furniture;

public class Wardrobe extends Furniture {
    private float width;
    private float height;
    private float depth;

    public Wardrobe(String manufacturer, double price, String material, float width, float height, float depth) {
        super(manufacturer, price, material);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

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
        super.manufacturerInformation();
        System.out.println("The volume of this wardrobe is: " + GetVolume() + " m^3, because there is it properties:");
        System.out.println(" Height: " + height);
        System.out.println(" Width: " + width);
        System.out.println(" Depth: " + depth);
        System.out.println();
    }
}

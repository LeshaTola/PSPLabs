package Second.PartOne.Furniture;

public class Furniture {
    private String manufacturer;
    private double price;
    private String material;

    public Furniture(String manufacturer, double price, String material) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    public Furniture(double price) {
        this.price = price;
    }

    public Furniture() {
        this.manufacturer = "Unknown";
        this.price = 0.0;
        this.material = "Wood";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public void manufacturerInformation() {
        System.out.println("You can get this furniture form: " + manufacturer
                + " for only: " + price + "$ made from: " + material);
    }
}

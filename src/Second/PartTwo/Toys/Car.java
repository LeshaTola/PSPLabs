package Second.PartTwo.Toys;

public class Car extends Toy {

    public Car(String name, float cost, String material, float speed) {
        super(name, cost, material);
        this.speed = speed;
    }

    private float speed;

    @Override
    public String toString() {
        return super.toString() + " Speed: " + speed;
    }

    @Override
    public void play() {
        System.out.println("Wrrrr");
        System.out.println();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + super.hashCode();
        result = 31 * result + (int) speed;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car other = (Car) obj;

        return toyName.equals(other.toyName)
                && cost == other.cost
                && material.equals(other.material)
                && speed == other.speed;
    }
}

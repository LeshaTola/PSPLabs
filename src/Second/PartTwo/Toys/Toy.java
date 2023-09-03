package Second.PartTwo.Toys;

public abstract class Toy {

    protected String toyName;
    protected float cost;
    protected String material;

    public Toy(String name, float cost, String material) {
        toyName = name;
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Toy name: " + toyName + " Cost: " + cost + " Material: " + material;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + toyName.hashCode();
        result = 31 * result + Float.floatToIntBits(cost);
        result = 31 * result + material.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Toy)) {
            return false;
        }

        Toy other = (Toy) obj;

        return toyName.equals(other.toyName)
                && cost == other.cost
                && material.equals(other.material);
    }

    abstract public void play();

    public float getCost() {
        return cost;
    }

    public String getMaterial() {
        return material;
    }

    public String getToyName() {
        return toyName;
    }
}

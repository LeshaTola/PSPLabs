package First.PartTwo;

public class Employ {
    private String lastName;
    private String firstName;
    private float salary;
    private boolean hasChildren;

    public Employ(String lastName, String firstName, float salary, boolean hasChildren) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    public Employ() {
        lastName = "unknown";
        firstName = "unknown";
        salary = 0;
        hasChildren = false;
    }

    public Employ(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void printFullName() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }

    public void printHasChildren() {
        System.out.println("Children: " + hasChildren);
    }

    // #region setters and getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getSalary() {
        return salary;
    }
    // #endregion
}

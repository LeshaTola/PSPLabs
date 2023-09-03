package First.PartTwo;

public class Employee {
    private String lastName;
    private String firstName;
    private float salary;
    private boolean hasChildren;

    public Employee(String lastName, String firstName, float salary, boolean hasChildren) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    public Employee() {
        lastName = "unknown";
        firstName = "unknown";
        salary = 0;
        hasChildren = false;
    }

    public Employee(String lastName, String firstName) {
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

    public void print() {
        printFullName();
        printSalary();
        printHasChildren();
    }

    public static float averageSalary(Employee[] employs) {
        float sum = 0;
        for (Employee employ : employs) {
            sum += employ.getSalary();
        }
        return sum / employs.length;
    }

    public static int employsWithChildren(Employee[] employs) {
        int count = 0;
        for (Employee employ : employs) {
            if (employ.hasChildren) {
                count++;
            }
        }
        return count;
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

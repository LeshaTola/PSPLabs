package First.PartTwo;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee firsEmploy = new Employee("Tola", "Aleksey", 0, false);

        System.out.println("Printed by Employ:");
        firsEmploy.printFullName();
        firsEmploy.printSalary();
        firsEmploy.printHasChildren();

        Employee secondEmploy = new Employee("Ivanov", "Ivar");
        System.out.println("\nPrinted by WriteInfo:");
        WriteInfo.print(secondEmploy);

        Employee thirdEmploy = new Employee();
        System.out.println("\nPrinted by WriteInfo:");
        WriteInfo.print(thirdEmploy);
    }
}

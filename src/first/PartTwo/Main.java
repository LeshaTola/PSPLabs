package first.PartTwo;

public class Main {
    public static void main(String[] args) throws Exception {
        Employ firsEmploy = new Employ("Tola", "Aleksey", 0, false);

        System.out.println("Printed by Employ:");
        firsEmploy.printFullName();
        firsEmploy.printSalary();
        firsEmploy.printHasChildren();

        Employ secondEmploy = new Employ("Ivanov", "Ivar");
        System.out.println("\nPrinted by WriteInfo:");
        WriteInfo.print(secondEmploy);

        Employ thirdEmploy = new Employ();
        System.out.println("\nPrinted by WriteInfo:");
        WriteInfo.print(thirdEmploy);
    }
}

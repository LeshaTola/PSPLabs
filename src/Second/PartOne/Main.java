package Second.PartOne;

import First.PartTwo.Employee;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] staff = {
                new Employee(),
                new Employee("Tola", "Aleksey"),
                new Employee("Ivanov", "Ivan", 300, true),
                new Employee("Ivanonich", "Jordani", 1000, true)
        };

        for (Employee employ : staff) {
            employ.print();
            System.out.println();
        }

        System.out.println("Average salary: " + Employee.averageSalary(staff));
        System.out.println("Count of emplyes with children: " + Employee.employsWithChildren(staff));
    }
}

package Useless.PartTwo.Toys;

import Useless.PartTwo.Toys.Interfaces.ISeakable;

public class Solder extends Toy implements ISeakable {

    public Solder(String name, float cost, String material) {
        super(name, cost, material);
    }

    @Override
    public void speak() {
        System.out.println("Need more bullets!!!");
        System.out.println("Need more bullets!!!");
        System.out.println("Bigger weapon");
        System.out.println("Thank you sir");
        System.out.println();
    }

    @Override
    public void play() {
        System.out.println("Attack brothers!");
        System.out.println("I got shot");
        System.out.println("Heal me, please");
        System.out.println("Ba Da BOOM");
        System.out.println();
    }
}

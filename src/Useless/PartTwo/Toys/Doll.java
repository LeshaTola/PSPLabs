package Useless.PartTwo.Toys;

import Useless.PartTwo.Toys.Interfaces.ISeakable;

public class Doll extends Toy implements ISeakable {

    public Doll(String name, float cost, String material) {
        super(name, cost, material);

    }

    @Override
    public void speak() {
        System.out.println("My name: " + toyName);
        System.out.println();
    }

    @Override
    public void play() {
        System.out.println("mother 's daughters");
        System.out.println();
    }

}

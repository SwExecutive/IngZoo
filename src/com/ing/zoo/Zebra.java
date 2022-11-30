package com.ing.zoo;

public class Zebra extends Animal implements Herbivore{

    public Zebra(String name) {
        super(name);
        this.animalSpecies = "zebra";

    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.printf("%s the %s says %s.\n", this.name, this.animalSpecies, this.helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.printf("%s the %s eats and says %s.\n", this.name, this.animalSpecies, this.eatText);
    }
}
